from antlr4 import *
from GramaticaVisitor import GramaticaVisitor
from Nodo import Nodo
from TablaSimbolos import TablaSimbolos
import collections
from Simbolo import Simbolo
import Analizador


#CLASE DE ORDEN SEMANTICO PARA EL ANALIZADOR, EN ESTA CLASE SE IMPLEMENTAN LOS VISTOR
#BASICAMENTE SE HACE LA MAGIA DE LA EVALUACION DE EXPRESIONES Y DEMAS ESTRUCTURAS
#AQUI NO SE MANEJA LO DE LA TABLA DE SIMBOLOS, ESO SE HACE EN OTRO LADO 
class GramaticaExtVisitor(GramaticaVisitor):
    
    def __init__(self,an):
        #super(GramaticaExtListener,self)
        self.tablaDeSimbolosActual = TablaSimbolos(None,0)
        self.pilaValores = collections.deque()  
        self.an = an
    
    
    
    #
    #
    #
    #
    # SECCION DE FUNCIONES 
    #
    #
    #
    #
    
    def visitPrint_fun(self,ctx):
        valor = super(GramaticaExtVisitor,self).visit(ctx.test())
        ret = ""
        if valor.tipo == "ITERATOR" and valor.subtipo == "LIST":
            ret = "[";
            for x in valor.valor:
                ret += str(x.valor)+", "
            ret = ret[0:len(ret)-2]
            ret += "]"
        elif valor.tipo == "ITERATOR" and valor.subtipo == "TUPLE":
            ret = "("+str(valor.valor[0].valor)+", "+str(valor.valor[1].valor)+")"
        elif valor.tipo == "ITERATOR" and valor.subtipo == "MAP":
            ret = "{"
            for ky in valor.valor:
                ret += str(ky)+":"+str(valor.valor[ky].valor)+ ", "
            ret += "}"
        else:
            ret = str(valor.valor)
        self.an.agregarRegistro(str(ret))
    
    
    
    def visitFuncdef(self, ctx):
        simbolo = Simbolo(ctx.NAME(),"FUNCION",ctx.funcBody())
        simbolo.argumentos = []
        if ctx.args() != None:
            simbolo.argumentos.append(ctx.args().NAME())
            if len(ctx.args().sub_args()) > 0:
                for argtmp in ctx.args().sub_args(): 
                    simbolo.argumentos.append( argtmp.NAME() )
        simbolo.parametrosLambda = ctx.lambdaParamet()
        self.tablaDeSimbolosActual.agregarSimbolo(ctx.NAME(), simbolo)
    
    
    def visitFuncBodyNormal(self, ctx):
        return self.evaluarInstrucciones(ctx.stmt())
    
    def visitFuncBodyMatch(self, ctx):
        self.pilaValores.append(str(ctx.NAME()))
        for mst in ctx.match_stmt():
            r = super(GramaticaExtVisitor,self).visit(mst)
            if r != None:
                return r
        self.pilaValores.pop()
    
    def visitMatch_stmt(self, ctx):
        nombre = self.pilaValores.pop()
        self.pilaValores.append(nombre)
        valor = super(GramaticaExtVisitor,self).visit(ctx.test())
        simbolo = self.tablaDeSimbolosActual.resolver(nombre)
        if simbolo.tipo == valor.tipo and simbolo.valor == valor.valor:
            ret = self.evaluarInstrucciones(ctx.stmt())
            if ret != None:
                return ret
        return None
    
    def visitFunc_call(self, ctx):
        return self.evaluarFuncion(ctx)
        
    #
    #
    #
    #
    # SECCION DE BLOQUES DE CONTROL Y FLUJO
    #
    #
    #
    #
    
    def visitIf_stmt(self, ctx):
        cond = super(GramaticaExtVisitor,self).visit(ctx.test())
        if self.evaluarIf(cond,ctx.stmt()) :
            return None
        if len(ctx.elif_stmt()) > 0:
            for nodo_elif in ctx.elif_stmt():
                cond = super(GramaticaExtVisitor,self).visit(nodo_elif.test())
                if self.evaluarIf(cond,nodo_elif.stmt()):
                    return None
        if ctx.else_stmt() != None:
            nodo = Nodo()
            nodo.tipo = "BOOL"
            nodo.valor = True
            self.evaluarIf(nodo,ctx.else_stmt().stmt())
        return None
    
    
    def visitWhile_stmt(self, ctx):
        valor = super(GramaticaExtVisitor,self).visit(ctx.test())
        if valor.tipo != "BOOL":
            ln = -1
            self.raiseError(ln, 'La expresion del while debe ser de tipo logica', "logic-expected")
        while valor.valor :
            self.evaluarInstrucciones(ctx.stmt())
            valor = super(GramaticaExtVisitor,self).visit(ctx.test())
        return None
    
    def visitBreak_stmt(self, ctx):
        nodo = Nodo()
        nodo.tipo = "BREAK"
        return nodo
    
    def visitContinue_stmt(self, ctx):
        nodo = Nodo()
        nodo.tipo = "CONTINUE"
        return nodo
    
    def visitReturn_stmt(self, ctx):
        return super(GramaticaExtVisitor,self).visit(ctx.test())
    
    def visitAssig_stmtVar(self, ctx):
        valor = super(GramaticaExtVisitor,self).visit(ctx.test())
        simbolo = Simbolo(ctx.NAME(),valor.tipo,valor.valor)
        simbolo.subtipo = valor.subtipo
        self.tablaDeSimbolosActual.agregarSimbolo(ctx.NAME(), simbolo)
        return None
    
    def visitAssig_stmtIterable(self, ctx):
        simbolo = self.tablaDeSimbolosActual.resolver(ctx.NAME())
        if simbolo == None:
            ln = -1
            self.raiseError(ln, 'No se ha encontrado el simbolo', ctx.NAME())
        elif simbolo.tipo != "ITERATOR":
            ln = -1
            self.raiseError(ln, 'El simbolo es no iterable', "iterable-expected")
        indice = super(GramaticaExtVisitor,self).visit(ctx.test(0))
        valor = super(GramaticaExtVisitor,self).visit(ctx.test(1))
        simbolo.valor[indice] = valor
        return None
    
    def visitFor_stmt(self, ctx):
        nm = ctx.NAME()
        iterab = super(GramaticaExtVisitor,self).visit(ctx.iterable())
        if iterab == None:
            ln = -1
            self.raiseError(ln, 'No es posible obtener el iterable', "iterable-gen")
        elif iterab.tipo != "ITERATOR":
            ln = -1
            self.raiseError(ln, 'El simbolo no es iterable', "iterable-expected")
        elif iterab.subtipo == "TUPLE":
            ln = -1
            self.raiseError(ln, 'No es posible realizar un recorrido sobre una tupla', "iterable-tuple")
        self.tablaDeSimbolosActual = TablaSimbolos(self.tablaDeSimbolosActual,self.tablaDeSimbolosActual.contexto)
        self.tablaDeSimbolosActual.agregarSimbolo(nm,Simbolo(nm,None,None))
        for tmp in iterab.valor:
            self.tablaDeSimbolosActual.agregarSimbolo(nm,Simbolo(nm,tmp.tipo,tmp.valor))
            self.evaluarInstrucciones(ctx.stmt())
        self.tablaDeSimbolosActual = self.tablaDeSimbolosActual.destruirTabla()
        
    
    #
    #
    #
    #
    # SECCION DEFINICION ITERABLES
    #
    #
    #
    #
    
    def visitIterable_list(self, ctx):
        nodo = Nodo()
        nodo.tipo = "ITERATOR"
        nodo.subtipo = "LIST"
        nodo.valor = []
        if ctx.list_element() != None:
            valor = super(GramaticaExtVisitor,self).visit(ctx.list_element().test())
            nodo.valor.append(valor)
        if ctx.list_element() != None and ctx.list_element().sublist_element() != None:
            for el in ctx.list_element().sublist_element():
                valor = super(GramaticaExtVisitor,self).visit(el.test())
                nodo.valor.append(valor)
        return nodo
    
    def visitIterable_map(self, ctx):
        nodo = Nodo()
        nodo.tipo = "ITERATOR"
        nodo.subtipo = "MAP"
        nodo.valor = {}
        if ctx.map_element() != None:
            indice = super(GramaticaExtVisitor,self).visit(ctx.map_element().test(0))
            valor = super(GramaticaExtVisitor,self).visit(ctx.map_element().test(1))
            nodo.valor[indice.valor] = valor
        if ctx.map_element() != None and ctx.map_element().submap_element() != None:
            for el in ctx.map_element().submap_element():
                indice = super(GramaticaExtVisitor,self).visit(el.test(0))
                valor = super(GramaticaExtVisitor,self).visit(el.test(1))
                nodo.valor[indice.valor] = valor
        return nodo
    
    def visitIterable_tuple(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.test(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.test(1))
        nodo = Nodo()
        nodo.tipo = "ITERATOR"
        nodo.subtipo = "TUPLE"
        nodo.valor = (valorI,valorD)
        return nodo
    
    def visitIterable_generate(self, ctx):
        valor = super(GramaticaExtVisitor,self).visit(ctx.test())
        if valor.tipo == "INTEGER":
            nodo = Nodo()
            nodo.tipo = "ITERATOR"
            nodo.subtipo = "LIST"
            nodo.valor = []
            for x in xrange(valor.valor):
                tmp = Nodo()
                tmp.tipo = "INTEGER"
                tmp.valor = x
                nodo.valor.append(tmp)
            return nodo
        elif valor.tipo == "STRING":
            nodo = Nodo()
            nodo.tipo = "ITERATOR"
            nodo.subtipo = "LIST"
            nodo.valor = []
            for x in valor.valor:
                tmp = Nodo()
                tmp.valor = x
                tmp.tipo = "STRING"
                nodo.valor.append(tmp)
            return nodo
        else:
            ln = -1
            self.raiseError(ln, 'Error en el generador, este debe ser de tipo cadena o entero', "non-iterable")
    
    def visitIterable_filter(self, ctx):
        iterab = super(GramaticaExtVisitor,self).visit(ctx.iterable())
        if iterab == None:
            ln = -1
            self.raiseError(ln, 'Error al evaluar el iterador', "iterator-eval")
        if iterab.tipo != "ITERATOR":
            ln = -1
            self.raiseError(ln, 'El objeto especificado no es de tipo iterable', "iterable-expected")
        if iterab.subtipo == "TUPLE":
            ln = -1
            self.raiseError(ln, 'No es posible realizar un recorrido sobre una tupla', "iterable-tuple")
        filtrada = None
        if iterab.subtipo == "LIST":
            filtrada = []
        else:
            filtrada = {}
        self.tablaDeSimbolosActual = TablaSimbolos(self.tablaDeSimbolosActual,self.tablaDeSimbolosActual.contexto)   
        for tmp in iterab.valor:
            ac = None
            ty = None
            if iterab.subtipo == "LIST":
                ac = tmp.valor
                ty = tmp.tipo
            else:
                ac = iterab.valor[tmp].valor
                ty = iterab.valor[tmp].tipo
            simbolo = Simbolo(ctx.lambda_test().NAME(),ty,ac)
            self.tablaDeSimbolosActual.agregarSimbolo(simbolo.nombre, simbolo)
            res = super(GramaticaExtVisitor,self).visit(ctx.lambda_test().test())
            if res.tipo != "BOOL":
                ln = -1
                self.raiseError(ln, 'No es posible filtrar bajo la funcion especificada', "lambda-filter-error")
            if res.valor == True and iterab.subtipo == "LIST":
                filtrada.append(tmp)
            elif res.valor == True and iterab.subtipo =="MAP":
                filtrada[tmp] = iterab.valor[tmp]
        self.tablaDeSimbolosActual = self.tablaDeSimbolosActual.destruirTabla()
        nodo = Nodo()
        nodo.subtipo = iterab.subtipo
        nodo.tipo = "ITERATOR"
        nodo.valor = filtrada
        print(nodo)
        return nodo
        
    def visitIterable_partition(self, ctx):
        pass
    
    def visitIterable_name(self,ctx):
        valor = self.tablaDeSimbolosActual.resolver(ctx.NAME())
        if valor == None:
            ln = -1
            self.raiseError(ln, 'El simbolo no se ha encontrado', ctx.NAME())
        if valor.tipo != "ITERATOR":
            ln = -1
            self.raiseError(ln, 'El nombre no es de tipo iterador', ctx.NAME())
        
        nodo = Nodo()
        nodo.tipo = valor.tipo
        nodo.subtipo = valor.subtipo
        nodo.valor = valor.valor
        return nodo
    
    
    def unirIterables(self,iterab1,iterab2):
        if iterab1 == None or iterab2 == None:
            ln = -1
            self.raiseError(ln, "No se han proporcionado elementos para operar", "operators-expected")
        if iterab1.tipo != "ITERATOR" or iterab2.tipo != "ITERATOR":
            ln = -1
            self.raiseError(ln, "Se han proporcionado tipos no iterables", "iterable-expected")
        if iterab1.subtipo == "MAP" or iterab2.subtipo == "MAP":
            if iterab1.subtipo == "MAP" and iterab2.subtipo == "MAP":
                nodo = Nodo()
                nodo.tipo = "ITERATOR"
                nodo.subtipo = "MAP"
                nodo.valor = {}
                for k in iterab2.valor:
                    nodo.valor[k] = iterab2.valor[k]
                for k in iterab1.valor:
                    nodo.valor[k] = iterab1.valor[k]
                return nodo
            elif iterab1.subtipo == "TUPLE" and iterab2.subtipo == "MAP":
                nodo = Nodo()
                nodo.tipo = "ITERATOR"
                nodo.subtipo = "MAP"
                nodo.valor = iterab2.valor
                nodo.valor[iterab1.valor[0].valor] = iterab1.valor[1]
                return nodo
            else:
                ln = -1
                self.raiseError(ln, "No es posible concatenar un mapa con algun otro iterable", "tuple,map-expected")
        nodo = Nodo()
        nodo.tipo = "ITERATOR"
        nodo.subtipo = "LIST"
        nodo.valor = []
        for k in iterab1.valor:
            nodo.valor.append(k)
        for k in iterab2.valor:
            nodo.valor.append(k)
        return nodo
            
    def visitIterable_addition(self,ctx):
        vl = super(GramaticaExtVisitor,self).visit(ctx.iterable(0))
        iterab = super(GramaticaExtVisitor,self).visit(ctx.iterable(1))
        if iterab == None or vl == None:
            ln = -1
            self.raiseError(ln, "No se han proporcionado elementos para operar", "operators-expected")
        if iterab.tipo != "ITERATOR":
            ln = -1
            self.raiseError(ln, "No es posible realizar esta operacion sobre un elemento no iterable", "iterable-expected")
        if vl.tipo == "ITERATOR":
            return self.unirIterables(vl, iterab)
        if iterab.tipo == "MAP":
            ln = -1
            self.raiseError(ln, "No es posible agregar ese elemento en un mapa", "tuple,map-expected")
        nodo = Nodo()
        nodo.tipo = "ITERATOR"
        nodo.subtipo = "LIST"
        nodo.valor = [vl] + iterab.valor
        return nodo
         
    #
    #
    #
    #
    #SECCION DE COMPARACIONES Y TEST LOGICOS
    #
    #
    #
    #
    
    def visitTestAnd(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.test(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.test(1))
        nodo = Nodo()
        print(valorI)
        print(valorD)
        if valorI.tipo == "BOOL" and valorD.tipo == "BOOL":
            nodo.tipo = "BOOL"
            nodo.valor = valorI.valor and valorD.valor
            print(nodo.valor)
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion and-test")
        return nodo
    
    def visitTestOr(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.test(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.test(1))
        nodo = Nodo()
        if valorI.tipo == "BOOL" and valorD.tipo == "BOOL":
            nodo.tipo = "BOOL"
            nodo.valor = valorI.valor or valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion or-test")
        return nodo
        
    def visitTestNot(self, ctx):
        valor = super(GramaticaExtVisitor,self).visit(ctx.test(0))
        nodo = Nodo()
        if valor.tipo == "BOOL":
            nodo.tipo = "BOOL"
            nodo.valor = not valor.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion not-test")
        return nodo
    
    def visitTestExprComp(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        nodo.tipo = "BOOL"
        op = ctx.comp_op().getText()
        if valorI.tipo == "ITERATOR" or valorD.tipo == "ITERATOR":
            ln = -1
            self.raiseError(ln, "No es posible realizar este tipo de operacion con elementos iterables", "primitive-expected")
        if op == "<":
            nodo.valor = valorI.valor < valorD.valor
        elif op == ">":
            nodo.valor = valorI.valor > valorD.valor
        elif op == "==":
            nodo.valor = valorI.valor == valorD.valor
        elif op == ">=":
            nodo.valor = valorI.valor >= valorD.valor
        elif op == "<=":
            nodo.valor = valorI.valor <= valorD.valor
        elif op == "<>":
            nodo.valor = valorI.valor <> valorD.valor
        elif op == "!=":
            print(valorI)
            print(valorD)
            nodo.valor = valorI.valor != valorD.valor
        return nodo
    
    def visitTest_iterable_in(self,ctx):
        vl = super(GramaticaExtVisitor,self).visit(ctx.test())
        iterab = super(GramaticaExtVisitor,self).visit(ctx.iterable())
        if iterab == None or vl == None:
            ln = -1
            self.raiseError(ln, "No se han proporcionado elementos para operar", "operators-expected")
        if iterab.tipo != "ITERATOR":
            ln = -1
            self.raiseError(ln, "No es posible realizar esta operacion sobre un elemento no iterable", "iterable-expected")
        nodo = Nodo()
        nodo.tipo = "BOOL"
        nodo.valor = False
        for t in iterab:
            if t.tipo == vl.tipo and t.valor == vl.valor:
                nodo.valor = True
                return nodo
        return nodo
    #
    #
    #
    #
    #SECCION DE OPERADORES ARITMETICOS, SE DEBE TENER EN CUENTA EL TIPO DE OPERANDOS PARA ESTA PARTE
    #
    #
    #
    #
        
    def visitExprPower(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if self.numerico(valorI) and self.numerico(valorD):
            if valorI.tipo == "FLOAT" or valorD.tipo == "FLOAT":
                nodo.tipo = "FLOAT"
            else:
                nodo.tipo = "INTEGER"      
            nodo.valor = valorI.valor ** valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion potencia")
        return nodo
    
    def visitExprMultiply(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if self.numerico(valorI) and self.numerico(valorD):
            if valorI.tipo == "FLOAT" or valorD.tipo == "FLOAT":
                nodo.tipo = "FLOAT"
            else:
                nodo.tipo = "INTEGER"      
            nodo.valor = valorI.valor * valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion multiplicacion")
        return nodo
    
    def visitExprDivision(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if self.numerico(valorI) and self.numerico(valorD):
            if valorI.tipo == "FLOAT" or valorD.tipo == "FLOAT":
                nodo.tipo = "FLOAT"
            else:
                nodo.tipo = "INTEGER"      
            nodo.valor = valorI.valor / valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion division")
        return nodo
    
    def visitExprModule(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor % valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion modulo")
        return nodo
    
    def visitExprPlus(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if self.numerico(valorI) and self.numerico(valorD):
            if valorI.tipo == "FLOAT" or valorD.tipo == "FLOAT":
                nodo.tipo = "FLOAT"
            else:
                nodo.tipo = "INTEGER"      
            nodo.valor = valorI.valor + valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion suma")
        return nodo
    
    def visitExprMinus(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if self.numerico(valorI) and self.numerico(valorD):
            if valorI.tipo == "FLOAT" or valorD.tipo == "FLOAT":
                nodo.tipo = "FLOAT"
            else:
                nodo.tipo = "INTEGER"      
            nodo.valor = valorI.valor - valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion resta")
        return nodo
    
    def visitExprShiftLeft(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor << valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion shift-left")
        return nodo
    
    def visitExprShiftRight(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor >> valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion shift-right")
        return nodo
    
    def visitExprAnd(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor & valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion bit-and")
        return nodo
    
    def visitExprOr(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor | valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion bit-or")
        return nodo
    
    def visitExprXor(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor ^ valorD.valor
        else:
            ln = -1
            self.raiseError(ln, 'Error en los operandos', "Operacion bit-xor")
        return nodo
    
    #
    #
    #
    #
    #LISTENER PARA LOS VALORES ATOMICOS
    #
    #
    #
    #
    
    def visitAtomName(self, ctx):
        nodo = Nodo()
        valor = self.evaluarSimbolo(ctx.NAME())
        nodo.tipo = valor.tipo
        nodo.valor = valor.valor
        nodo.subtipo = valor.subtipo
        #self.pilaValores.append(nodo)
        return nodo
    
    def visitAtomString(self, ctx):
        nodo = Nodo()
        nodo.valor = str(ctx.STRING())
        nodo.valor = nodo.valor[1:len(nodo.valor)-1]
        nodo.tipo = "STRING"
        #self.pilaValores.append(nodo)
        return nodo
        
    def visitAtomNone(self, ctx):
        nodo = Nodo()
        nodo.valor = None
        nodo.tipo = "NONE"
        #self.pilaValores.append(nodo)
        return nodo
        
    def visitAtomTrue(self, ctx):
        nodo = Nodo()
        nodo.valor = True
        nodo.tipo = "BOOL"
        #self.pilaValores.append(nodo)
        return nodo
        
    def visitAtomFalse(self, ctx):
        nodo = Nodo()
        nodo.valor = False
        nodo.tipo = "BOOL"
        #self.pilaValores.append(nodo)
        return nodo
     
    def visitAtomFuncCall(self, ctx):
        return self.evaluarFuncion(ctx)

    def visitAtomIterableAccess(self, ctx):
        simbolo = self.tablaDeSimbolosActual.resolver(ctx.NAME())
        if simbolo == None:
            ln = -1
            self.raiseError(ln, 'Simbolo no encontrado', ctx.NAME())
        elif simbolo.tipo != "ITERATOR":
            ln = -1
            self.raiseError(ln, 'El objeto no es interable', ctx.NAME())
        indice = super(GramaticaExtVisitor,self).visit(ctx.test())
        return simbolo.valor[indice.valor]
        
    
    def visitAtomIterableDef(self, ctx):
        return super(GramaticaExtVisitor,self).visit(ctx.iterable())
        
    #
    #
    #
    #
    #LISTENER PARA LOS VALORES NUMERICOS
    #
    #
    #
    #
    
    def visitNumberInteger(self, ctx):
        valor = int(ctx.integer().getText())
        nodo = Nodo()
        nodo.valor = valor
        nodo.tipo = "INTEGER"
        #self.pilaValores.append(nodo)
        return nodo
        
    def visitNumberFloat(self, ctx):
        valor = float(ctx.FLOAT_NUMBER().getText())
        nodo = Nodo()
        nodo.valor = valor
        nodo.tipo = "FLOAT"
        #self.pilaValores.append(nodo)
        return nodo
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    #
    #
    #
    #
    # UTILIDADES VARIAS
    #
    #
    #
    # 
    
    def evaluarSimbolo(self,nombre):
        valor = self.tablaDeSimbolosActual.resolver(nombre)
        if valor == None:
            ln = -1
            self.raiseError(ln, 'Error simbolo no encontrado', nombre)
        return valor
    
    
    def numerico(self,nodo):
        return nodo.tipo == "INTEGER" or nodo.tipo == "FLOAT"
    
    
    def evaluarIf(self,nodo,instrucciones):
        if nodo.tipo == "BOOL" and nodo.valor == True:
            self.evaluarInstrucciones(instrucciones)
            return True
        return False
    
    def evaluarInstrucciones(self,instrucciones):
        for inst in instrucciones:
            r = super(GramaticaExtVisitor,self).visit(inst)
            if inst.flow_stmt() != None and inst.flow_stmt().return_stmt() != None:
                return r
        return None
    
    def evaluarArgumento(self,arg):
        valor = super(GramaticaExtVisitor,self).visit(arg)
        return (valor.tipo,valor.valor)
    
    def evaluarFuncion(self,ctx):
        simbolo = self.tablaDeSimbolosActual.resolver(ctx.NAME())
        if simbolo == None:
            ln = -1
            self.raiseError(ln, 'Error en el simbolo', ctx.NAME())
        if simbolo.tipo != "FUNCION":
            ln = -1
            self.raiseError(ln,'Error, el simbolo no puede ser evaluado como una funcion',ctx.NAME())
        parametros = []
        if ctx.parameters() != None :
            parametros.append(ctx.parameters().test())
            if len( ctx.parameters().sub_parameters() ) > 0:
                for param in ctx.parameters().sub_parameters():
                    parametros.append(param.test())
        
        if len(parametros) != len(simbolo.argumentos ):
            ln = -1
            self.raiseError(ln, "Error en la cantidad de parametros", ctx.NAME())
        nuevaTablaSimbolos  = TablaSimbolos(self.tablaDeSimbolosActual,self.tablaDeSimbolosActual.contexto+1)
        for i in xrange(0,len(parametros)):
            argument = self.evaluarArgumento(parametros[i])
            simboloNuevo = Simbolo(simbolo.argumentos[i],argument[0],argument[1])
            nuevaTablaSimbolos.agregarSimbolo(simbolo.argumentos[i], simboloNuevo)
        self.tablaDeSimbolosActual = nuevaTablaSimbolos
        r = super(GramaticaExtVisitor,self).visit(simbolo.valor)
        self.tablaDeSimbolosActual = self.tablaDeSimbolosActual.destruirTabla()
        if r != None:
            return r;
        return None
    
    def raiseError(self,ln,msg,smb):
        ret = "Airi dice: Error en la linea "+str(ln)+" se ha producido el siguiente error: "+str(msg)+" con el simbolo: "+str(smb)+", por favor revise la entrada"
        raise RuntimeError(ret)
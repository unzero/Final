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
        self.an.agregarRegistro(str(valor.valor))
    
    
    
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
        print(str(self.tablaDeSimbolosActual))
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
        if len(ctx.else_stmt()) > 0:
            nodo = Nodo()
            nodo.tipo = "BOOL"
            nodo.valor = True
            self.evaluarIf(nodo,ctx.else_stmt().stmt())
        return None
    
    
    def visitWhile_stmt(self, ctx):
        valor = super(GramaticaExtVisitor,self).visit(ctx.test())
        if valor.tipo != "BOOL":
            raise RuntimeError('La expresion debe ser logica')
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
        print(str(self.tablaDeSimbolosActual))
        return super(GramaticaExtVisitor,self).visit(ctx.test())
    
    def visitAssig_stmtVar(self, ctx):
        valor = super(GramaticaExtVisitor,self).visit(ctx.test())
        simbolo = Simbolo(ctx.NAME(),valor.tipo,valor.valor)
        simbolo.subtipo = valor.subtipo
        self.tablaDeSimbolosActual.agregarSimbolo(ctx.NAME(), simbolo)
        print(str(self.tablaDeSimbolosActual))
        return None
    
    def visitAssig_stmtIterable(self, ctx):
        simbolo = self.tablaDeSimbolosActual.resolver(ctx.NAME())
        if simbolo == None:
            raise RuntimeError('Error, no se encontro el simbolo')
        elif simbolo.tipo != "ITERATOR":
            raise RuntimeError('Error, no es de tipo iterable')
        
        indice = super(GramaticaExtVisitor,self).visit(ctx.test(0))
        valor = super(GramaticaExtVisitor,self).visit(ctx.test(1))
        simbolo.valor[indice] = valor
        return None
    
    def visitFor_stmt(self, ctx):
        nm = ctx.NAME()
        iterab = super(GramaticaExtVisitor,self).visit(ctx.iterable())
        if iterab == None:
            pass
        elif iterab.tipo != "ITERATOR":
            raise RuntimeError('El simbolo no es iterable')
        elif iterab.subtipo == "TUPLE":
            raise RuntimeError('No se recomienda iterar sobre tuplas')
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
            #print(str(indice.tipo))
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
            raise RuntimeError('Error en el generador, este debe ser de tipo cadena')
    
    def visitIterable_filter(self, ctx):
        iterab = super(GramaticaExtVisitor,self).visit(ctx.iterable())
        if iterab == None:
            raise RuntimeError('Error el evaluar la lista')
        if iterab.tipo != "ITERATOR":
            raise RuntimeError('Error, el objeto no es iterable')
        if iterab.subtipo == "TUPLE":
            raise RuntimeError('No es posible realizar un recorrido sobre una tupla')
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
            #print(self.tablaDeSimbolosActual)
            res = super(GramaticaExtVisitor,self).visit(ctx.lambda_test().test())
            #print(res)
            if res.tipo != "BOOL":
                raise RuntimeError('Error, no es posible filtrar bajo esa funcion')
            if res.valor == True and iterab.subtipo == "LIST":
                filtrada.append(tmp)
            elif res.valor == True and iterab.subtipo =="MAP":
                filtrada[tmp] = iterab.valor[tmp]
        self.tablaDeSimbolosActual = self.tablaDeSimbolosActual.destruirTabla()
        nodo = Nodo()
        nodo.subtipo = iterab.subtipo
        nodo.tipo = "ITERATOR"
        nodo.valor = filtrada
        return nodo
        
    def visitIterable_partition(self, ctx):
        pass
    
    def visitIterable_name(self,ctx):
        valor = self.tablaDeSimbolosActual.resolver(ctx.NAME())
        if valor == None:
            raise RuntimeError('Error, simbolo no encontrado')
        
        if valor.tipo != "ITERATOR":
            raise RuntimeError('Error, el nombre no es de tipo iterador')
        
        nodo = Nodo()
        nodo.tipo = valor.tipo
        nodo.subtipo = valor.subtipo
        nodo.valor = valor.valor
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
        if valorI.tipo == "BOOL" and valorD.tipo == "BOOL":
            nodo.tipo = "BOOL"
            nodo.valor = valorI.valor and valorD.tipo
        else:
            raise RuntimeError('Error en los operandos')
        return nodo
    
    def visitTestOr(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.test(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.test(1))
        nodo = Nodo()
        if valorI.tipo == "BOOL" and valorD.tipo == "BOOL":
            nodo.tipo = "BOOL"
            nodo.valor = valorI.valor or valorD.tipo
        else:
            raise RuntimeError('Error en los operandos')
        return nodo
        
    def visitTestNot(self, ctx):
        valor = super(GramaticaExtVisitor,self).visit(ctx.test(0))
        nodo = Nodo()
        if valor.tipo == "BOOL":
            nodo.tipo = "BOOL"
            nodo.valor = not valor.valor
        else:
            raise RuntimeError('Error en los operandos')
        return nodo
    
    def visitTestExprComp(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        nodo.tipo = "BOOL"
        op = ctx.comp_op().getText()
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
            nodo.valor = valorI.valor != valorD.valor
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
            raise RuntimeError('Error en los operandos')
        print("NUEVA POTENCIA: "+str(nodo))
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
            raise RuntimeError('Error en los operandos')
        print("NUEVA MULTIPLICACION: "+str(nodo))
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
            raise RuntimeError('Error en los operandos')
        print("NUEVA DIVISION: "+str(nodo))
        return nodo
    
    def visitExprModule(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor % valorD.valor
        else:
            raise RuntimeError('Error en los operandos')
        print("NUEVO MODULO: "+str(nodo))
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
            raise RuntimeError('Error en los operandos')
        print("NUEVA SUMA: "+str(nodo))
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
            raise RuntimeError('Error en los operandos')
        print("NUEVA RESTA: "+str(nodo))
        return nodo
    
    def visitExprShiftLeft(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor << valorD.valor
        else:
            raise RuntimeError('Error en los operandos')
        print("NUEVO SHIFT LEFT: "+str(nodo))
        return nodo
    
    def visitExprShiftRight(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor >> valorD.valor
        else:
            raise RuntimeError('Error en los operandos')
        #print("NUEVO SHIFT RIGHT: "+str(nodo))
        return nodo
    
    def visitExprAnd(self, ctx):
        valorI = super(GramaticaExtVisitor,self).visit(ctx.expr(0))
        valorD = super(GramaticaExtVisitor,self).visit(ctx.expr(1))
        nodo = Nodo()
        if valorI.tipo == "INTEGER" or valorD.tipo == "INTEGER":
            nodo.tipo = "INTEGER"     
            nodo.valor = valorI.valor & valorD.valor
        else:
            raise RuntimeError('Error en los operandos')
        print("NUEVO AND: "+str(nodo))
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
        #print("Solicitud atomica")
        #print(str(self.tablaDeSimbolosActual))
        nodo = Nodo()
        valor = self.evaluarSimbolo(ctx.NAME())
        nodo.tipo = valor[0]
        nodo.valor = valor[1]
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
            raise RuntimeError('Simbolo no encontrado')
        elif simbolo.tipo != "ITERATOR":
            raise RuntimeError('El objeto no es iterable')
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
            raise RuntimeError('Error Simbolo no encontrado: '+str(nombre))
        return (valor.tipo,valor.valor)
    
    
    def numerico(self,nodo):
        return nodo.tipo == "INTEGER" or nodo.tipo == "FLOAT"
    
    
    def evaluarIf(self,nodo,instrucciones):
        if nodo.tipo == "BOOL" and nodo.valor == True:
            self.evalurInstrucciones(instrucciones)
            return True
        return False
    
    def evaluarInstrucciones(self,instrucciones):
        for inst in instrucciones:
            r = super(GramaticaExtVisitor,self).visit(inst)
            print(str(r))
            if inst.flow_stmt() != None and inst.flow_stmt().return_stmt() != None:
                return r
        return None
    
    def evaluarArgumento(self,arg):
        valor = super(GramaticaExtVisitor,self).visit(arg)
        return (valor.tipo,valor.valor)
    
    def evaluarFuncion(self,ctx):
        simbolo = self.tablaDeSimbolosActual.resolver(ctx.NAME())
        if simbolo == None:
            raise RuntimeError('Error en el simbolo')
        if simbolo.tipo != "FUNCION":
            raise RuntimeError('Error, el simbolo no puede ser evaluado como una funcion')
        parametros = []
        if ctx.parameters() != None :
            parametros.append(ctx.parameters().test())
            if len( ctx.parameters().sub_parameters() ) > 0:
                for param in ctx.parameters().sub_parameters():
                    parametros.append(param.test())
        
        if len(parametros) != len(simbolo.argumentos ):
            raise RuntimeError('Error en la cantidad de parametros')
        nuevaTablaSimbolos  = TablaSimbolos(self.tablaDeSimbolosActual,self.tablaDeSimbolosActual.contexto+1)
        for i in xrange(0,len(parametros)):
            argument = self.evaluarArgumento(parametros[i])
            print(str(simbolo.argumentos[i]))
            simboloNuevo = Simbolo(simbolo.argumentos[i],argument[0],argument[1])
            print(str(simboloNuevo))
            nuevaTablaSimbolos.agregarSimbolo(simbolo.argumentos[i], simboloNuevo)
        self.tablaDeSimbolosActual = nuevaTablaSimbolos
        r = super(GramaticaExtVisitor,self).visit(simbolo.valor)
        self.tablaDeSimbolosActual = self.tablaDeSimbolosActual.destruirTabla()
        if r != None:
            return r;
        return None
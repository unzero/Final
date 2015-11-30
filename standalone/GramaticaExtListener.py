from Nodo import Nodo
from antlr4 import *
from GramaticaListener import GramaticaListener
import collections
from TablaSimbolos import TablaSimbolos
from Simbolo import Simbolo

class GramaticaExtListener(GramaticaListener):
    #valoresEvaluados = collections.deque
    #tablaDeSimbolosActual = TablaSimbolos()
    def __init__(self):
        self.contextoActual = 0
        self.pilaValores = collections.deque()
        self.tablaDeSimbolosActual = TablaSimbolos(None,0)
        
    
    #
    #
    #
    #
    # ESTRUCTURAS DE FLUJO Y CONTROL
    #
    #
    #
    #
    
    def exitIf_stmt(self, ctx):
        print("Nuevo if")
        valorTest = self.pilaValores.pop()
        print(valorTest.valor)
        print(len(ctx.elif_stmt()[0].stmt()))
        
        
    
     
    
    def exitAssig_stmt(self, ctx):
        nodo = self.pilaValores.pop()
        print(ctx.NAME().getText())
        simbolo = Simbolo(ctx.NAME(),nodo.tipoValor,nodo.valor)
        self.tablaDeSimbolosActual.agregarSimbolo(ctx.NAME(), simbolo)
        print("Nuevo Simbolo: "+str(simbolo))
    
    #
    #
    #
    #
    #SECCION DE COMPARACIONES Y TEST LOGICOS
    #
    #
    #
    #
    
    def exitOrTest(self, ctx):
        if len(ctx.and_test()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if valorD.tipoValor == "BOOL" and valorI.tipoValor == "BOOL":
                nodo = Nodo()
                nodo.tipoValor = "BOOL"
                nodo.valor = valorD.valor or valorI.valor
                self.pilaValores.append(nodo)
                print("Nuevo ORT: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo logico')   
    
    def exitAndTest(self, ctx):
        if len(ctx.not_test()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if valorD.tipoValor == "BOOL" and valorI.tipoValor == "BOOL":
                nodo = Nodo()
                nodo.tipoValor = "BOOL"
                nodo.valor = valorD.valor and valorI.valor
                self.pilaValores.append(nodo)
                print("Nuevo ORT: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo logico') 
    
    def exitNotExpr(self, ctx):
        nodo = self.pilaValores.pop()
        if nodo.tipoValor == "BOOL":
            nodo.valor = not nodo.valor
            self.pilaValores.append(nodo)
            print("Nuevo NOT: "+str(nodo.valor))
        else:
            raise RuntimeError('Error en los operandos, deben ser de tipo logico')
    
    
    
    def exitComparisonEval(self, ctx):
        valorI = self.pilaValores.pop()
        valorD = self.pilaValores.pop()
        nodo = Nodo()
        
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
             
        nodo.tipoValor = "BOOL"
        self.pilaValores.append(nodo)
        print("Nueva compracion: "+str(nodo.valor))
    
    
    
    #
    #
    #
    #
    #SECCION DE OPERADORES ARITMETICOS, SE DEBE TENER EN CUENTA EL TIPO DE OPERANDOS PARA ESTA PARTE
    #
    #
    #
    #
        
    def exitAndExpr(self, ctx):
        if len(ctx.or_expr()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if valorD.tipoValor == "INTEGER" and valorI.tipoValor == "INTEGER":
                nodo = Nodo()
                nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor & valorI.valor
                self.pilaValores.append(nodo)
                print("Nuevo and: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo entero')   
        
    def exitOrExpr(self, ctx):
        if len(ctx.xor_expr()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if valorD.tipoValor == "INTEGER" and valorI.tipoValor == "INTEGER":
                nodo = Nodo()
                nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor | valorI.valor
                self.pilaValores.append(nodo)
                print("Nuevo or: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo entero') 
        
    def exitXorExpr(self, ctx):
        if len(ctx.shift_expr()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if valorD.tipoValor == "INTEGER" and valorI.tipoValor == "INTEGER":
                nodo = Nodo()
                nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor ^ valorI.valor
                self.pilaValores.append(nodo)
                print("Nuevo xor: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo entero') 
    
    def exitShiftLeft(self, ctx):
        if len(ctx.arith_expr() ) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if valorD.tipoValor == "INTEGER" and valorI.tipoValor == "INTEGER":
                nodo = Nodo()
                nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor << valorI.valor
                self.pilaValores.append(nodo)
                print("Nueva shift left: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo entero')    
    
    def exitShiftRight(self, ctx):
        if len(ctx.arith_expr() ) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if valorD.tipoValor == "INTEGER" and valorI.tipoValor == "INTEGER":
                nodo = Nodo()
                nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor >> valorI.valor
                self.pilaValores.append(nodo)
                print("Nueva shift right: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo entero')    
    
    def exitArithPlus(self, ctx):
        if len(ctx.term()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if self.numerico(valorD) and self.numerico(valorI):
                nodo = Nodo()
                if valorD.tipoValor == "FLOAT" or valorI.tipoValor == "FLOAT" :
                    nodo.tipoValor = "FLOAT"
                else:
                    nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor + valorI.valor
                self.pilaValores.append(nodo)
                print("Nueva suma: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo numerico')    
    
    def exitArithMinus(self, ctx):
        if len(ctx.term()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if self.numerico(valorD) and self.numerico(valorI):
                nodo = Nodo()
                if valorD.tipoValor == "FLOAT" or valorI.tipoValor == "FLOAT" :
                    nodo.tipoValor = "FLOAT"
                else:
                    nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor - valorI.valor
                self.pilaValores.append(nodo)
                print("Nueva resta: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo numerico')   

    def exitTermProduct(self, ctx):
        if len(ctx.power()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if self.numerico(valorD) and self.numerico(valorI):
                nodo = Nodo()
                if valorD.tipoValor == "FLOAT" or valorI.tipoValor == "FLOAT" :
                    nodo.tipoValor = "FLOAT"
                else:
                    nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor * valorI.valor
                self.pilaValores.append(nodo)
                print("Nuevo producto: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo numerico') 
        
    def exitTermDivision(self, ctx):
        if len(ctx.power()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if self.numerico(valorD) and self.numerico(valorI):
                nodo = Nodo()
                if valorD.tipoValor == "FLOAT" or valorI.tipoValor == "FLOAT" :
                    nodo.tipoValor = "FLOAT"
                else:
                    nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor / valorI.valor
                self.pilaValores.append(nodo)
                print("Nueva division: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo numerico') 
    
    def exitTermModule(self, ctx):
        if len(ctx.power()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if self.numerico(valorD) and self.numerico(valorI):
                nodo = Nodo()
                if valorD.tipoValor == "FLOAT" or valorI.tipoValor == "FLOAT" :
                    nodo.tipoValor = "FLOAT"
                else:
                    nodo.tipoValor = "INTEGER"
                nodo.valor = valorD.valor % valorI.valor
                self.pilaValores.append(nodo)
                print("Nuevo modulo: "+str(nodo.valor))     
            else:
                raise RuntimeError('Error en los operandos, deben ser de tipo numerico') 
            
    def exitPowerEval(self, ctx):
        if len(ctx.atom_stmt()) == 2:
            valorD = self.pilaValores.pop()
            valorI = self.pilaValores.pop()
            if self.numerico(valorD) and self.numerico(valorI):
                nodo = Nodo()
                nodo.tipoValor = "FLOAT"
                nodo.valor = valorI.valor ** valorD.valor
                self.pilaValores.append(nodo)
                print("Nueva potencia: "+str(nodo.valor))
            else:
                raise RuntimeError('Error en los operadores, deben ser de tipo entero')           
    
    #
    #
    #
    #
    #LISTENER PARA LOS VALORES ATOMICOS
    #
    #
    #
    #
    
    def enterAtomName(self, ctx):
        nodo = Nodo()
        valor = self.evaluarSimbolo(ctx.NAME())
        nodo.tipoValor = valor[0]
        nodo.valor = valor[1]
        self.pilaValores.append(nodo)
    
    def enterAtomString(self, ctx):
        nodo = Nodo()
        nodo.valor = ctx.string()
        nodo.tipoValor = "STRING"
        self.pilaValores.append(nodo)
        
    def enterAtomNone(self, ctx):
        nodo = Nodo()
        nodo.valor = None
        nodo.tipoValor = "NONE"
        self.pilaValores.append(nodo)
        
    def enterAtomTrue(self, ctx):
        nodo = Nodo()
        nodo.valor = True
        nodo.tipoValor = "BOOL"
        self.pilaValores.append(nodo)
        
    def enterAtomFalse(self, ctx):
        nodo = Nodo()
        nodo.valor = False
        nodo.tipoValor = "BOOL"
        self.pilaValores.append(nodo)
        
    #
    #
    #
    #
    #LISTENER PARA LOS VALORES NUMERICOS
    #
    #
    #
    #
    
    def enterNumberInteger(self, ctx):
        valor = int(ctx.integer().getText())
        nodo = Nodo()
        nodo.valor = valor
        nodo.tipoValor = "INTEGER"
        self.pilaValores.append(nodo)
        
    def enterNumberFloat(self, ctx):
        valor = float(ctx.FLOAT_NUMBER().getText())
        nodo = Nodo()
        nodo.valor = valor
        nodo.tipoValor = "FLOAT"
        self.pilaValores.append(nodo)
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
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
        return nodo.tipoValor == "INTEGER" or nodo.tipoValor == "FLOAT"
    
    
    def obtenerRetorno(self):
        return self.pilaValores.pop()
    
    
    
    
    
    
    
    
    
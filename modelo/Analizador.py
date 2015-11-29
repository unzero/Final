from antlr4 import *
from GramaticaLexer import GramaticaLexer
from GramaticaParser import GramaticaParser
from GramaticaExtVisitor import GramaticaExtVisitor
import traceback

class Analizador:
    
    _instance = None
    
    def __new__(self):
        if self._instance == None:
            self._instance = object.__new__(self)
        return self._instance

    def __init__(self):
        self.log = []
    
    def analizarCadena(self,text):
        try:
            self.log = []
            inp = InputStream(text)
            lexer = GramaticaLexer(inp)
            stream = CommonTokenStream(lexer)
            parser  = GramaticaParser(stream)
            tree = parser.single_input()
            visitor = GramaticaExtVisitor(self)
            visitor.visit(tree)
        except RuntimeError as ex:
            ret = str(ex)+"\n\n"
            ret += "---------------------------------------------------INICIO DE LA TRAZA---------------------------------------------\n"
            ret += str(traceback.format_exc())
            ret += "----------------------------------------------------FIN DE LA TRAZA-----------------------------------------------\n"
            return ret
        
        ret = "\n".join(self.log)
        ret += "\n"
        return ret+"Satisfactorio!!"    
            
    def analizarArchivo(self,file):
        inp = FileStream(file)
        lexer = GramaticaLexer(inp)
        stream = CommonTokenStream(lexer)
        parser  = GramaticaParser(stream)
        tree = parser.single_input()
        visitor = GramaticaExtVisitor()
        visitor.visit(tree)
        
    def agregarRegistro(self,valor):
        self.log.append(str(valor))    
        
    #def __init__(self,argv):
        pass
        #walker = ParseTreeWalker()
        #listener = GramaticaExtListener()
        #walker.walk(listener,tree)
        #semantico = GramaticaExtVisitor();
        #tree = parser.single_input()
        #semantico.visit(tree)
        
    

class TablaSimbolos:

    #tablaSimbolos = {}

    def __init__(self,padre,contexto):
        self.padre = padre
        self.contexto = contexto
        self.tablaSimbolos = {}
    
    def agregarSimbolo(self,nombre,simbolo):
        self.tablaSimbolos[str(nombre)] = simbolo

    def resolver(self,nombre):
        return self.resolverNombre(self,str(nombre),self.contexto)

    def resolverNombre(self,tablaActual,nombre,partida):
        if tablaActual == None:
            return None
        if nombre in tablaActual.tablaSimbolos.keys():
            return tablaActual.tablaSimbolos[nombre]
        return self.resolverNombre(tablaActual.padre,nombre,partida)

    def destruirTabla(self):
        ret = self.padre
        self.padre = None
        self.contexto = -1
        self.tablaSimbolos = None
        return ret
        
    def __str__(self):
        ret = "{"
        for simbolo in self.tablaSimbolos:
            ret += "["+str(simbolo)+", "+str(self.tablaSimbolos[simbolo])+"] "
        return ret+"}"
    
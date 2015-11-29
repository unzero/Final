class Simbolo:
    def __init__(self,nombre,tipo,valor):
        self.nombre = str(nombre)
        self.tipo = tipo
        self.valor = valor
        self.argumentos = None
        self.parametrosLambda = None
        self.parametros = None
        self.subtipo = None

    def validarTipo(self,tipo):
        return self.tipo == tipo

    def __str__(self):
        return "("+str(self.nombre)+", "+str(self.tipo)+","+str(self.valor)+")"
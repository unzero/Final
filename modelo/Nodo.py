#CLASE NODO NOS SIRVE PARA ENVOLVER TODOS LOS POSIBLES VALORES QUE NOS RETORNE UN VISITOR

class Nodo():
    
    def __init__(self):
        self.valor = None
        self.tipo = None
        self.subtipo = None
        
    def __str__(self):
        return "("+str(self.tipo)+", "+str(self.valor)+")"
    
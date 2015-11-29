#SECCION DE IMPORT PARA LAS HERRAMIENTAS DE LAS VENTANAS
import sys
import collections
try:
    import pygtk
    pygtk.require("2.0")
except:
    print("Error")
    pass
try:
    import gtk
    import gtk.glade
except:
    print("Error")
    sys.exit(1)

#IMPORT VARIOS
import TablaSimbolos
from VentanaPrincipal import VentanaPrincipal
from Analizador import Analizador

def test():
    main = VentanaPrincipal()
    main.run()
    #print("OK")
    #analizador = Analizador()
    #analizador.analizarArchivo("./eg.dango")

    
test()

def pruebaTabla():
    te = collections.deque()
    tabla = TablaSimbolos.TablaSimbolos(None,"main")
    print(tabla)
    
#pruebaTabla()
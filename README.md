# AIRI
Python based programming language with functional programming, using ANTLR V4.5

Proyecto Final - Airi

Un lenguaje funcional basado en Python

Lenguajes de Programación

Juan Camilo Neiva Aranguren

Ciro Iván García López

Universidad Nacional de Colombia

Noviembre 29 de 2015

Se puede encontrar el proyecto en el siguiente repositorio.

https://github.com/unzero/Final/

COMPILACION Y PUESTA EN FUNCIONAMIENTO

Junto a este documento se provee de un archivo zip en el cual se puede encontrar lo siguiente:

- Carpeta 'standalone'
- Carpeta 'Final'

Los cuales representan la versión simplificada y un proyecto para eclipse el cual contiene toda la información del proyecto.

PRELIMINARES

Para poder poner en marcha el programa es necesario contar con las siguientes herramientas.

- Python 2.7
- Runtime de ANTLR para Python 2.7
- Runtime GTK para python

Configuración de Python

Para poder ejecutar el proyecto se necesita de Python 2.7, en el siguiente link se puede encontrar esta herramienta.

https://www.python.org/downloads/

Para su correcto funcionamiento basta con bajarlo e instalarlo, igualmente se le debe indicar durante la instalación que agrege a python al path del sistema, o debe ser agregado de forma manuel posteriormente.

Configuración del Runtime de ANTLR 4

Una vez se tenga Python instalado procedemos a instalar el Runtime para Python 2 de ANTLR, para ello desde una terminal basta con ejecutar el siguiente comando.

python -m pip install antlr4-python2-runtime

Con esto quedara configurado de forma correcta nuestro Runtime de ANTLR 4

Configuración del Runtime GTK 

Para la configuración de este Runtime, es necesario obtener la siguiente herramienta 'pygtk-all-in-one-2.24.2.win32-py2.7.msi' disponible en:

http://ftp.gnome.org/pub/GNOME/binaries/win32/pygtk/2.24/

Una vez es descargada debe ser instalada junto a todos sus componentes.

EJECUCION

A este punto contamos con todas las herramientas necesarias para la puesta en funcionamiento del proyecto, por lo cual se puede ejecutar, para ello se puede optar por su ejecución standalone abriendo el archivo 'Central.py' ó ejecutando desde una terminal este archivo.

Otra de las opciones para ejecutar el programa es importar el proyecto 'Final' en eclipse, carpeta Final, para ello se recomienda el uso de la extención PyDev para eclipse. De igual forma necesita de los preliminares para su correcto funcionamiento.

Una vez se logra ejecutar el proyecto se abre una ventana que nos permite interactuar de forma básica; esta ventana cuenta con dos componentes básicas la primera una caja para la edición de código y la segunda una caja para la salida del interprete, igualmente la herramienta cuenta con herramientas sencillas como la carga de archivos, la capacidad para guardarlos.

Si queremos ejecutar nuestro código basta con ir al menú Interprete y ejecutar nuestro código, Airi es un lenguaje cuya ejecución es total es decir se debe interpretar todo el archivo de forma correcta para que se generen las salidas.

Una forma de validar que todo esta funcionando de forma correcta es ejecutar el archivo en blanco, en la salida de consola, deberá salir un mensaje indicando 'Satisfactorio!'

Airi cuenta con las siguientes funciones básicas.

ESPECIFICACIÓN DE AIRI

Para este lenguaje de programación se tienen los siguientes tipo de datos primitivos.

- Entero
- Real
- Cadena
- Booleano, True y False
- Tuplas
- Listas
- Mapas

A los 4 primeros tipos de datos los llamaremos átomos de ahora en adelante y a los 3 últimos los llamaremos iterables. De igual forma la función más básica del lenguaje consiste en la impresión de un átomo, para definir un átimo basta con declararlo de forma natural, algunos ejemplos son -5, True, 'Maria' ; en este punto se hace necesario aclarar que para el tipo cadena estas deben abrirse y cerrarse con una comilla simple. 

Para el caso de las tuplas su definición es la siguiente (valor1,valor2), donde los valores pueden ser átomos. Para el caso de las listas se tiene la siguiente definición [valor1,valor2,...valorn] donde se pueden tener 0 o más átomos. 

En el caso de los diccionarios su definición es la siguiente, { llave:valor,...}, este tipo de dato nos identifica de forma única el valor por medio de la llave. 

Los átomos pueden ser operados bajo los siguientes operadores.

- ** 	: Potencia
- *  	: Producto
- /		: División
- %		: Modulo
- + 	: Suma
- -		: Resta
- <<	: Shift left, para enteros
- >> 	: Shift right, para enteros
- &		: Bit And, para enteros
- | 	: Bit Or, para enteros
- ^ 	: Bit Xor, para enteros
- ++	: Concatenacion, para iterables

La gran mayoria de las operaciones son analogas a sus versiones en otros lenguajes y su prioridad esta dada por el orden en el cual están en la lista, por ello vamos a saltar a la explicación de la concatenación de iterables, la concatenación de iterables sigue las siguientes reglas.

- tupla ++ mapa : Nos guarda la tupla en el diccionario, en donde el átomo 1 de la tupla va a ser la llave y el átomo 2 va a ser el valor.

- mapa ++ mapa : Nos permite unir los dos mapas para formar uno solo, si existen valores en común se guardara el valor del mapa de la izquierda.

- lista ++ tupla , tupla ++ lista , lista ++ lista : genera una nueva lista en la cual se van a guardar los valores del primer operando seguido de los valores del segundo.

El lenguaje cuenta con los siguiente operadores lógicos

- test and test
- test or test
- not test

Donde la prioridad esta dada en el orden especificado y a su vez un test puede llegar a tener otros test, los bloques básicos para construir test son los siguientes,

- valor < valor 
- valor > valor 
- valor == valor 
- valor >= valor 
- valor <= valor
- valor <> valor
- valor != valor
- valor in iterable
- iterable == iterable

De igual forma la prioridad para estos operadores esta dada por el orden en el cual se encuentran en la lista. El siguiente elemento en el lenguaje corresponde con las estructuras de control y flujo del programa, para ello vamos a introducir las 3 estructuras básicas de control con las cuales cuenta Airi. 

- Estructura if-elif-else

Esta estructura nos permite evaluar condiciones para burificar la ejecución, se que la especificación de esta estructura es la siguiente 

if test {
	instruc
}elif test {
	instruc
}	
...
else{
	instruc
}

En donde los bloques elif y else son opcionales, la evaluación de esta estructura se hace de forma lineal bajo el orden en el cual sean declarados en el archivo. Los bloques pueden tener 0 o muchas otras instrucciones dentro de ellos.

- Estructura while 

Tiene la siguiente estructura 

while test  {
	instruc
}

- Estructura for 

La estructura de esta instruccion es la siguiente 

for NAME in iterable {
	instruc
}

Este for nos permite recorrer una lista de iterables de forma ordenada, para el caso de las listas elemento por elemento, y para el caso de los mapas nos reccore llave por llave en el mapa.

PROGRAMACION FUNCIONAL

Los elementos de programación funcional que se incluyen en el proyecto son los siguientes. 

- match para funciones 
- Operaciones sobre listas, filtros, generación, concatenación. 

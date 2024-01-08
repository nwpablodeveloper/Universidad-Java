# Programación con Java:

### [Sección 25: Argumentos variables en Java - "9 min" ](./seccion25)

### [Sección 26: Menejo de Enumeración en Java - "18 min" ](./seccion26)
* Ejemplo enumerar los dias de la semana
* Enumeración con atributos ( Ej. Continentes - Atributos cant. de paises )

### [Sección 27: Bloques de codigo- "12 min" ](./seccion27)
* Los bloque de inicialización se ejecutan antes del constructor
* Bloque estatico/static , se ejecutan al crearse la clase en memoria
* Bluqe no estatico/no static, se ejecuta al crar cada objeto

### [Sección 28: Manejo de forEach - "9 min" ](./seccion28)
* El ciclo forEach es un for mejorado

### [Sección 29: Autoboxing y Unboxing - "8 min" ](./seccion29)
* Autoboxing y Unboxing
Cada tipo de dato primitivo tiene una clase asociada llamada:
Warpper o Envolvente del tipo primitivo.
Estas clases se usan por que tinene atributos y metodos a diferencia de 
los tipos primitivos que solo almacenan un valor y no tienn ni atributos ni 
metodos

|tipo|Envolvente|
|-|-|
|int|Integer|
|long|Long|
|float|Float|
|double|Dobule|
|boolean|Boolean|
|byte|Byte|
|char|Character|
|short|Short|

### [Sección 30: Modificadores de Accesos en Java - "33 min" ](./seccion30)
* Modificador public
Puede acceder a las clases con modificador Public desde otro paquete

* Modificadro public
Podemos acceder a sus atributos y metedos desde otro paquete sin 
restrincciones

* Modificador protected
Los atributos, constructores o metodos que esten con protected solo 
se pueden acceder desde otra clase hija

* Modificador default
Las clases que tengan modificadores de tipo defult solo van 
a poder ser accedidos desde cuelquier otra clase pero
que este dentro del mismo paquete

* Modificador private
Solo pueden ser accedido dentro de la misma clase
Necesitamos entrar con 1 constructur publico para poder tener acceso
a todo el resto de lo elementos dentro de la clase privada


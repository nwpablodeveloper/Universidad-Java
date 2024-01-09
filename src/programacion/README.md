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

### [Sección 31: Sobreescritura de metodos en Java - "13 min" ](./seccion31)
La sobreescritura se aplica sobre una clase heredada, ya que la sobreescritura
en la clase hija modifica el comportamiento de la clse padre

### [Sección 32: Polimorfismo en Java - "22 min" ](./seccion32)
Para poder aplicar el Polimorfismo es necesario tener sobreescrita un metodo
desde una clase hija para que modifique el comportamiento de su clase padre.
El polimorfismo se aplica desde un metodo en la clase donde esta el "main"

EL MODIFICADOR APLICADO EN EL METODO DE LA CLASE HIJA NO PUEDE SER MAS RESTRINGIDO
QUE EL MODIFICADOR QUE TIENE EL METODO LA CLASE PADRE
Si la clase Padre tiene un modificador de tipo PROTECTED
La clase hija NO puede usar de tipo PRIVETE, pero si los otros
public, defuault, protected

### [Sección 33: Palabra instance en Java - "19 min" ](./seccion33)
Esto nos sirve para identificar el tipo de dato y lo podemos convertir
a una variable de tipo padre a un tipo hijo y asi hacer una conversión 
segura.

```java

    // Polimorfismo
    public static void determinarTipo(Empleado empleado){
        //preguntamos si la variable empleado es del tipo Gerente
        if( empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
        } 
        if( empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }
        if( empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }

    // Polimorfismo
    public static void determinarTipo(Empleado empleado){
        //preguntamos si la variable empleado es del tipo Gerente
        if( empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
        } else if( empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        } else if( empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
```
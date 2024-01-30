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
public, defuault, protected.

Cuando usamos un metodo en común entre la clases padre y la clase hija
el polimorfimo va a tomar prioridad sobre la clase de menor jerarquia

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
### [Sección 34: UpCasting / DownCasting- "20 min" ](./seccion34)
* Conversión de objetos
* Converir un Objeto padre a un objeto Hijo
* Convertir un Objecto hijo a uno padre

### [Sección 35: Clase Object en Java - "19 min" ](./seccion35)
La clase OBJECT es la clase padre de todas las clase en Java
* hashCode
* equals
* Comparar igualdad entre Objetos
* Igualdad de contenido de Objetos

### [Sección 36: Clase Abstractas en Java - "17 min" ](./seccion36)
* Cuando declarmos un metod abstratco tambien debe de serlo su clase
* No podemos crear objetos de las clases marcadas como abstractas, si no, 
es que vamos a tener que crear los objetes por medio de las clases hijas

### [Sección 37: Manejo de INterfaces en Java - "25 min" ](./seccion37)
Las interfaces no tiene constructores, solamente va a tener metodos y todos
sus metodos van a ser abstraactos.
Al crear una interface estamos obligados a implementar todos sus metodos
en la clase que sea implementada la Interface
* Crear variables de tipo Interface

### [Sección 38: Manejo de JavaBeans en Java - "13 min" ](./seccion38)
* Es para permitir que las instacias creadas de las clases puedan ser 
convertidas en secuancias de Bytes y viceversa. El objeto al ser serializado
puede ser guardado o transmitido de forma eficiente en la red entre servidores

### [Sección 39: Manejo de Excepciones en Java - "27 min" ](./seccion39)
La clase Padre de las excepciones es la clase "Exception"
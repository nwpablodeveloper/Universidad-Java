## SECCIÓN 08
### [Creación de clases](./07-01-ClasesJava-CFJ.pdf)
* La clase es una plantilla para poder crear objetos, se recomienda
que el nombre de la clase sea en primera letra mayuscula

### [1. Crear una clase](./V01_ClasePersona.java)
* Creación de una clase
```java
    public class MiClase {

    }
```

### [2. Atributos y metodos de una clase](./V02_AtributosMetodosClasePersona.java)
* Creando los atributos de una clase
* Cración de un metodo
```java
    public class Persona {

        // atributos de la clase
        String apellido;
        String nombre;

        public void desplegarInformacion(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Apellido: " + apellido);
        }

    }

```

### [3. Crear un Objeto](./V03_ObjetosPruebaPersona.java)
* Creación del objeto con la clase creada
```java
    public class V03_ObjetosPruebaPersona {

        public static void main(String arg[]) {

            Persona persona; // Solo se crea un espacio en memoria
            
            /* 
                Se crea un espacio en memoria y tambien para sus atributos
                aca la memoria para esta instacia le genera una dirección 
                hexadecimal para hacer referencia a todos sus valores
            */
            Persona persona1 = new Persona();
            Persona persona2 = new Persona();
            Persona persona3 = new Persona();
            Persona persona4 = new Persona();
            
            Persona porsona87 = persona1; 
            /* 
                Si persona1 es modifica sus atributos, tambien seran modificados
                los atributos de persona87 por que estamos haciendo referencia
                al mismo espacio en memoria
            */
            
        }
    }
```

 
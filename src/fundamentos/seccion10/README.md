## SECCIÓN 10 - Constructores en Java

### [1. Constructor en Java](./V01_Aritmetica.java)
```java

    public class NombreClase(){
    
        // Declaración del constructor
        // Se declara con el mismo nombre que tiene la clase
        public NombreClase(){ 
             System.out.println("Ejecutando el constructor");
        }
    
    }

```

### [2. Sobrecarga de Constructores](./V02_SobreCargaConstructor.java)
Si no hay ningun constructor declarado el compilador se va a encargar 
de generar uno de forma automatica a la hora de compilar.
si ya existe un constructor con argumentos perdemos la opción de que se genere
un constructor de forma automatica
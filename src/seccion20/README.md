## SECCIÓN 20 - Uso de la palabra "final2

### [PDF Uso de la palabra "final"](./17-01-PalabraFinal-CFJ.pdf)
* Una clase que este difinida con "final" no puede tener clases hijas
* Si usamos "final" en un metodo, hace que el mismo metodo no se pueda 
sobreescribir si lo queresmo hacer en una clase hija

```java

package seccion20.domain;


public final class Persona {
    
}

```

* Crear una constante

```java
public class Persona {
    public final static double PI = 3.14;
    public final static String NOMBRE_COMPLETO = "Pablo Veiga";
}
```
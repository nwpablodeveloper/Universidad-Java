
package seccion19.mx.com.globalmentoring.test;


// forma 1 de llamar a un paquete
// import seccion19.mx.com.globalmentoring.Utileria;

// forma 2 de llamar a un paquete
import static seccion19.mx.com.globalmentoring.Utileria.imprimir;

public class TestUtileria {
    public static void main(String[] args) {
        
        // forma 1 de llamar al paquete
        // Utileria.imprimir("Hola desde forma 1");
        imprimir("Hola desde forma 2");
        
        seccion19.mx.com.globalmentoring.Utileria.imprimir("Hola desde forma 3");
        
    }
}

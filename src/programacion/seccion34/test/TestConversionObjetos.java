package programacion.seccion34.test;

import programacion.seccion34.domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        
        Empleado empleado;
        
        // Refenciando un objeto Padre en un objeto Hijo
        empleado = new Escritor("Pablo", 1800, TipoEscritura.CLASICO);
        System.out.println("1. " + empleado);
        
        // Uso de polimorfismo
        System.out.println("2. " + empleado.obtenerDetalles());
    
        // DownCasting - convertir un objeto a padre en un objeto hijo
        // para poder acceder a los metodos del hijo
        ((Escritor)empleado).getTipoEscritura();
        Escritor escritor = (Escritor)empleado;

        // UpCasting - convertir un objeto hijo a un objeto padre
        // Podemos asignar una variable de tipo hija a una variable de tipo padre
        Empleado empleado2 = escritor;
        System.out.println("3. " + empleado2.obtenerDetalles());
    }
}

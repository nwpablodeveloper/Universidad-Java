package programacion.seccion34.test;

import programacion.seccion34.domain.*;

public class TestConversionObjetos {
    public static void main(String[] args) {
        
        Empleado empleado;
        
        // Refenciando un objeto Padre en un objeto Hijo
        empleado = new Escritor("Pablo", 1800, TipoEscritura.CLASICO);
        System.out.println(empleado);
        
        // Uso de polimorfismo
        System.out.println(empleado.obtenerDetalles());
    
        // DownCasting - convertir un objeto a padre en un objeto hijo
        ((Escritor)empleado).getTipoEscritura();
        
        // UpCasting - convertir un objeto hijo a un objeto padre
        Escritor escritor = (Escritor)empleado;
        
        // Podemos asignar una variable de tipo hija a una variable de tipo padre
        Empleado empleado2 = escritor;
    }
}

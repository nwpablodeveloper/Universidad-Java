package programacion.seccion32.test;

import programacion.seccion32.domain.*;

public class TestPolimorfismo {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Pablo", 1740.30);
        System.out.println(empleado1);
        System.out.println("Empleado =  " + empleado1.obtenerDetalles());

        // polimorfismo
        imprimir(empleado1);

        empleado1 = new Gerente("Edagar", 2750.35, "CNC");
        System.out.println(empleado1);
        System.out.println("Gerente = " + empleado1.obtenerDetalles());

        // polimorfismo
        imprimir(empleado1);
    }
    
    
    /* 
        metodo polimorfismo: Usamos un tipo de variable de la clase padre
        cuando se aplica el Polimorfimo esa misma clase va a hacer
        referencia al espacio en memoria que este cargada su misma clase
    */
    public static void imprimir(Empleado empleado){
        System.out.println(empleado);
        String detalles = empleado.obtenerDetalles();
        System.out.println("imprimir: " + detalles);
        System.out.println("");
    }

}

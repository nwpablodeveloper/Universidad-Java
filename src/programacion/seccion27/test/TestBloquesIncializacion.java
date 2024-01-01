package programacion.seccion27.test;

import programacion.seccion27.domain.Persona;

public class TestBloquesIncializacion {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        
        System.out.println("");
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        
        System.out.println("");
        Persona persona3 = new Persona();
        System.out.println("persona3 = " + persona3);
        
        System.out.println("");
        Persona persona4 = new Persona();
        System.out.println("persona4 = " + persona4);
    }
}

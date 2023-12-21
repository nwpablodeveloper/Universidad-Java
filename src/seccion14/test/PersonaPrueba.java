
package seccion14.test;

import seccion14.dominio.Persona;


public class PersonaPrueba {
 
    public static void main(String[] args) {
        
        Persona persona1 = new Persona(
                                "Pablo", 
                                1700, 
                                false);
        
        System.out.println(persona1.toString());
        
        System.out.println("Persona1 nombre:    " + persona1.getNombre() );
        
        persona1.setNombre("Sophia");
        System.out.println("Persona1 nombre:    " + persona1.getNombre());
        System.out.println("Persona1 sueldo:    " + persona1.getSueldo());
        System.out.println("Persona1 eliminado: " + persona1.isEliminado());
        
        System.out.println("");
        
        // si existe el metodo toString, se llama de manera automatica
        System.out.println(persona1);
    }
    
}

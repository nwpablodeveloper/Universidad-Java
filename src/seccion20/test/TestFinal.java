

package seccion20.test;

import seccion20.domain.Persona;


public class TestFinal {
    
    public static void main(String[] args) {
        
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        System.out.println("");
        
        // No se puede sobreescribir si el atributo es de tipo "final"
        // Persona.NOMBRE_COMPLETO = "asdf";
        
        
        // Declaración de objetos
        final Persona persona1 = new Persona();
        
        persona1.setNombre("Pablo");
        System.out.println("persona1 = " + persona1.getNombre());
        
        System.out.println("");
        
        persona1.setNombre("Sophia");
        System.out.println("persona1 = " + persona1.getNombre());
        
        
    }
    
}



package seccion12;

import seccion08.Persona;


public class PasoPorReferencia {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona();
        persona1.apellido = "Veiga";
        persona1.nombre = "Pablo";
        System.out.println("persona1 = " + persona1.nombre);
        System.out.println("persona1 = " + persona1.apellido);
    
        System.out.println("");
        
        Persona persona2 = persona1;
        persona2 = cambiarAtributos(persona1);
        System.out.println("persona2 = " + persona2.nombre);
        System.out.println("persona2 = " + persona2.apellido);
        
        System.out.println("");
        
        System.out.println("persona1 = " + persona1.nombre);
        System.out.println("persona1 = " + persona1.apellido);
    }
    
    
    public static Persona cambiarAtributos( Persona objeto ){
        
        objeto.nombre = "Sophia";
        objeto.apellido = "diaz";
        
        return objeto;
        
    }
}

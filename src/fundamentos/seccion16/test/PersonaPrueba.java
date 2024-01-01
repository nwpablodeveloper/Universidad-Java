
package fundamentos.seccion16.test;

import fundamentos.seccion16.domain.Persona;


public class PersonaPrueba {
    
    /*
        si esto ejecutando un metodo statico este mismo puede llamar a otros 
        metodos que tmbien sean unicamente de tipo estatico
    */
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Sophia");
        Persona persona2 = new Persona("Romina");
        Persona persona3 = new Persona("Pablo");
        Persona persona4 = new Persona("Javier");
        
        
        imprimir(persona1);
        imprimir(persona2);
        imprimir(persona3);
        imprimir(persona4);
              
                
    }
    
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
}

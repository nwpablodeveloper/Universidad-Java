package fundamentos.seccion21.test;

import fundamentos.seccion21.domain.Persona;

public class TestArreglosObject {
    
    public static void main(String[] args) {
        
        Persona personas[] = new Persona[2];
        
        personas[0] = new Persona("Pablo");
        personas[1] = new Persona("Sophia");
        
        for(int i = 0; i < personas.length; i++){
            System.out.println("array Personas["+i+"] = " + personas[i] );
        }
        
        System.out.println("");
        
        String frutas[] = {"Manzanas", "Peras","Kiwi"};
        for(int i = 0; i < frutas.length; i++){
            System.out.println("frutas["+i+"] = " + frutas[i]);
        }
        
    }
    
}

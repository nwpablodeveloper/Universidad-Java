package programacion.seccion28;

import programacion.seccion28.test.Persona;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {8, 35, 35, 37, 41};
        
        for (int edad : edades) {
            System.out.println(edad);
        }
        
        System.out.println("");
        
        Persona personas[] = {new Persona("pablo"), new Persona("Sophia")};
        
        for(Persona persona: personas){
            System.out.println(persona);
        }
    }

}

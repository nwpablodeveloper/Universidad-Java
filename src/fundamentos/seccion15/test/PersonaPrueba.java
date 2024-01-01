package fundamentos.seccion15.test;

import fundamentos.seccion15.dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {

        Persona persona1 = new Persona("Pablo", 1800, false);

        /* 
            persona1.nombre = "Andres"; // ya no tengo acceso directo al atributo
            Como ahora trabajamos de forma encapsulada ya no tenemos acceso directo
            a los atributos de la clase, si no, que lo hacemos de forma indirecta
            por medio de los gethers y sethers
         */
        
        
        System.out.println("Persona1 nombre: " + persona1.getNombre());
        System.out.println("Persona1 sueldo: " + persona1.getSueldo());
        System.out.println("Persona1 eliminado: " + persona1.isEliminado());
        
        System.out.println("");
        System.out.println("Uso de toString en la clase");
        System.out.println("persona1 = " + persona1);
        
        System.out.println("");
        System.out.println("============================================");
        
        System.out.println("Tarea hacer otro objeto de persona y modificar sus atributos");
        
        Persona persona2 = new Persona("Sophia", 0, false);
        System.out.println("persona2 = " + persona2);
        persona2.setEliminado(true);
        System.out.println("");
        System.out.println("Datos modificados con Sets");
        persona2.setNombre("Romina");
        persona2.setSueldo(0.235);
        System.out.println(persona2);
        
    }
}

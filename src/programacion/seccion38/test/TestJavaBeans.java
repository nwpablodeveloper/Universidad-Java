package programacion.seccion38.test;

import programacion.seccion38.domain.Persona;


public class TestJavaBeans {
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setApellido("Veiga");
        persona.setNombre("Pablo");
        System.out.println(persona);
        System.out.println(persona.getApellido());
        System.out.println(persona.getNombre());
    }
}

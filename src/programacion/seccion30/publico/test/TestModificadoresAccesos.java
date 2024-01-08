package programacion.seccion30.publico.test;

import programacion.seccion30.publico.paquete1.ClasePublic;

public class TestModificadoresAccesos {
    
    public static void main(String[] args) {
        
        ClasePublic clase1 = new ClasePublic();
        
        // podemos acceder por que el atributo es publico";
        System.out.println("Clase1 = " + clase1.atributoPublico);
        
        // Tambien podemos acceder a sus metodos que sean publicos
        clase1.metodoPublico();
        
    }
    
}


package programacion.seccion30.protejido.test;

import programacion.seccion30.protejido.paquete1.ClaseProtected;

public class TestModificadoresAccesos {
    
    public static void main(String[] args) {
        
        // Si el constructor es protected no es accesible desde otra clase
        //ClaseProtected claseProtected = new ClaseProtected();
        
        ClaseProtected claseProtected = new ClaseProtected("Constructor public");
        
        // Tampoco podemos acceder a los atributos PROTECTED
        //claseProtected.atributoProtected;
        
        // Los metodos PROTECTED tampoco son accesibles desde otra clase
        //claseProtected.metodoProtected();
    }
    
}

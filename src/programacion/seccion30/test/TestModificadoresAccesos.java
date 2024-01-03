package programacion.seccion30.test;

import programacion.seccion30.paquete1.Clase1;

public class TestModificadoresAccesos {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        clase1.atributoPublico = "podemos acceder por que el atributo es publico";
        
    }
}

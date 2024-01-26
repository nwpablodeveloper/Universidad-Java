package programacion.seccion36.test;

import programacion.seccion36.domain.*;

public class TestClasesAbstractas {
    public static void main(String[] args) {
        
        // vamos a usar el polimorfismo, creamos un objeto de una clase hija
        // Usanto un tipo de variable de la clase padre
        FiguraGeometrica figura1 = new Rectangulo("Rectangulo");
        
        figura1.dibujar();
    }
}

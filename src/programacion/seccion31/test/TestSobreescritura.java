package programacion.seccion31.test;

import programacion.seccion31.domain.Gerente;

public class TestSobreescritura {
    
    public static void main(String[] args) {
        
        Gerente gerente1 = new Gerente("Pablo", 2387.54, "CNC");
        
        System.out.println(gerente1.obtenerDetalles());
        
    }
}

package programacion.seccion30.privado.test;

import programacion.seccion30.privado.paquete1.ClasePrivate;
import programacion.seccion30.privado.paquete2.ClaseHijaPrivate;

public class TestPrivate {
    
    public static void main(String[] args) {
        
        ClasePrivate clasePrivada = new ClasePrivate("publico");
        
        // No se pueden acceder a los atributos privados
        // clasePrivada.atributoPrivado;
        
        
        System.out.println("Get " + clasePrivada.getAtributoPrivado());
        
        clasePrivada.setAtributoPrivado("Cambiar Valor");
        
        System.out.println("Get " + clasePrivada.getAtributoPrivado());
        
        
    }
    
}

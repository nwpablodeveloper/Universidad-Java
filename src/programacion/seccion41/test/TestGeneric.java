package programacion.seccion41.test;

import programacion.seccion41.genericos.ClaseGenerica;

public class TestGeneric {
    public static void main(String[] args) {
        
        ClaseGenerica<Integer> objetoInt = new ClaseGenerica(35);
        objetoInt.obtenerTipo();
        
        ClaseGenerica<String> objetoString = new ClaseGenerica("Pablo");
        objetoString.obtenerTipo();
        
    }
}

package programacion.seccion35.test;

import programacion.seccion35.domain.*;

public class TestClaseObject {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", 2323);
        Empleado empleado2 = new Empleado("Juan", 2323);
    
        
        // Como preguntar si 2 objetos son iguales
        if( empleado1 == empleado2 ){
            System.out.println("Tienen la misma referencia en memoria");
        } else {
            System.out.println("Tienen distinta referencia en memori");
        }
        
        // Comparar igualdad de los contenidos de los Objetos
        if(empleado1.equals(empleado2)){
            System.out.println("Son iguales en contenido");
        } else {
            System.out.println("Son distintos en contenido");
        }
        
        if(empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El Hashcode entre objetos es igual");
        } else {
            System.out.println("El Hashcode entre objetos es distinto");
        }
       
               
        
    }
    
}

package programacion.seccion33.test;

import programacion.seccion33.domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Pablo", 1730.50);
        determinarTipo(empleado);
        
        System.out.println("");
        
        empleado = new Gerente("Edgar", 2730.32, "CNC");
        determinarTipo(empleado);
        
    }
    
    // Polimorfismo
    public static void determinarTipo(Empleado empleado){
        //preguntamos si la variable empleado es del tipo Gerente
        if( empleado instanceof Gerente){
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente)empleado;
            System.out.println("Gerente " + gerente.getDepartamento());
        } 
        if( empleado instanceof Empleado){
            System.out.println("Es de tipo Empleado");
        }
        if( empleado instanceof Object){
            System.out.println("Es de tipo Object");
        }
    }
    
}

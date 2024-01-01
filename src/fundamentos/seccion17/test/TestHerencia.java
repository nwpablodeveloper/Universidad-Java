package fundamentos.seccion17.test;

import java.util.Date;
import fundamentos.seccion17.domain.Cliente;
import fundamentos.seccion17.domain.Empleado;
import fundamentos.seccion17.domain.Persona;

public class TestHerencia {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Pablo", 1800.73);
        Empleado empleado2 = new Empleado("Pablo", 1800.73);
        Empleado empleado3 = new Empleado("Pablo", 1800.73);
        
        System.out.println("empleado1 = " + empleado1);
        System.out.println("");
        System.out.println("empleado2 = " + empleado2);
        System.out.println("");
        System.out.println("empleado3 = " + empleado3);
        System.out.println("");
        
        Cliente cliente1 = new Cliente(new Date(), true, "pablo", 
                                    'M', 35, "Canigo 15");
                
        System.out.println("cliente1 = " + cliente1);
        System.out.println("");
        
        
        // Sobrecarga de constructor
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Pablo");
        Persona persona3 = new Persona("Pablo", 'M', 35, "Canigó 15");

    }

}

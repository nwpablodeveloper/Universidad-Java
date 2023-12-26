package seccion17.test;

import java.util.Date;
import seccion17.domain.Cliente;
import seccion17.domain.Empleado;

public class TestHerencia {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Pablo", 1800.73);

        System.out.println("empleado1 = " + empleado1);
        System.out.println("");
        
        Cliente cliente1 = new Cliente(new Date(), true, "pablo", 
                                    'M', 35, "Canigo 15");
                
        System.out.println("cliente1 = " + cliente1);
        System.out.println("");
        

    }

}

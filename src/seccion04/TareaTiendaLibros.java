package seccion04;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class TareaTiendaLibros {

    public static void main(String arg[]) {

        var consola = new Scanner(System.in);

        System.out.println("Porporciona el nombre");
        var nombre = consola.nextLine();

        System.out.println("Proporciona el id");
        var id = Integer.parseInt(consola.nextLine());
        
        System.out.println("Proporcione un precio");
        var precio = Double.parseDouble(consola.nextLine());
        
    }

}

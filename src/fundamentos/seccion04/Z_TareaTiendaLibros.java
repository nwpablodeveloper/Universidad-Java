package fundamentos.seccion04;

import java.util.Scanner;

/**
 *
 * @author Pablo
 */
public class Z_TareaTiendaLibros {

    public static void main(String arg[]) {

        var scanner = new Scanner(System.in);

        System.out.println("Porporciona el nombre");
        String nombre = scanner.nextLine();

        System.out.println("Proporciona el id");
        int id = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Proporcione un precio");
        double precio = Double.parseDouble(scanner.nextLine());
        
        System.out.println("Proporciona el envio gratuito");
        boolean envio = Boolean.parseBoolean(scanner.nextLine());
        
        
        System.out.println("Nombre:\t" + nombre);
        System.out.println("ID:\t" + id);
        System.out.println("Precio:\t$ " + precio);
        System.out.println("Envio:\t" + envio);
    }

}

package fundamentos.seccion03;


import java.util.Scanner;


public class ClaseScanner {

    public static void main(String arg[]){
    
        // La clase Scanner siempre devuelve un string
        Scanner consola = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        
        // input de entrada del usuario
        var usuario = consola.nextLine();
        
        System.out.println("Escriba su titulo: ");
        var titulo = consola.nextLine();
        
        System.out.println( titulo + " " + usuario );
        
    }
    
}

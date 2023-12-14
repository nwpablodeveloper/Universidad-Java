package seccion03;


import java.util.Scanner;


public class TareaDetalleLibro {

    public static void main(String arg[]){
    
        Scanner libro = new Scanner(System.in);
        
        System.out.println("Escriba el titulo del libro");
        String titulo = libro.nextLine();
        
        System.out.println("Indique su autor:");
        String autor = libro.nextLine();
        
        System.out.println( titulo + " por " + autor );
        
    }
    
}


package seccion05;

import java.util.Scanner;

public class V9_TareaRectangulo {

    public static void main(String arg[]){
    
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese el alto del cuadrado");
        var alto = Double.parseDouble( consola.nextLine() );
        
        System.out.println("Ingrese el ancho del cuadrado");
        var ancho = Double.parseDouble( consola.nextLine() );
        
        var area = alto * ancho;
        System.out.println("area = " + area);
        
        var perimetro = ( alto + ancho ) * 2;
        System.out.println("perimetro = " + perimetro);
        
        
    }
    
}

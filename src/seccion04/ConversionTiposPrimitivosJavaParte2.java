
package seccion04;

import java.util.Scanner;

public class ConversionTiposPrimitivosJavaParte2 {
    
    public static void main(String arg[]){
    
        var edadTexto = 8;
        var edadTexto2 = String.valueOf(edadTexto);
        
        var caracter = "hola".charAt(2);
        
        System.out.println("Ingrese un caracter");
        var consola = new Scanner(System.in);
        caracter = consola.nextLine().charAt(1);
        System.out.println("caracter = " + caracter);
        
    }
    
}

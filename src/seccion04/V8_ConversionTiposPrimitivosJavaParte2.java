
package seccion04;

import java.util.Scanner;

public class V8_ConversionTiposPrimitivosJavaParte2 {
    
    public static void main(String arg[]){
        
        var consola = new Scanner(System.in);
    
        int edadTexto = 8;
        String edadTexto2 = String.valueOf(edadTexto);
        
        var caracter = "hola".charAt(2);
        
        System.out.println("Ingrese un caracter");
        caracter = consola.nextLine().charAt(1);
        System.out.println("caracter = " + caracter);
        
    }
    
}

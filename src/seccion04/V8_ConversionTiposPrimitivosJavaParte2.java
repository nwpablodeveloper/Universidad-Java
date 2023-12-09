
package seccion04;

import java.util.Scanner;

public class V8_ConversionTiposPrimitivosJavaParte2 {
    
    public static void main(String arg[]){
        
        var consola = new Scanner(System.in);
    
        int edadTexto = 8;
        String edadTexto2 = String.valueOf(edadTexto);
        
        char caracter = "hola".charAt(2);
        
        System.out.println("Ingrese un texto");
        String texto = consola.nextLine();
        
        System.out.println("numero de caracter a elegir");
        int numCaracter = Integer.parseInt(consola.nextLine());
        
        System.out.println("Texto = " + texto);
        System.out.println("caracter seleccionado= " + numCaracter);
        
    }
    
}

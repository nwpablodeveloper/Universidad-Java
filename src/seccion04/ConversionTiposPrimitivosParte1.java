package seccion04;


import java.util.Scanner;


public class ConversionTiposPrimitivosParte1 {

    public static void main(String arg[]) {

        var edadConvertida = Integer.parseInt("35");
        System.out.println("edad convertida " + (edadConvertida + 3));

        var edadString = "35";
        System.out.println("edadString = " + edadString + 3);

        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        var consola = new Scanner(System.in);
        
        System.out.println("Ingrese valor");
        edadString = consola.nextLine();
        
        System.out.println("");
        var edadInt = Integer.parseInt(edadString);
        

    }

}

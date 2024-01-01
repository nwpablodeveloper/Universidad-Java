package fundamentos.seccion04;


import java.util.Scanner;


public class V7_ConversionTiposPrimitivosParte1 {

    public static void main(String arg[]) {

        int edadConvertida = Integer.parseInt("35");
        System.out.println("edad convertida " + (edadConvertida + 3));

        String edadString = "35";
        System.out.println("edadString = " + edadString + 3);

        double valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);
        
        var consola = new Scanner(System.in);
        
        System.out.println("Ingrese valor");
        edadString = consola.nextLine();
        
        System.out.println("");
        var edadInt = Integer.parseInt(edadString);
        

    }

}

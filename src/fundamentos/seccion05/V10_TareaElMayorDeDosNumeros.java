package fundamentos.seccion05;

import java.util.Scanner;

public class V10_TareaElMayorDeDosNumeros {

    public static void main(String arg[]) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el 1er valor");
        int numero1 = Integer.parseInt(consola.nextLine());

        System.out.println("Ingrese el 2do valor");
        int numero2 = Integer.parseInt(consola.nextLine());
        

        var resultado = numero1 == numero2 ? "Son iguales"
                : numero1 > numero2 ? "El primer numero es mayor al 2do"
                : "El segundo numero es mayor al primer numero";
        
        System.out.println("resultado = " + resultado);
        
    }

}

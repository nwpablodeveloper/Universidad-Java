package seccion06;

import java.util.Scanner;

public class V06_TareaSistemaCalificaciones {

    public static void main(String arg[]) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese la nota");
        var nota = Double.parseDouble(consola.nextLine());
        var calificacion = "Valor desconocido";

        if (nota >= 9 && nota <= 10) {
            calificacion = "F";
        } else if (nota >= 8 && nota < 9) {
            calificacion = "B";
        } else if (nota >= 7 && nota < 8) {
            calificacion = "C";
        } else if (nota >= 6 && nota < 7) {
            calificacion = "D";
        } else if (nota >= 0 && nota < 6) {
            calificacion = "F";
        }
        System.out.println("calificacion = " + calificacion);

    }

}

package seccion06;

public class V2_EjercicioIfElseEnJava {

    public static void main(String arg[]) {

        var numero = 4;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Uno";
        } else if (numero == 2) {
            numeroTexto = "Dos";
        } else if (numero == 3) {
            numeroTexto = "Tres";
        } else {
            numeroTexto = "Numero no encontrado";
        }

        System.out.println("numeroTexto = " + numeroTexto);
    }
}

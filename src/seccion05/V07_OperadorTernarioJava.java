package seccion05;

public class V07_OperadorTernarioJava {

    public static void main(String arg[]) {

        var resultado = (3 > 2) ? "Verdadero" : "Falso";
        System.out.println("resultado = " + resultado);

        var numero = 654655;
        resultado = numero % 2 == 0 ? "Es par" : "Es impar";
        System.out.println("resultado = " + resultado);
        
    }

}

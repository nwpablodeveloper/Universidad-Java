package fundamentos.seccion05;

public class V01_OperadoresAritmeticosEnJava {

    public static void main(String arg[]) {

        int a = 3, b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("");

        var resultado = a + b;
        System.out.println("Operador + = " + resultado);
        System.out.println("");

        resultado = a - b;
        System.out.println("Operador - = " + resultado);
        System.out.println("");

        resultado = a * b;
        System.out.println("Operador * = " + resultado);
        System.out.println("");

        resultado = a / b;
        System.out.println("Operador / = " + resultado);
        System.out.println("El resultado es entero por que las variables son INT");
        System.out.println("");

        var resultado2 = 3D / 8.4;
        System.out.println("Operador /  = " + resultado2);
        System.out.println("El resultado es double por que las variables son double");

        // Operador de modulo
        // Residuo de la operación
        resultado = 19 % 5;
        System.out.println("Operador %  = " + resultado);
        
        if( a % 2 == 0 )
            System.out.println("Espar = " );
        else
            System.out.println("Es Impar");
    }   

}

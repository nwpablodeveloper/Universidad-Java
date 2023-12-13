package seccion05;

public class V04_OperadoresDeAsignacionRelacionales {

    public static void main(String arg[]) {

        var a = 3;
        var b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("Operador de igualdad: a = b");
        var c = (a == b);
        System.out.println("c = " + c);
        System.out.println("");
        
        System.out.println("Operador de desigualdad: a distingo a b");
        var d = a != b;
        System.out.println("d = " + d);
        System.out.println("");
        
        var cadena = "hola";
        var cadena2 = "hola";
        var e = cadena == cadena2; // se compara la referencia del objeto
        System.out.println("e = " + e);
        
        var f = cadena.equals(cadena2);
        System.out.println("f = " + f);
            
    }

}

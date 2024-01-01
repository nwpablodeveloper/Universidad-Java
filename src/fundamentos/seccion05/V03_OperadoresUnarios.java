package fundamentos.seccion05;

public class V03_OperadoresUnarios {

    public static void main(String arg[]) {

        // operador unario a cambiar signo
        var a = 3;
        var b = -a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("");

        // Operador unario de negación
        var c = true;
        var d = !c;
        System.out.println("d = " + d);
        System.out.println("");

        // Operador unario de incremento o decremento
        // 1 Preincremento
        System.out.println("Pre-incremento");
        var e = 3;
        var f = ++e;
        System.out.println("f = " + f);
        System.out.println("");
        
        // postincremento ( lleva el simbolo o el operador despues de la variable )
        System.out.println("Post-incremento");
        var g = 7;
        var h = g++;
        System.out.println("h = " + h);
        System.out.println("g = " + g);
        System.out.println("");
        
        
        // predecremento
        System.out.println("Pre-decremento");
        var i = 15;
        var j = --i;
        System.out.println("j = " + j);
        System.out.println("");
        
        //postdecremento
        System.out.println("Post-decremento");
        var k = 23;
        var l = k--;
        System.out.println("l = " + l);
        System.out.println("k = " + k);
        System.out.println("");
    }

}

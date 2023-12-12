package seccion05;

public class V2_OperadoresDeAsignacionEnJava {

    public static void main(String arg[]) {

        /* El operador de asignación va a evaluar
           todo lo que esta a la derehca ( = ) y se lo va 
            a asignar a la variable que este a la izquierda
         */
        int a = 3, b = 2;
        int c = a + 5 - b;
        System.out.println("c = " + c);

        // operador de asignación pero de composición
        
        System.out.println("");
        System.out.println("");
        System.out.println("Operador de composicion +=, -=, *=, /=, %=");
        
        System.out.println("a += 1 : " + a);
        a += 1;
        System.out.println("a = " + a);
        a += 15;
        System.out.println("a = " + a);
        a -= 7;
        System.out.println("a = " + a);
        a *= 3;
        System.out.println("a = " + a);
        
    }

}

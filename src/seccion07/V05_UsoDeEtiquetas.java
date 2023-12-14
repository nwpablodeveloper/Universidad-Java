package seccion07;

public class V05_UsoDeEtiquetas {

    public static void main(String arg[]) {

        inicio:
        for (var i = 0; i <= 20; i++) {

            if (i == 16) {
                /* 
                    con el continue cerramos la vuelta del ciclo
                    y seguimos por la proxima vuelta
                 */
                continue inicio;
            }
            if (i % 2 == 0) {
                System.out.println("i es par = " + i);
            }
            if (i == 16) {
                break;
            }
        }

    }

}

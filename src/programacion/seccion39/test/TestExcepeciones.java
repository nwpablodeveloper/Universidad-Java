package programacion.seccion39.test;

import static programacion.seccion39.aritmetica.Aritmetica.division;
import programacion.seccion39.excepciones.OperacionExcepcion;

public class TestExcepeciones {
    public static void main(String[] args) {
        int resultado = 0;
        
        try{
            resultado = division(50, 0);
        }catch(OperacionExcepcion e){
            // Ponemos primeros las excepciones de menor jerarquia
            System.out.println("Ocurrio un error de tipo OperacionException");
            System.out.println(e.getMessage());
        }catch(Exception e) {
            // Pila de excepciones
            System.out.println("Ocurrio un error de tipo exception: ");
            e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }finally{
            System.out.println("El Finally siempre se ejecuta");
        }
        System.out.println(resultado);
    }
}

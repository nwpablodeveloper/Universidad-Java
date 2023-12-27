

package seccion18.SobreCargaMetodos.operaciones;


public class Operaciones {
    
    // Sobrecarga de metodos
    
    // El contexto estatico no puede acceder al operador this
    public static int sumar(int a , int b){
        System.out.println("metodo con tipos enteros");
        return a + b;
    }
    
    public static double sumar(double a, double b){
        System.out.println("metodo con tipos double");
        return a + b;
    }
    
}

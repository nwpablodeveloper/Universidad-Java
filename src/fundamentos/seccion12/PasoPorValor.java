
package fundamentos.seccion12;

public class PasoPorValor {
    
    public static void main(String[] args) {
        
        var x = 10;
        System.out.println("x = " + x);
        
        int x2 = cambiarValor(x);
        System.out.println("x2 = " + x2);
        System.out.println("x = " + x);
        
    }
    
    public static int  cambiarValor( int arg){
        
        return arg + 2;
        
    }
}

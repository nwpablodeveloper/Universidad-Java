
package fundamentos.seccion05;


public class V05_OperadoresRelacionales {
    
    public static void main(String arg[]){
        
        int a = 6, b = 7;
        
        var g = a >= b;
        System.out.println("g = " + g);
        System.out.println("");
        
        System.out.println("Saber si un numero es par");
        if( a % 2 == 0 ){
            System.out.println("Es par");
        } else{
            System.out.println("Es impar");
        }
        
        System.out.println("");
        var edad = 35;
        var adulto = 18;
        
        if( edad >= adulto){
            System.out.println("Es adulto");
        }else{
            System.out.println("Es menor de edad");
        }
        
    }
    
}

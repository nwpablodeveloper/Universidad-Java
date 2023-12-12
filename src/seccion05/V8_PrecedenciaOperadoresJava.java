
package seccion05;


public class V8_PrecedenciaOperadoresJava {

    public static void main(String arg[]){
    
        var x = 5;
        var y = 10;
        var z = ++x + y-- ;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var resultado = 4 + 5 * 6 / 3;
        System.out.println("resultado = " + resultado);
        
        resultado = ( 4 + 5 ) * 6 / 3;
        System.out.println("resultado = " + resultado);
        
    }
    
}

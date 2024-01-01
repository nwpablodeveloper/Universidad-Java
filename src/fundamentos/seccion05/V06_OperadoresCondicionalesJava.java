
package fundamentos.seccion05;

public class V06_OperadoresCondicionalesJava {

    public static void main(String arg[]){
    
        var a = 11;
        var valorMinimo = 0;
        var valorMaximo = 10;
        
        System.out.println("Si uno de los valores es falso,");
        System.out.println("toda la expresion se considera falsa");
        
        // Con el operador AND las 2 condiciones se tienen que cumplir
        var resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        if(resultado){
            System.out.println("dentro de rango");
        }else{
            System.out.println("fuera de rango");
        }
        
        System.out.println("");
        var vacaciones = false;
        var diaDescanso = true;
        
        // Con el operador OR que que solo se cumpla una condición es true
        if( vacaciones || diaDescanso ){
            System.out.println("No trabajas");
        }else{
            System.out.println("Trabajas");
        }
        System.out.println("");
        
    }
    
}

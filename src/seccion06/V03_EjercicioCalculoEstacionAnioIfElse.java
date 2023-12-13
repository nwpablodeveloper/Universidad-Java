

package seccion06;

import java.util.Scanner;


public class V03_EjercicioCalculoEstacionAnioIfElse {
    
    
    public static void main(String arg[]){
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingrese el mes");
        var mes = Integer.parseInt( consola.nextLine() );
        var estacion = "Estacion desconocida";
        
        if( mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }else if( mes == 3 || mes == 4 || mes == 5 ){
            estacion = "Primavera";
        }else if( mes == 6 || mes == 7 || mes == 8 ){
            estacion = "Verano";
        }else {
            estacion = "Otonio";
        }
        
        System.out.println("estacion = " + estacion);
        
    }
    
}

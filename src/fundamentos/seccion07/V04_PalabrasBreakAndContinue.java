package fundamentos.seccion07;

public class V04_PalabrasBreakAndContinue {

    public static void main(String arg[]){
        
              
        for(var i = 0; i <=20; i++){
        
            if(i == 16){
                /* 
                    con el continue cerramos la vuelta del ciclo
                    y seguimos por la proxima vuelta
                */
                continue;
            }
            if( i % 2 == 0 ){
                System.out.println("i es par = " + i);
            }
            if( i == 16 ){
                break;
            }
        }
        
        
    }
    
}

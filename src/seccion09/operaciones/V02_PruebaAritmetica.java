
package seccion09.operaciones;

public class V02_PruebaAritmetica {

    public static void main(String[] args) {
        
        V01_Aritmetica aritmetica1 = new V01_Aritmetica();
        
        aritmetica1.a = 30;
        aritmetica1.b = 50;
        
        aritmetica1.sumar();
       
        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado = " + resultado);
        
    }
    
}

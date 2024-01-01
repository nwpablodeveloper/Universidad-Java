
package fundamentos.seccion09;

public class V03_PasoArgumentos {

    public static void main(String[] args) {
        
        V01_Aritmetica aritmetica = new V01_Aritmetica();
        
        aritmetica.a = 954;
        aritmetica.b = 321;
        
        int resultado = aritmetica.sumarConArgumento(5, 1);
        System.out.println("resultado = " + resultado);
    }
    
}



package seccion10;

public class V02_InstanciaSobreCarga {
    
    public static void main(String[] args) {
        
        
        V02_SobreCargaConstructor aritmetica1 = new V02_SobreCargaConstructor();
        System.out.println("aritmetica1 = " + aritmetica1.a);
        System.out.println("aritmetica1 = " + aritmetica1.b);
        
        System.out.println("");
        
        System.out.println("Ejecutando Constructor con argumentos");
        V02_SobreCargaConstructor aritmetica2 = new V02_SobreCargaConstructor(10, 20);
        System.out.println("aritmetica1 = " + aritmetica2.a);
        System.out.println("aritmetica1 = " + aritmetica2.b);
        
    }
    
}

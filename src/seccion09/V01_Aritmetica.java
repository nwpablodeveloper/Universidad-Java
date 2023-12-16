
package seccion09;

public class V01_Aritmetica {

    // Atributos
    int a;
    int b;
    
    // Método sin retorno
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    // Método con retorno
    public int sumarConRetorno(){
        
        return this.a + this.b + 100;
        
    }
    
    // Método recibiendo argumentos
    public int sumarConArgumento( int a, int b ){
        this.a = a;
        this.b = b;
        
        // Podemos usar otro método
        return sumarConRetorno();
    }
    
}

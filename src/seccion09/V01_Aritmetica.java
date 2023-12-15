
package seccion09;

public class V01_Aritmetica {

    // Atributos
    int a;
    int b;
    
    // Metodos
    public void sumar(){
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }
    
    public int sumarConRetorno(){
        
        return this.a + this.b + 100;
        
    }
    
    public int sumarConArgumento( int a, int b ){
        this.a = a;
        this.b = b;
        return sumarConRetorno();
    }
    
}

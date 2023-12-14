
package seccion09.operaciones;

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
        
        return a + b + 100;
        
    }
    
}

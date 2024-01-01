

package fundamentos.seccion10;

public class V02_SobreCargaConstructor {
    
    int a;
    int b;
    
    // 1er constructor
    public V02_SobreCargaConstructor(){
        System.out.println("Ejecutando constructor");
    }
       
    // 2do constructor
    public V02_SobreCargaConstructor( int a, int b){
        this.a = a;
        this.b = b;
    }
    
}

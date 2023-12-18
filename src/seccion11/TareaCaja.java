

package seccion11;

public class TareaCaja {

    int ancho;
    int alto;
    int profundo;
    
    public TareaCaja(){
        System.out.println("Ejecutando constructor");
    }
    
    public TareaCaja( int ancho, int alto, int profundo ){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    public void calcularVolumen(){
        
        int vol = this.ancho * this.alto * this.profundo;
        System.out.println("vol = " + vol);
        
    }
    
}

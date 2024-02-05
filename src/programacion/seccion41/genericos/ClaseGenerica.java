package programacion.seccion41.genericos;

public class ClaseGenerica<T> {
    
    T objeto; // Objeto generico
    
    public ClaseGenerica(T objeto){
        this.objeto = objeto;
    }
    
    public void obtenerTipo(){
        System.out.println("el tipo T es: " + objeto.getClass().getSimpleName());
    }
    
}

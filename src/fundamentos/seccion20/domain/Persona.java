

package fundamentos.seccion20.domain;


public class Persona {
    
    public final static double PI = 3.14;
    public final static String NOMBRE_COMPLETO = "pablo veiga";
    
    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void imprimir(){
        System.out.println("desde clase padre");
    }
    
}

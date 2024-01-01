

package fundamentos.seccion16.domain;

public class Persona {
    
    private int idPersona;
    private String nombre;
    private static int contadorPersonas;
    
    public Persona(String nombre){
        
        this.nombre = nombre;
        
        /*
            Los atributos estaticos se acceden con el mismo nombre de la clase
            Los atributos estaticos afectan a todos los objetos creados al igual
            que lo hacen los metodos
        */
        this.idPersona = ++Persona.contadorPersonas;
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public int getIdPersona(){
        return this.idPersona;
    }
    
    public static int getContadorPersona(){
        return Persona.contadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }
    
    
    
    
    
}

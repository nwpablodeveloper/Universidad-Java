

package zpruebas;

public class Persona {
    
    String nombre;
    String apellido;
    boolean trabaja;
    
    public Persona(String nombre, String apellido, boolean trabaja){
        this.nombre = nombre;
        this.apellido = apellido;
        this.trabaja = trabaja;
    }

    public void mostrarReferencia(Persona persona){
        System.out.println(persona);
        
        // cuendo el metodo es de tipo void, el compilador de forma autmotica
        // agrega el "return;"
        //return;
    }
    
    // Este metodo devuelve un dato de tipo "integer"
    public int retornoInteger(){
        return 654654;
    }
    
    public Persona retornoNull(Persona objeto) {
        objeto = null;
        return null;
        
    }
    
    
}

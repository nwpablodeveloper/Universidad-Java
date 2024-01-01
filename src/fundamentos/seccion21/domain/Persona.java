package fundamentos.seccion21.domain;

public class Persona {
    
    private String nombre;

    public Persona(String nombre){
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre = ").append(nombre);
        sb.append(" | Dir. memoria = ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}

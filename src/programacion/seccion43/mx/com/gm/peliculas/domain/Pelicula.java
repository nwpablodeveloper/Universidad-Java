package programacion.seccion43.mx.com.gm.peliculas.domain;

public class Pelicula {
    
    private String nombre;
    
    public Pelicula(){
    }

    public Pelicula(String nombre){
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
        sb.append("Pelicula{");
        sb.append("nombre=").append(nombre);
        sb.append('}');
        return sb.toString();
    }
    

    
    
}

package programacion.seccion35.domain;

public enum TipoEscritura {
    
    CLASICA("Escritura a mano"),
    MODERNA("Escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }

}

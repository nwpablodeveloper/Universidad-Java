package programacion.seccion34.domain;

public enum TipoEscritura {
    
    CLASICO("Escritura a mano"),
    MODERNO("Escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descString){
        this.descripcion = descString;
    }
    
    public String getDescripcion(){
        return this.descripcion;
    }
    
}

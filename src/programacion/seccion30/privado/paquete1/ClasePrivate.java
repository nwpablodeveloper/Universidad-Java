package programacion.seccion30.privado.paquete1;

public class ClasePrivate {
    
    private String atributoPrivado = "Esto es un atributo privado";
    
    private ClasePrivate(){
        System.out.println("Constructor privado");
    }
    
    /* 
        vas a necesitar minimo un constructor público para poder crear un
        objete de esta clase
    */
    public ClasePrivate(String argumento){
        this();
        System.out.println("Constructor public");
    }
    
    private void metodoPrivate(){
        System.out.println("Esto es un metodo privado");
    }
    

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
    
}

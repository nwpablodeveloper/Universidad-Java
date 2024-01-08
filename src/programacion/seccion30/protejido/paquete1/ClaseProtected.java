package programacion.seccion30.protejido.paquete1;

public class ClaseProtected {
    
    protected String atributoProtected = "Valor atributo protected";
    
    protected ClaseProtected() {
        System.out.println("Constructor protected");
    }
    
    public ClaseProtected(String texto) {
        System.out.println(texto);
    }
    
    protected void metodoProtected(){
        System.out.println("Metodo protected");
    }
}

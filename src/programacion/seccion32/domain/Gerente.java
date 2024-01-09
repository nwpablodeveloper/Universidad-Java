package programacion.seccion32.domain;

public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    
    @Override // sobreescribimos el metodo de la clase padre
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }

    public void imprimir(Gerente gerente1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

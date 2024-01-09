package programacion.seccion31.domain;

public class Gerente extends Empleado{
    
    private String departamento;
    
    public Gerente(String nombre, double sueldo, String departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override // Sobreescribir el mismo metodo en la clase padre 
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Departamento: " + this.departamento;
    }
    
}

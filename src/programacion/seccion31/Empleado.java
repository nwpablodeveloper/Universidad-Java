package programacion.seccion31;

public class Empleado {

    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    public String btenerDetalles(){
        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
}

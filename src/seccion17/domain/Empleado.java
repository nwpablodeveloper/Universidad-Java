

package seccion17.domain;

public class Empleado extends Persona{
    
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    public Empleado(){
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }

    public Empleado(String nombre, double sueldo){
        
        //super(nombre);
        this();// Llamamos al constructor de esta misma clase
        /* 
            como primera linea solo puede ester el llamado a la clase padre 
            o el llamado a un constructor de la misma clase
        */
        
        this.nombre = nombre; // Llamo a los atributos de la clase padre al no poder usar super()
        this.sueldo = sueldo;
    }

    public int getIdEmpleado() {
        return this.idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado=").append(this.idEmpleado);
        sb.append(", sueldo=").append(this.sueldo);
//        sb.append(" nombre=").append(this.nombre);
        sb.append(" \n\t\t").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
    
}

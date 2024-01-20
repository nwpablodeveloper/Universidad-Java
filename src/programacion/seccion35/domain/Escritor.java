package programacion.seccion35.domain;

public class Escritor extends Empleado{
    
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
    
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles() + ", Tipo de escritura " + tipoEscritura.getDescripcion();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escritor{");
        sb.append("tipoEscritura=").append(tipoEscritura);
        sb.append(", Empleado: ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }

    
}

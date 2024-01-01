package fundamentos.seccion23.mx.com.gm.ventas;

public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProducto;
    
    private Producto(){
        this.idProducto = ++Producto.contadorProducto;
    }
    
    public Producto(String nombre, double precio){
        this(); // Llamar al constructor privado
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
}

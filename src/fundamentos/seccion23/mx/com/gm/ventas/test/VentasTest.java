

package fundamentos.seccion23.mx.com.gm.ventas.test;

import fundamentos.seccion23.mx.com.gm.ventas.Orden;
import fundamentos.seccion23.mx.com.gm.ventas.Producto;


public class VentasTest {
    public static void main(String[] args) {
        
        Producto producto1 = new Producto("Salchichas", 3.4);
        Producto producto2 = new Producto("fideos", 2.80);
        Producto producto3 = new Producto("Manteca", 2.25);
        Producto producto4 = new Producto("tomate", 1.2);
        Producto producto5 = new Producto("oregano", .73);
        Producto producto6 = new Producto("ajo", 0.4);
        Producto producto7 = new Producto("ajo", 0.4);
        Producto producto8 = new Producto("ajo", 0.4);
        Producto producto9 = new Producto("ajo", 0.4);
        Producto producto10 = new Producto("ajo", 0.4);
        Producto producto11 = new Producto("ajo", 0.4);        
        
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);
        
        Orden orden2 = new Orden();
        orden2.agregarProducto(producto1);
        orden2.agregarProducto(producto2);
        orden2.agregarProducto(producto3);
        orden2.agregarProducto(producto4);
        
        
        orden1.mostrarOrden();
        System.out.println("");
        orden2.mostrarOrden();
        
    }
    
}

package programacion.seccion37.accesodatos.test;

import programacion.seccion37.accesodatos.*;

public class TestInterfaces {
    public static void main(String[] args) {
        
        // Declaramos una variable del tipo Intarfece creada
        // Intaciamos la variable con una clase que implementa dicha Interface
        IAccesoDatos datos1 = new ImplementacionMySql();
        IAccesoDatos datos2 = new ImplementacionOracle();
        
        System.out.println("--------------------");
        
        imprimir(datos1);
        datos1 = new ImplementacionOracle();
        imprimir(datos2);
        
        System.out.println("--------------------");
        
        // Hacmos uso del polimorfismo
        datos1.actualizar();
        datos2.eliminar();
        
        datos1 = new ImplementacionOracle();
        datos1.listar();
        
        System.out.println("--------------------");
        imprimir(datos1);
        
    }
    
    // Polimorfismo con interfaces
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}

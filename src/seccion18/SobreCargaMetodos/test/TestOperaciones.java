package seccion18.SobreCargaMetodos.test;

import seccion18.SobreCargaMetodos.operaciones.Operaciones;

public class TestOperaciones {

    public static void main(String[] args) {

        // puedo llamar directamente al metodo por que es de tipo static
        var resultado = Operaciones.sumar(22, 30);
        System.out.println("resultado = " + resultado);
        
        System.out.println("");
        
        double resultado2 = Operaciones.sumar(35.25, 8.27);
        System.out.println("resultado2 = " + resultado2);
        
        System.out.println("");
        
        var resultado3 = Operaciones.sumar(3, 5L);
        System.out.println("resultado3 = " + resultado3);

    }
}

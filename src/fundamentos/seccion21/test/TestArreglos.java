package fundamentos.seccion21.test;

public class TestArreglos {
    public static void main(String[] args) {
        
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
        // Modificar valores según su posición
        edades[0] = 34;
        edades[1] = 20;
        edades[2] = 78;
        
        System.out.println("edades = " + edades[0]);
        System.out.println("edades = " + edades[1]);
        System.out.println("edades = " + edades[2]);
        
        System.out.println("");
        
        // Recorrer el array con un ciclo for
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades "+ i +"  = " + edades[i]);
        }
        
        for(int h = 0; h <= 100; h++){
            System.out.println("h = " + h);
        }
    }
}

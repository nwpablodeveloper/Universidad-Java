package programacion.seccion29.test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        
        // Clases Envolventes de tipos primitivos
        /*
            int - Integer
            long - Long
            float - Float
            double - Double
        */
        
        
        int entero = 10; // Autoboxing
        System.out.println("entero2 = " + entero);
        
        Integer enteroEnvolvente = 20;
        System.out.println("enteroEnvolvente = " + enteroEnvolvente.floatValue());
       
        int entero2 = enteroEnvolvente; // unboxing
        System.out.println("entero2 = " + entero2);
        
    }
}

package fundamentos.seccion04;


public class V2_TiposNumericosEnteros {
    
    public static void main(String arg[]){   
        
            
        short numerShort = 32767;
        System.out.println("numeroShort = " + numerShort);
        System.out.println("Minimo adminitible en short: " + Short.MIN_VALUE);
        System.out.println("Maximo adminitible en short: " + Short.MAX_VALUE);
        
        System.out.println("");
            
        int numeroInt = 35;
        System.out.println("numerInteger = " + numeroInt);
        System.out.println("Minimo adminitible en Int: " + Integer.MIN_VALUE);
        System.out.println("Maximo adminitible en Int: " + Integer.MAX_VALUE);
        numeroInt = (int)2147483648L;
        System.out.println("Convertir Integer exeedido a Long = " + numeroInt);
        System.out.println("Al convertir tenemos perdida de presición");
        
        System.out.println("");
    
        long numeroLong = 64564;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Minimo adminitible en Long: " + Long.MIN_VALUE);
        System.out.println("Maximo adminitible en Long: " + Long.MAX_VALUE);
        
        
    }
    
}

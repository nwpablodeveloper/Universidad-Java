package programacion.seccion25;

public class TestArgumentosVariables {
    public static void main(String[] args) {
    
        imprimirNumeros(1,2,3,4,5);
        
        System.out.println("");
        
        imprimirNumeros(1,2);
        
        System.out.println("");
        
        variosParametros("Juan", 35,8,9);
            
    }
    
    // El argumento variable tiene que ser el ultimo parametro
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
    // Los 3 puntos quiere decir que vamos a recibir argumentos variables
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("elemento:  " + numeros[i]);
        }
    }
}

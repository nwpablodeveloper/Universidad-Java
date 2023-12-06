
public class TiposEnterosTiposString {
    
    static public void main(String arg[]){
        
        // Definimos la variable
        int miVariableEntera = 10;
        System.out.println("miVariableEntera = " + miVariableEntera);
        // Modificar su valor
        miVariableEntera = 35;
        System.out.println("miVariableEntera = " + miVariableEntera);
        
        // Variables cadenas de textos
        String miVariableCadena = "Hola mundo desde Java";
        System.out.println("miVariableCadena = " + miVariableCadena);
        
        // Podemos modificar la variable
        miVariableCadena = "Adios desde Java"; 
        
        /* var - va a hacer inferencia de tipos de datos en Java
            Aparece desde el JDK V.10 en adelante
        */
        var miVariable1 = 10; // Automoaticamente reconoce que es: int
        var miVariable2 = "Hola"; // reconoce que es: String
        
    }
    
}


package zpruebas;


public class CrearPersona {
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("PaBLO", "Veiga", true);
        
        // Metodo que no regresa nada
        persona1.mostrarReferencia(persona1);
        
        // Return que regresa un integer
        int retorno1 = persona1.retornoInteger();
        System.out.println("retorno1 = " + retorno1);
        
        // Regresar null significa que solo tenemos declarada la variable
        System.out.println(persona1.retornoNull(persona1));
        
        persona1 = persona1.retornoNull(persona1);
        System.out.println("persona1 = " + persona1);
    }
    
}

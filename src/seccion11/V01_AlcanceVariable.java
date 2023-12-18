

package seccion11;

public class V01_AlcanceVariable {
 
    public static void main(String[] args) {
        
        // Estas variables se crean y destruyen dentro de este metodo
        var a = 35;
        var b = 66;
        
        System.out.println("Metodo principal");
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        
        // Si estoy dentro de un metodo static, solo puedo llamar a otro
        // metodo static
        otroMetodo();
        
    }
    
    public static void otroMetodo(){
        
        System.out.println("");
        
        System.out.println("Otro Metodo");
        
        // Podemos volver a declarar variables con el mismo nombre en un
        // metodo diferente
        var a = 1321;
        var b = 987;
        
    }
    
}

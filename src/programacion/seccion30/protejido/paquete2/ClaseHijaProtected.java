package programacion.seccion30.protejido.paquete2;

import programacion.seccion30.protejido.paquete1.ClaseProtected;

public class ClaseHijaProtected extends ClaseProtected{
    
    /* 
        En una clase hija podemos acceder a todo lo que tenga la clase
        la clase padre con modificadores PROTECTED
    */
    
    
    public ClaseHijaProtected(){
        //super(); // Podemos llamar al construcor PROTECTED de la clase padre
        
        this.atributoProtected = "Atributo protected accedido";
        System.out.println("Atributo protected: " + this.atributoProtected);
        this.metodoProtected(); 
    }
    
}

package programacion.seccion30.privado.paquete2;

import programacion.seccion30.privado.paquete1.ClasePrivate;

public class ClaseHijaPrivate extends ClasePrivate{
    
    
    
    public ClaseHijaPrivate(){
        
        super("Publico");
        
        /* 
            Necesitamos acceder con un constructor publico de la
            clase padre privada para poder tener acceso al resto 
            del codigo de la clase privada
        */        
    }
    
}

package fundamentos.seccion14;

public class PalabraThis {

    public static void main(String[] args) {

        Persona persona = new Persona("Pablo", "Veiga");

        System.out.println("");
        System.out.println("4 Lugar en memoria = " + persona);
        System.out.println("5 persona Nombre = " + persona.nombre);
        System.out.println("6 persona Apellido = " + persona.apellido);
        
        
    }
    
    

}

class Persona {

    String nombre;
    String apellido;

    Persona(String nombre, String apellido) {

        // super(); llamada al constructor de la clase Padre ( Object )
        this.nombre = nombre;
        this.apellido = apellido;
        
        System.out.println("1 Impresion del Object actual = " + this);

        new Imprimir().imprimir(this);
    }

}

class Imprimir {
    
    public void imprimir(Persona persona){
        
        System.out.println("");
        System.out.println("2 Persona desde imprimir: " + persona);
        System.out.println("3 Impresion del Object actual: " + this);
    }
    
}

/*
Resultado en consola

1 Impresion del Object actual = seccion14.Persona@5f184fc6

2 Persona desde imprimir: seccion14.Persona@5f184fc6
3 Impresion del Object actual: seccion14.Imprimir@b4c966a

4 Lugar en memoria = seccion14.Persona@5f184fc6
5 persona Nombre = Pablo
6 persona Apellido = Veiga
*/
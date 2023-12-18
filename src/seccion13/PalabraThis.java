package seccion13;

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
        
        System.out.println("1 objeto Persona con this = " + this);

        new Imprimir().imprimir(this);
    }

}

class Imprimir {
    
    public void imprimir(Persona persona){
        
        System.out.println("");
        System.out.println("2 Persona desde imprimir: " + persona);
        System.out.println("3 Object ( this )desde imprimir: " + this);
    }
    
}
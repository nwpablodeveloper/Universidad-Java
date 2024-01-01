package programacion.seccion27.domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    // bloque de inicialización estatico
    // se ejecuta al crearse la clase en memoria
    // los metodos static no usan el operador THIS
    static{
        System.out.println("Ejecucion bloque static - se ejecuta al crear la clase");
        ++Persona.contadorPersona;
    }
    
    // bloque de inicialización NO static
    // se ejecuta antes del constructor
    // se ejecuta en cada Object creado
    {
        System.out.println("Bloque NO static - se ejecuta al crear el objeto");
        this.idPersona = Persona.contadorPersona++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del constructor - se ejecuta al crear el objeto");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
}

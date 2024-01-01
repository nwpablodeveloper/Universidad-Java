package programacion.seccion26.test;

import programacion.seccion26.Continentes;
import programacion.seccion26.Dias;

public class TestEnumeraciones {

    public static void main(String[] args) {
        
        System.out.println("Dia 1 de la semana: " + Dias.LUNES);
        
        indicarDiaSemana(Dias.LUNES);
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Continente nro. 4: " + Continentes.AMERICA);
        System.out.println("Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
        
        System.out.println("");
        
        System.out.println("Continente nro. 1: " + Continentes.AFRICA);
        System.out.println("Paises en continente nro. 1: " + Continentes.AFRICA.getPaises());
        
    }

    private static void indicarDiaSemana(Dias dias) {
        switch (dias) {
            case LUNES:
                System.out.println("primer dia de la semana");
                break;
            case MARTES:
                System.out.println("Segundo daa de la semana");
                break;
            default:
                System.out.println("No hay ningun dia valido");
        }
    }

}

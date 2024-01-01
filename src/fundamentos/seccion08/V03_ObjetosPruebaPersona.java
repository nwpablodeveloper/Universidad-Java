package fundamentos.seccion08;

public class V03_ObjetosPruebaPersona {

    public static void main(String arg[]) {

        V02_AtributosMetodosClasePersona persona1 = new V02_AtributosMetodosClasePersona();
        V02_AtributosMetodosClasePersona persona2 = new V02_AtributosMetodosClasePersona();

        V02_AtributosMetodosClasePersona persona3 = persona2;

        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        System.out.println("persona3 = " + persona3);

        System.out.println("");

        System.out.println("persona1");
        persona1.nombre = "Pablo";
        persona1.apellido = "Veiga";
        persona1.desplegarInformacion();
        
        System.out.println("");

        System.out.println("persona2");
        persona2.nombre = "Sophia";
        persona2.apellido = "Veiga";
        persona2.desplegarInformacion();
        
        System.out.println("");

        System.out.println("persona3");
        persona3.nombre = "Romina";
        persona3.apellido = "Diaz";
        persona3.desplegarInformacion();
        
        System.out.println("");
        
        System.out.println("persona2");
        persona2.nombre = "Soledad";
        persona2.apellido = "Dening";
        persona2.desplegarInformacion();
        
        System.out.println("");
        System.out.println("persona3");
        persona3.desplegarInformacion();


    }

}

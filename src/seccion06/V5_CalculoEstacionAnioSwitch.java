package seccion06;

public class V5_CalculoEstacionAnioSwitch {

    public static void main(String arg[]) {

        var mes = 1;
        var estacion = "Estacion desconocida";

        switch (mes) {
            case 1:
            case 2:
            case 12:
                estacion = "Invierno";
                break;
            case 3:
            case 4:
            case 5:
                estacion = "Primaveroa";
                break;
            case 6:
            case 7:
            case 8:
                estacion = "Verano";
                break;
            case 9:
            case 10:
            case 11:
                estacion = "Otonio";
        }
        System.out.println("estacion = " + estacion);

    }

}

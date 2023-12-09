
public class V6_TiposPrimitivosTipoBoolean {

    public static void main(String arg[]) {

        boolean varBoolean = false;
        System.out.println("varBoolean = " + varBoolean);

        if (varBoolean) {
            System.out.println("Es verdadera");
        } else {
            System.out.println("Es falso");
        }
        
        var edad = 35;
        System.out.println("edad = " + edad);
        //var esAdulto = edad >= 18;
        
        //(esAdulto){
        if(edad >=18){
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
        

    }

}

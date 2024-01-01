package fundamentos.seccion03;


public class Concatenacion {

    static public void main(String arg[]) {

        var usuario = "Pablo Veiga";
        var titulo = "Estudiante de Java";

        var union = titulo + ": " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        System.out.println( i + j);
        System.out.println( i + j + " Texto" );
        System.out.println( "" + i + j ); // convierte todo a String

    }

}

package programacion.seccion42.test;

import java.io.FileNotFoundException;
import static programacion.seccion42.manejoarchivos.ManejoArchivos.escribirArchivo;
import static programacion.seccion42.manejoarchivos.ManejoArchivos.crearArchivo;
import static programacion.seccion42.manejoarchivos.ManejoArchivos.anexarArchivo;
import static programacion.seccion42.manejoarchivos.ManejoArchivos.leerArchivo;
//import static programacion.seccion42.manejoarchivos.ManejoArchivos.*;

public class TestManejoArchivos {
    public static void main(String[] args) throws FileNotFoundException {
        
        var ruta = "d:\\cursos\\Universidad Java\\archivos creados\\seccion42\\";
        var nombreArchivos = ruta + "prueba.txt";
        
        crearArchivo(nombreArchivos);
        
        escribirArchivo(nombreArchivos, "estoy escribiendo el archivo");
        escribirArchivo(nombreArchivos, "sobreescribi el archivo");
        
        anexarArchivo(nombreArchivos, "Esta es la prueba de la seccion 42");
        anexarArchivo(nombreArchivos, "Estoy agregando contenido");
        anexarArchivo(nombreArchivos, "Estoy agregando contenido 2");
        anexarArchivo(nombreArchivos, "Estoy agregando contenido 3");
        
        System.out.println("");
        leerArchivo(nombreArchivos);
        
        
        
    }
}

package programacion.seccion41_1.test;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;


public class TestColeccionesGeneric {
    public static void main(String[] args) {
        
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        String elemento = miLista.get(0);
        System.out.println("elemento = " + elemento);
        
        System.out.println("----- Mi List -----");
        imprimir(miLista);
        
        
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes"); // No se pueden duplicar los elementos
        
        System.out.println("");
        System.out.println("----- Mi Set -----");
        imprimir(miSet);
        
        System.out.println("");
        System.out.println("HashMap");
        System.out.println("");
        
        Map miMapa = new HashMap();
        miMapa.put("nombre", "Pablo");
        miMapa.put("apellido", "Veiga");
        miMapa.put("edad", 35);
        
        System.out.println("miMapa = " + miMapa);
        
        String nombre = (String) miMapa.get("nombre"); // el get devuelve un objeto
        String apellido = (String) miMapa.get("apellido"); // el get devuelve un objeto
        Integer edad = (Integer) miMapa.get("edad"); // el get devuelve un objeto
        System.out.println( nombre);
        System.out.println( apellido);
        System.out.println( edad);
        
        System.out.println("");
        System.out.println("miMapa.Keyset()");
        imprimir(miMapa.keySet());
    }
    
    public static void imprimir(Collection<String> coleccion){
        
        System.out.println("----- Con For de tipo Object-----");
        
        for(Object elemento: coleccion){
            System.out.println(elemento);
        }
        
        System.out.println("----- Con For de tipo String-----");
        for(String elemento: coleccion){
            System.out.println(elemento);
        }
        
        System.out.println("----- Con ForEach -----");
        
        coleccion.forEach( dia ->  {
            System.out.println(dia);
        });
        
    }
}

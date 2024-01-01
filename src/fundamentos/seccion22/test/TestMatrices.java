package fundamentos.seccion22.test;

import fundamentos.seccion22.domain.Persona;



public class TestMatrices {
    public static void main(String[] args) {
        int edades[][] = new int[3][4];
        System.out.println("edades = " + edades);
        System.out.println("");
        
        edades[0][0] = 00;
        edades[0][1] = 01;
        edades[0][2] = 02;
        edades[0][3] = 03;
        
        edades[1][0] = 10;
        edades[1][1] = 11;
        edades[1][2] = 12;
        edades[1][3] = 13;
        
        edades[2][0] = 20;
        edades[2][1] = 21;
        edades[2][2] = 22;
        edades[2][3] = 23;
        
        
        System.out.println("edades[0][0] = " + edades[0][0]);
        System.out.println("edades[0][1] = " + edades[0][1]);
        System.out.println("edades[0][2] = " + edades[0][2]);
        System.out.println("edades[0][3] = " + edades[0][3]);
        
        
        System.out.println("");
        
        for(int renglon = 0; renglon < edades.length; renglon++){
            
            for(int columna = 0; columna < edades[renglon].length; columna++){
                System.out.println("columna["+renglon+"]["+columna+"] = " + edades[renglon][columna]);
            }
            
        }
        
        System.out.println("");
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Zarzamora"}};
        
        for(int ren = 0; ren < frutas.length; ren++){
            for(int col = 0; col < frutas[ren].length; col++){
                System.out.println("frutas["+ren+"]["+col+"] = " + frutas[ren][col]);
            }
        }
        
        System.out.println("");
        
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Sophia");
        personas[0][2] = new Persona("Romina");
        
        imprimir(frutas);
        imprimir(personas);
        
        
    }
    
    public static void imprimir(Object matriz[][]){
        for(int ren = 0; ren < matriz.length; ren++){
            for(int col = 0; col < matriz[ren].length; col++){
                System.out.println("frutas["+ren+"]["+col+"] = " + matriz[ren][col]);
            }
        }
    }
}

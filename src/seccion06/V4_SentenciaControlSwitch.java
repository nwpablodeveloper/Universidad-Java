/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seccion06;

public class V4_SentenciaControlSwitch {
    
    public static void main(String arg[]){
    
        var numero = 4;
        var numeroTexto = "Valor desconocido";
        
        switch( numero ){
            
            case 1:
                numeroTexto = "Uno";
                break;
            case 2:
                numeroTexto = "Dos";
                break;
            case 3:
                numeroTexto = "Tres";
                break;
            case 4:
                numeroTexto = "Cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
            
        }
        
        System.out.println("numeroTexto = " + numeroTexto);
        
    }
    
}

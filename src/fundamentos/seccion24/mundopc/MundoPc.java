package fundamentos.seccion24.mundopc;

import fundamentos.seccion24.com.gm.mundopc.Computadora;
import fundamentos.seccion24.com.gm.mundopc.Monitor;
import fundamentos.seccion24.com.gm.mundopc.Orden;
import fundamentos.seccion24.com.gm.mundopc.Raton;
import fundamentos.seccion24.com.gm.mundopc.Teclado;

public class MundoPc {

    public static void main(String[] args) {
        
        Monitor monitor1 = new Monitor("Samsung", 27);
        Monitor monitor2 = new Monitor("Samsung", 23);
        Monitor monitor3 = new Monitor("Samsung", 20);
        Monitor monitor4 = new Monitor("keap", 27);
        
        Raton raton1 = new Raton("Genius", "usb");
        Raton raton2 = new Raton("Genius", "wifi");
        Raton raton3 = new Raton("Genius", "bluetooth");
        
        Teclado teclado1 = new Teclado("Bluetooth", "genius");
        Teclado teclado2 = new Teclado("wifi", "Mars");
        Teclado teclado3 = new Teclado("usb", "Noganet");
        
        System.out.println("monitor3 = " + monitor1);        
        System.out.println("monitor2 = " + monitor2);
        System.out.println("monitor3 = " + monitor3);
        
        System.out.println("");
        
        System.out.println("teclado3 = " + teclado1);
        System.out.println("teclado2 = " + teclado2);
        System.out.println("teclado3 = " + teclado3);
        
        System.out.println("");
        
        System.out.println("raton3 = " + raton1);
        System.out.println("raton2 = " + raton2);
        System.out.println("raton3 = " + raton3);
        
        System.out.println("");        
        
        Computadora compu1 = new Computadora("Pc work",monitor1, teclado2, raton3);
        Computadora compu2 = new Computadora("Pc gaming",monitor2, teclado3, raton1);
        Computadora compu3 = new Computadora("Pc gaming",monitor2, teclado3, raton1);
        Computadora compu4 = new Computadora("Pc gaming",monitor2, teclado3, raton1);
        Computadora compu5 = new Computadora("Pc gaming",monitor2, teclado3, raton1);
        Computadora compu6 = new Computadora("Pc gaming",monitor2, teclado3, raton1);
        Computadora compu7 = new Computadora("Pc gaming",monitor2, teclado3, raton1);
        Computadora compu8 = new Computadora("Pc gaming",monitor2, teclado3, raton1);
        Computadora compu9 = new Computadora("Pc gaming",monitor2, teclado3, raton1);
        Computadora compu10 = new Computadora("Pc gaming",monitor2, teclado3, raton1);

        System.out.println("compu1 = " + compu1);
        compu1.setMonitor(monitor4);
        
        System.out.println("");

        Orden orden1 = new Orden();
        
        orden1.agregarComputadora(compu1);
        orden1.agregarComputadora(compu2);
        orden1.agregarComputadora(compu3);
        orden1.agregarComputadora(compu4);
        orden1.agregarComputadora(compu5);
        orden1.agregarComputadora(compu6);
        orden1.agregarComputadora(compu7);
        orden1.agregarComputadora(compu8);
        orden1.agregarComputadora(compu9);
        orden1.agregarComputadora(compu10);
        
        orden1.mostrarOrden();
    }
    
}

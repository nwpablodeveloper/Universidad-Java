package fundamentos.seccion24.com.gm.mundopc;

public class Orden {

    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private final int MAX_COMPUTADORAS = 10;
    private int contadorComputadoras;

    public Orden() {
        this.computadoras = new Computadora[this.MAX_COMPUTADORAS];
        this.idOrden = ++Orden.contadorOrdenes;
    }

    public void agregarComputadora(Computadora computadora) {
        if (this.contadorComputadoras < this.MAX_COMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        } else {
            System.out.println("No se pueden agregar mas items a la orden");
        }
    }

    public void mostrarOrden() {
        System.out.println("Orden # " + this.idOrden);
        for (int i = 0; i < this.contadorComputadoras; i++) {
            System.out.println("item " + i + " = " + this.computadoras[i]);
        }
    }
}

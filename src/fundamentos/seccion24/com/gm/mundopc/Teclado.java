package fundamentos.seccion24.com.gm.mundopc;

import fundamentos.seccion24.com.gm.mundopc.DispositivoEntrada;

public class Teclado extends DispositivoEntrada{

    private int idTeclado;
    private static int contadorTeclados;
    
    public Teclado(String tipoEntrada, String marca){
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado{");
        sb.append("idTeclado=").append(idTeclado);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
}

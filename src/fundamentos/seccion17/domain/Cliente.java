

package fundamentos.seccion17.domain;

import java.util.Date;


public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(
            Date fechaRegistro,
            boolean vip,
            String nombre,
            char genero,
            int edad,
            String direccion
       ){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++Cliente.contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public int getIdCliente() {
        return this.idCliente;
    }
    

    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente=").append(idCliente);
        sb.append(",\n\t\t fechaRegistro=").append(fechaRegistro);
        sb.append(",\n\t\t  vip=").append(vip);
        sb.append("\n\t\t").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
    
}

package programacion.seccion37.accesodatos;

public interface IAccesoDatos {
    int MAX_REGISTROS = 10;
    
    // Metodos abstracto
    void insertar();
    void listar();
    void actualizar();
    void eliminar();
}

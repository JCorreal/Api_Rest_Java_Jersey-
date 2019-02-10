package DAL; // Interface que expone todo lo que el DAL (Capa Acceso Datos) implementa  

import BO.Usuario;
import java.util.List;

public interface IAccesoDatos {
    
  public List<Usuario> ObtenerListadoUsuarios();
  public Usuario ObtenerUsuario (int DatoBuscar);
  public int GuardarUsuario(Usuario usuaurio);
  public int EliminarUsuario(int DatoEliminar);
  
}

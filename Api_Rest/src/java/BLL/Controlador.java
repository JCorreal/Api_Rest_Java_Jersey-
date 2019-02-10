package BLL; // Este es el Controlador Manager general de todo el sistema. Todo tiene que pasar por esta clase

import BO.Usuario;
import DAL.IAccesoDatos;
import java.util.List;

public class Controlador {
    
    private IAccesoDatos _accesoDatos; 
    
    public Controlador(IAccesoDatos accesoDatos)
    {
       _accesoDatos = accesoDatos;
    }
    
    public List<Usuario> ObtenerListadoUsuarios()
    {
       return _accesoDatos.ObtenerListadoUsuarios();
    }
    
    public Usuario ObtenerUsuario(int DatoBuscar)
    {
       return  _accesoDatos.ObtenerUsuario(DatoBuscar);
    }
    
    public int GuardarUsuario(Object objeto) 
    {   
        return _accesoDatos.GuardarUsuario((Usuario) objeto);        
    }
    
    public int EliminarUsuario(int DatoEliminar)
    {
        return _accesoDatos.EliminarUsuario(DatoEliminar);
    }
 
}

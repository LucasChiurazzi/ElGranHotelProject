
package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class TipoHabitacionData {
   private Connection connection;
   
//constructor
   public TipoHabitacionData(Conexion conexion) {
       try {
           connection=conexion.getConexion();
       } catch (SQLException ex) {
          System.out.println("Error al obtener la conexion");
       }
    }
//   metodos
   
//muestra un tipo de habitacion filtrado por su codigo o id.   
   public TipoHabitacion mostrarTipoHabitacion(int idTipoHabitacion){
       TipoHabitacion tipoHabitacion = null;
       
  try{
       String sql= "SELECT * FROM tipohabitacion WHERE idTipoHabitacion = ? ;";
          
       PreparedStatement st = connection.prepareStatement(sql);
       st.setInt(1, idTipoHabitacion);
       ResultSet rs = st.executeQuery();
      
       
       while (rs.next()){
           tipoHabitacion = new TipoHabitacion();
           
           tipoHabitacion.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
          
           tipoHabitacion.setCategoriaTipoHabitacion(rs.getString("categoriaTipoHabitacion"));
     
           tipoHabitacion.setCantPersonasTipoHabitacion(rs.getInt("cantPersonasTipoHabitacion"));
          
           tipoHabitacion.setPrecioNocheTipoHabitacion(rs.getDouble("precioNocheTipoHabitacion"));
          
           tipoHabitacion.setTipoCamaTipoHabitacion(rs.getString("tipoCamaTipoHabitacion"));
   
           tipoHabitacion.setCantidadCamasTipoHabitacion(rs.getInt("cantCamasTipoHabitacion"));

              
           }
       
       st.close();
       
      } catch (SQLException ex) {
            System.out.println("Error al obtener los tipo de habitaciones: " + ex.getMessage());
        } 
       
       
       return tipoHabitacion;
    }
//muestra todos los tipos de habitacion   
    public List<TipoHabitacion> mostrarTipoHabitacion(){
       List<TipoHabitacion> tipoHabitaciones = new ArrayList<>();
       
  try{
       String sql= "SELECT * FROM tipohabitacion;";
          
       PreparedStatement st = connection.prepareStatement(sql);
       
       ResultSet rs = st.executeQuery();
       
       TipoHabitacion tipoHabitacion;
       
       while (rs.next()){
           tipoHabitacion = new TipoHabitacion();
           tipoHabitacion.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
           tipoHabitacion.setCategoriaTipoHabitacion(rs.getString("categoriaTipoHabitacion"));
           tipoHabitacion.setCantPersonasTipoHabitacion(rs.getInt("cantPersonasTipoHabitacion"));
           tipoHabitacion.setPrecioNocheTipoHabitacion(rs.getDouble("precioNocheTipoHabitacion"));
           tipoHabitacion.setTipoCamaTipoHabitacion(rs.getString("tipoCamaTipoHabitacion"));
           tipoHabitacion.setCantidadCamasTipoHabitacion(rs.getInt("cantCamasTipoHabitacion"));

                tipoHabitaciones.add(tipoHabitacion);
           }
       
       st.close();
       
      } catch (SQLException ex) {
            System.out.println("Error al obtener los tipos de habitaciones: " + ex.getMessage());
        } 
       
       
       return tipoHabitaciones;
    }

//elimina un tipo de habitacion con su id
       public void eliminarTipoHabitacion (int idTipoHabitacion){
    try {
            
            String sql = "DELETE FROM tipohabitacion WHERE idTipoHabitacion =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, idTipoHabitacion);
                       
            statement.executeUpdate();
             
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un tipo de Habitacion: " + ex.getMessage());
        }
   
   
}

//modifica los tipos de habitacion    
   public void cambiarTipoHabitacion (TipoHabitacion tipoHabitacion){
    
        try {
            
            String sql = "UPDATE tipohabitacion SET categoriaTipoHabitacion= ? , "
                    + "cantPersonasTipoHabitacion = ? , precioNocheTipoHabitacion= ? , tipoCamaTipoHabitacion= ? , cantCamasTipoHabitacion= ? \n"
                    + "WHERE idTipoHabitacion = ? ;";

            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setString(1, tipoHabitacion.getCategoriaTipoHabitacion());
            statement.setInt(2, tipoHabitacion.getCantPersonasTipoHabitacion());
            statement.setDouble(3, tipoHabitacion.getPrecioNocheTipoHabitacion());
            statement.setString(4, tipoHabitacion.getTipoCamaTipoHabitacion());
            statement.setInt(5, tipoHabitacion.getCantidadCamasTipoHabitacion());
            statement.setInt(6, tipoHabitacion.getIdTipoHabitacion());
            
            statement.executeUpdate();
            
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un tipo de habitacion: " + ex.getMessage());
        }
    
} 

//agrega los tipos de habitacion   
   public void agregarTipoHabitacion(TipoHabitacion tipoHabitacion){
        try {
            
            String sql = "INSERT INTO  tipohabitacion ( idTipoHabitacion, categoriaTipoHabitacion, cantPersonasTipoHabitacion, "
                    + "precioNocheTipoHabitacion, tipoCamaTipoHabitacion, cantCamasTipoHabitacion) VALUES ( ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, tipoHabitacion.getIdTipoHabitacion());
            statement.setString(2, tipoHabitacion.getCategoriaTipoHabitacion());
            statement.setInt(3, tipoHabitacion.getCantPersonasTipoHabitacion());
            statement.setDouble(4, tipoHabitacion.getPrecioNocheTipoHabitacion());
            statement.setString(5, tipoHabitacion.getTipoCamaTipoHabitacion());
            statement.setInt(6, tipoHabitacion.getCantidadCamasTipoHabitacion());
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al crear un tipo de habitacion: " + ex.getMessage());
        }
    }

//metodo exclusivo para actualiar solamente el precio de un tipo de habitacion, pedido en el enunciado.   
   public void cambiarPrecioTipoHabitacion(double precio, int idTipoHabitacion){
       try {
            
            String sql = "UPDATE tipohabitacion SET precioNocheTipoHabitacion= ? \n WHERE idTipoHabitacion = ? ;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setDouble(1, precio);
            statement.setInt(2, idTipoHabitacion);
         
            statement.executeUpdate();
                                    
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar el precio de un tipo de habitacion: " + ex.getMessage());
        }
    
   }
   
   //muestra un tipo de habitacion filtrado por su codigo o id.   
   public TipoHabitacion buscarTipoHabitacion(int idTipoHabitacion){
       TipoHabitacion tipoHabitacion= null;
 
       try{
       String sql= "SELECT * FROM tipohabitacion \n WHERE idTipoHabitacion = " +idTipoHabitacion + ";";
          
       PreparedStatement st = connection.prepareStatement(sql);
       
       ResultSet rs = st.executeQuery();
                
      while (rs.next()){
           tipoHabitacion = new TipoHabitacion();
           tipoHabitacion.setIdTipoHabitacion(rs.getInt("idTipoHabitacion"));
           tipoHabitacion.setCategoriaTipoHabitacion(rs.getString("categoriaTipoHabitacion"));
           tipoHabitacion.setCantPersonasTipoHabitacion(rs.getInt("cantPersonasTipoHabitacion"));
           tipoHabitacion.setPrecioNocheTipoHabitacion(rs.getDouble("precioNocheTipoHabitacion"));
           tipoHabitacion.setTipoCamaTipoHabitacion(rs.getString("tipoCamaTipoHabitacion"));
           tipoHabitacion.setCantidadCamasTipoHabitacion(rs.getInt("cantCamasTipoHabitacion"));

               
           }
       
       
       st.close();
       
      } catch (SQLException ex) {
            System.out.println("Error al obtener los tipoHabitaciones: " + ex.getMessage());
        }
             
       
       return tipoHabitacion;
    }
   
}

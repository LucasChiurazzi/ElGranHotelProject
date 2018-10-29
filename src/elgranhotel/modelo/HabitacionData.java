/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hugo
 */
public class HabitacionData {

   private Connection connection = null;
   private Conexion conexion;


//constructor toma una conexion
    public HabitacionData (Conexion conexion) {
        try {
            this.conexion=conexion;
            connection = conexion.getConexion();
            
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

//metodos
    
    //creo una nueva habitacion
public int guardarHabitacion(Habitacion habitacion){
         int rta=0;
    try {
                     
            String sql = "INSERT INTO habitacion (numeroHabitacion, pisoHabitacion, estadoHabitacion, IdTipoHabitacion) VALUES ( ? , ? , ? , ? ) ;";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, habitacion.getNumeroHabitacion());
            statement.setInt(2, habitacion.getPisoHabitacion());
            statement.setBoolean(3, habitacion.getEstadoHabitacion());
            statement.setInt(4, habitacion.getTipoHabitacion().getIdTipoHabitacion());
            rta=statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al guardar una habitacion: " + ex.getMessage());
        }
    return rta;
}
 
 public Habitacion buscarHabitacion(int numeroHabitacion, Conexion conexion){
 Habitacion habitacion = null;
   
        try {
            String sql = "SELECT * FROM habitacion WHERE numeroHabitacion = ? ;";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, numeroHabitacion);
            ResultSet resultSet = statement.executeQuery();
             while(resultSet.next()){
               habitacion = new Habitacion();
               habitacion.setNumeroHabitacion(resultSet.getInt("numeroHabitacion"));
               habitacion.setEstadoHabitacion(resultSet.getBoolean("estadoHabitacion"));
               habitacion.setPisoHabitacion(resultSet.getInt("pisoHabitacion"));
               habitacion.setTipoHabitacion(buscarTipoHabitacion(resultSet.getInt("IdTipoHabitacion"), conexion));
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar una habitacion: " + ex.getMessage());
        }
         return habitacion;
    }
 
    
    public void agregarHabitacion(Habitacion habitacion){
        try {
                     
            String sql = "INSERT INTO habitacion (numeroHabitacion, pisoHabitacion, estadoHabitacion, idTipoHabitacion) VALUES ( ? , ? , ? , ? , ?);";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, habitacion.getNumeroHabitacion());
            statement.setInt(2, habitacion.getPisoHabitacion());
            statement.setBoolean(3, habitacion.getEstadoHabitacion());
            statement.setInt(4, habitacion.getTipoHabitacion().getIdTipoHabitacion());
                      
            
            statement.executeUpdate();
            
            //ResultSet rs = statement.getGeneratedKeys();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una habitacion: " + ex.getMessage());
        }
    
    
}


//modifica todos los campos de una habitacion
    public void cambiarHabitacion(Habitacion habitacion){
    
       try {
            
            String sql = "UPDATE habitacion SET  pisoHabitacion = ?, estadoHabitacion = ?, idTipoHabitacion = ? WHERE numeroHabitacion = ?;";
// where tipode habitacion id??
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, habitacion.getPisoHabitacion());
            System.out.println("piso"+habitacion.getPisoHabitacion());
            statement.setBoolean(2, habitacion.getEstadoHabitacion());
            System.out.println("estado "+habitacion.getEstadoHabitacion());
            statement.setInt(3, habitacion.getTipoHabitacion().getIdTipoHabitacion());
            System.out.println("tipo "+habitacion.getTipoHabitacion().getIdTipoHabitacion());
            statement.setInt(4, habitacion.getNumeroHabitacion());
            System.out.println("numero"+habitacion.getNumeroHabitacion());
            
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una habitacion: " + ex.getMessage());
        }
    
    
}
//elimino habitacion filtrando por dni
    public void eliminarHabitacion(int numeroHabitacion){
    
    try {
            
            String sql = "DELETE FROM habitacion WHERE numeroHabitacion =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, numeroHabitacion);
                       
            statement.executeUpdate();
             
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al eliminar una habitacion: " + ex.getMessage());
        }
        
    
    
}

public Habitacion mostrarHabitacion(int numeroHabitacion){
        Habitacion habitacion = null;
            
            
        try {
            String sql = "SELECT * FROM habitacion WHERE numeroHabitacion = ? ;";
           
            PreparedStatement statement = connection.prepareStatement(sql);
            
            statement.setInt(1, numeroHabitacion);
            
            ResultSet resultSet = statement.executeQuery();
            
           
                        
            while(resultSet.next()){
                
                
               
                TipoHabitacion tipoHabitacion = new TipoHabitacion();
                
                
                habitacion = new Habitacion();
                
                habitacion.setNumeroHabitacion(resultSet.getInt("numeroHabitacion"));
                habitacion.setPisoHabitacion(resultSet.getInt("pisoHabitacion"));
                habitacion.setEstadoHabitacion(resultSet.getBoolean("estadoHabitacion"));
                TipoHabitacion th=mostrarTipoHabitacion(resultSet.getInt("idTipoHabitacion"));
                habitacion.setTipoHabitacion(th);
                
              
                
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las habitaciones: " + ex.getMessage());
        }
        
        
        return habitacion;
    }

   public TipoHabitacion mostrarTipoHabitacion(int id){
    
        TipoHabitacionData th=new TipoHabitacionData(conexion);
        return th.mostrarTipoHabitacion(id);
    
    }

    public List<Habitacion> obtenerHabitaciones(Conexion conexion){
     Habitacion habitacion;
     List<Habitacion> habitaciones= new ArrayList<>();
     try {
            String sql = "SELECT * FROM habitacion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                habitacion= new Habitacion();
                habitacion.setNumeroHabitacion(resultSet.getInt("numeroHabitacion"));
                habitacion.setPisoHabitacion(resultSet.getInt("pisoHabitacion"));
                habitacion.setEstadoHabitacion(resultSet.getBoolean("estadoHabitacion"));
                TipoHabitacion tH=buscarTipoHabitacion(resultSet.getInt("IdTipoHabitacion"), conexion);
                habitacion.setTipoHabitacion(tH);
                habitaciones.add(habitacion);
             }
             statement.close();
            } catch (SQLException ex) {
            System.out.println("Error al obtener las Habitaciones: " + ex.getMessage());
        }
     
    return habitaciones;
}

   public TipoHabitacion buscarTipoHabitacion(int idTipoHabitacion, Conexion conexion) {
       TipoHabitacionData tipohabitacionData = new TipoHabitacionData(conexion);
       TipoHabitacion th= tipohabitacionData.buscarTipoHabitacion(idTipoHabitacion);
        
        return th;
    }
 public int actualizarHabitacion(Habitacion habitacion){
    int rta=0;
       try {
            
            String sql = "UPDATE habitacion SET  pisoHabitacion = ?, estadoHabitacion = ?, IdTipoHabitacion = ? WHERE numeroHabitacion = ? ;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, habitacion.getPisoHabitacion());
            statement.setBoolean(2, habitacion.getEstadoHabitacion());
            statement.setInt(3, habitacion.getTipoHabitacion().getIdTipoHabitacion());
            statement.setInt(4, habitacion.getNumeroHabitacion());
            rta=statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar una habitacion: " + ex.getMessage());
        }
    return rta; 
    }
 
    public int borrarHabitacion(int numeroHabitacion){
    int rta=0;
    try {
            String sql = "DELETE FROM habitacion WHERE numeroHabitacion = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, numeroHabitacion);
            rta=statement.executeUpdate();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar una habitacion: " + ex.getMessage());
        }
    return rta;   
}
}



 


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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class HabitacionData {
    private Connection connection = null;
    private Habitacion habitacion;
    private TipoHabitacion tipoHabitacion;
    private Conexion conexion;
    private TipoHabitacionData tipoHabitacionData;


//constructor toma una conexion
    public HabitacionData (Conexion conexion) {
        
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

//metodos
    
    //creo una nueva habitacion
        
 public void agregarHabitacion(Habitacion habitacion){try {
                     
            String sql = "INSERT INTO habitacion (numeroHabitacion, pisoHabitacion, estadoHabitacion, TipoHabitacion_idTipoHabitacion)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, habitacion.getNumeroHabitacion());
            statement.setInt(2, habitacion.getPiso());
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
            
            String sql = "UPDATE habitacion SET  pisoHabitacion = ?, estadoHabitacion = ?, TipoHabitacion_idTipoHabitacion = ? WHERE numeroHabitacion = ?;";
// where tipode habitacion id??
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, habitacion.getPiso());
            statement.setBoolean(2, habitacion.getEstadoHabitacion());
            statement.setInt(3, habitacion.getTipoHabitacion().getIdTipoHabitacion());
            statement.setInt(4, habitacion.getNumeroHabitacion());
            
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una habitacion: " + ex.getMessage());
        }
    
    
}
//elimino habitacion filtrando por dni
    public void eliminarHabitacion(int nroHabitacion){
    
    try {
            
            String sql = "DELETE FROM habitacion WHERE idHabitacion =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, nroHabitacion);
                       
            statement.executeUpdate();
             
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al eliminar una habitacion: " + ex.getMessage());
        }
        
    
    
}
//sin terminar
public Habitacion mostrarHabitacion(int numeroHabitacion){
 Habitacion habitacion = null;
            

        try {
            String sql = "SELECT * FROM habitacion, tipohabitacion \n" +
                         "WHERE habitacion.idTipoHabitacion = tipohabitacion.idTipoHabitacion \n"
                         + "AND numeroHabitacion = ? ;";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            habitacion= new Habitacion();
            
            statement.setInt(1, numeroHabitacion);
            
            ResultSet resultSet = statement.executeQuery();
            
                       
                        
            while(resultSet.next()){
                
                
               
                
                
                
                habitacion = new Habitacion();
                
                habitacion.setNumeroHabitacion(resultSet.getInt("numeroHabitacion"));
                habitacion.setEstadoHabitacion(resultSet.getBoolean("estadoHabitacion"));
                habitacion.setPiso(resultSet.getInt("pisoHabitacion"));
                
                habitacion.setTipoHabitacion(tipoHabitacion);
                
              
                
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los habitaciones: " + ex.getMessage());
        }
        
        
        return habitacion;
    }
// que es mejor un metodo que filtre
//o filtrar dsp de obtener la data?? MEtodo que filtre puede servir para cualquier parametro
public List<Habitacion> mostrarHabitaciones(){
     List<Habitacion> habitaciones= new ArrayList<>();
     
     
            
        try {
            String sql = "SELECT * FROM habitacion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Habitacion h;
            
            while(resultSet.next()){
                
                h= new Habitacion();
                
                h.setNumeroHabitacion(resultSet.getInt("numeroHabitacion"));
                h.setPiso(resultSet.getInt("pisoHabitacion"));
                h.setEstadoHabitacion(resultSet.getBoolean("estadoHabitacion"));
                
                                            
                TipoHabitacion tH=mostrarTipoHabitacion(resultSet.getInt("IdTipoHabitacion"));
                                
                h.setTipoHabitacion(tH);
                habitaciones.add(h);
             }
            
                statement.close();
            } catch (SQLException ex) {
            System.out.println("Error al obtener las Habitaciones: " + ex.getMessage());
        }
     
    return habitaciones;
}


public List<Habitacion> obtenerHabitacionesXTipo(int idTipoHabitacion){
        List<Habitacion> habitaciones = new ArrayList<Habitacion>();
            

        try {
            String sql = "SELECT * FROM habitacion WHERE idTipoHabitacion=" + idTipoHabitacion + ";";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Habitacion habitacion;
            while(resultSet.next()){
                habitacion = new Habitacion();
                habitacion.setNumeroHabitacion(resultSet.getInt("numeroHabitacion"));
                habitacion.setPiso(resultSet.getInt("pisoHabitacion"));
                habitacion.setEstadoHabitacion(resultSet.getBoolean("estadoHabitacion"));
                TipoHabitacion th=mostrarTipoHabitacion(resultSet.getInt(idTipoHabitacion));
                habitacion.setTipoHabitacion(th);
                
                habitaciones.add(habitacion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las habitaciones: " + ex.getMessage());
        }
        
        
        return habitaciones;
    }



public TipoHabitacion mostrarTipoHabitacion(int idTipoHabitacion) {
        try {
            conexion= new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener las habitaciones: " + ex.getMessage());
        }
        TipoHabitacionData tipohabitacionData = new TipoHabitacionData(conexion);
        
        return tipohabitacionData.mostrarTipoHabitacion(idTipoHabitacion);
    }
    
}




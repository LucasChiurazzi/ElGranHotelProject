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
 * @author Lucas
 */
public class HabitacionData {
    private Connection connection = null;


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
                     
            String sql = "INSERT INTO habitacion (idHabitacion, pisoHabitacion, estadoHabitacion, TipoHabitacion_idTipoHabitacion)";

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
            
            String sql = "UPDATE habitacion SET  pisoHabitacion = ?, estadoHabitacion = ?, TipoHabitacion_idTipoHabitacion = ? WHERE idHabitacion = ?;";
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

public List<Habitacion> mostrarHabitacion(int nroHabitacion){
 List<Habitacion> habitaciones = new ArrayList<Habitacion>();
            

        try {
            String sql = "SELECT * FROM habitacion, tipohabitacion \n" +
                         "WHERE habitacion.idTipoHabitacion = tipohabitacion.idTipoHabitacion \n"
                         + "AND nroHabitacion = ? ;";
            
            PreparedStatement statement = connection.prepareStatement(sql);
            
            Habitacion habitacionNro= new Habitacion();
            
            statement.setInt(1, nroHabitacion);
            
            ResultSet resultSet = statement.executeQuery();
            
            Habitacion habitacion;
            
                        
            while(resultSet.next()){
                
                
               
                TipoHabitacion tipoHabitacion = new TipoHabitacion();
                
                
                habitacion = new Habitacion();
                
                habitacion.setNumeroHabitacion(resultSet.getInt("idHabitacion"));
                habitacion.setEstadoHabitacion(resultSet.getBoolean("estadoHabitacion"));
                habitacion.setPiso(resultSet.getInt("pisoHabitacion"));
                
                habitacion.setTipoHabitacion(tipoHabitacion);
                
              
                habitaciones.add(habitacion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los habitaciones: " + ex.getMessage());
        }
        
        
        return habitaciones;
    }
    
}




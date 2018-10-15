/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ma
 */
public class HabitacionData {
    
   
    private Connection connection = null;

    public HabitacionData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    public void agregarHabitacion(Habitacion habitacion){
        try{
            String sql = "INSERT INTO huesped (numeroHabitacion, pisoHabitacion, estadoHabitacion)";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, habitacion.getNumeroHabitacion());
            statement.setInt(2, habitacion.getPisoHabitacion ());
            statement.setBoolean(3, habitacion.getEstadoHabitacion());
          
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un habitacion: " + ex.getMessage());
        }
        }
    public void cambiarHabitacion(Habitacion habitacion){
        try{
            String sql = "INSERT INTO huesped (numeroHabitacion, pisoHabitacion, estadoHabitacion)";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, habitacion.getNumeroHabitacion());
            statement.setInt(2, habitacion.getPisoHabitacion ());
            statement.setBoolean(3, habitacion.getEstadoHabitacion());
        
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un habitacion: " + ex.getMessage());
        }
        }
    
public List<Habitacion> mostrarHabitacion(){
        List<Habitacion> habitaciones = new ArrayList<Habitacion>();
            

        try {
            String sql = "SELECT * FROM habitacion;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Habitacion habitacion;
            while(resultSet.next()){
                habitacion = new Habitacion();
                habitacion.setNumeroHabitacion(resultSet.getInt("numeroHabitacion"));
                
              

                habitaciones.add(habitacion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los habitaciones: " + ex.getMessage());
        }
        
        
        return habitaciones;
    }

}
    


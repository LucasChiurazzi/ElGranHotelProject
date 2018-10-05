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

public void mostrarHabitacion(){
    
}
        
public void agregarHabitacion(Habitacion habitacion){try {
                     
            String sql = "INSERT INTO habitacion (idHabitacion, pisoHabitacion, estadoHabitacion, TipoHabitacion_idTipoHabitacion)";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, habitacion.getNumeroHabitacion());
            statement.setInt(2, habitacion.getPiso());
            statement.setBoolean(3, habitacion.getEstadoHabitacion());
            statement.setInt(4, habitacion.getTipohabitacion().getIdTipoHabitacion());
                      
            
            statement.executeUpdate();
            
            //ResultSet rs = statement.getGeneratedKeys();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un habitacion: " + ex.getMessage());
        }
    
    
}
public void cambiarHabitacion(Habitacion habitacion){
    
}



}
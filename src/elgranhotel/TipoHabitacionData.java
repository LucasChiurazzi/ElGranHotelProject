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
public class TipoHabitacionData {
   private Connection connection = null;

    public TipoHabitacionData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    //mostrar
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
    
    // agregar
    
    public void agregarTipoHabitacion(TipoHabitacion tipoHabitacion){
        try{
            String sql = "INSERT INTO huesped (idTipoHabitacion, categoriaTipoHabitacion, cantPersonasTipoHabitacion, precioNocheTipoHabitacion, tipoCamaTipoHabitacion, cantidadCamasTipoHabitacion)";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, tipoHabitacion.getIdTipoHabitacion());
            statement.setString(2, tipoHabitacion.getCategoriaTipoHabitacion());
            statement.setInt(3, tipoHabitacion.getCantPersonasTipoHabitacion());
            statement.setDouble(4, tipoHabitacion.getPrecioNocheTipoHabitacion());
            statement.setString(5, tipoHabitacion.getTipoCamaTipoHabitacion());
            statement.setInt(6, tipoHabitacion.getCantidadCamasTipoHabitacion());
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un tipoHabitacion: " + ex.getMessage());
        }
        }
    
    // cambiar
    
    public void cambiarTipoHabitacion(TipoHabitacion tipoHabitacion){
        try{
            String sql = "INSERT INTO huesped (idTipoHabitacion, cantPersonasTipoHabitacion, precioNocheTipoHabitacion)";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, tipoHabitacion.getIdTipoHabitacion());
            statement.setInt(2, tipoHabitacion.getCantPersonasTipoHabitacion ());
            statement.setDouble(3, tipoHabitacion.getPrecioNocheTipoHabitacion());
           
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un tipoHabitacion: " + ex.getMessage());
        }
        }
    
    //eliminar
    
    public void eliminarTipoHabitacion(TipoHabitacion tipoHabitacion){
        try{
            String sql = "INSERT INTO huesped (idTipoHabitacion)";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, tipoHabitacion.getIdTipoHabitacion());
            
           
            
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un tipoHabitacion: " + ex.getMessage());
        }
        }
    
 
}

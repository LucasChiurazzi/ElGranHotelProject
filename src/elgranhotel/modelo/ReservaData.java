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
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ReservaData {
    private Connection connection = null;
    private Conexion conexion;
    
    public ReservaData(Conexion conexion) {
        try {
            this.conexion=conexion;
            connection=conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

   
    //copiado de Hugo
    public List<Reserva> obtenerReservas(){
        List<Reserva> reservas = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM reserva;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Reserva reserva;
     
            while(resultSet.next()){
                reserva = new Reserva();
               
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setFechaInicioReserva(resultSet.getDate("fechaInicioReserva").toLocalDate());
                reserva.setFechaFinReserva(resultSet.getDate("fechaFinReserva").toLocalDate());
                reserva.setEstadoReserva(resultSet.getBoolean("estadoReserva"));
               
                Huesped huesped=mostrarHuesped(resultSet.getLong("Huesped_dniHuesped"));
               
                reserva.setHuesped(huesped);
                
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("Habitacion_idHabitacion"));
               
                
                
                reserva.setHabitacion(habitacion);
                reservas.add(reserva);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las reservas: " + ex.getMessage());
        }
        
        
        return reservas;
    }
    //lista de todos los huespedes?
    public List<Huesped> obtenerHuespedes(){
        List<Huesped> huespedes = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM huesped;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Huesped huesped;
            while(resultSet.next()){
                huesped = new Huesped();
                huesped.setDniHuesped(resultSet.getLong("dniHuesped"));
                huesped.setNombreHuesped(resultSet.getString("nombreHuesped"));
                huesped.setDomicilioHuesped(resultSet.getString("domicilioHuesped"));
                huesped.setCorreoHuesped(resultSet.getString("correoHuesped"));
                huesped.setCelularHuesped(resultSet.getString("celularHuesped"));

                huespedes.add(huesped);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return huespedes;
    }   
      
    public List<Reserva> buscarReserva(long dni){
        //recibo un huesped
        //busco en la base de datos si el dniHuesped esta en alguna reserva y en
        //alguna habitacion
        List<Reserva> reservas = new ArrayList<>();
        //List<Huesped> huespedes = new ArrayList<Huesped>();
        
        try {
            String sql = "SELECT * FROM reserva, huesped, habitacion WHERE reserva.dniHuesped=huesped.dniHuesped and habitacion.idHabitacion=reserva.idHabitacion and dniHuesped = "+ dni + ";" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            Reserva reserva;
            
            while(resultSet.next()){
                reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setFechaInicioReserva(resultSet.getDate("fechaInicioReserva").toLocalDate());
                reserva.setFechaFinReserva(resultSet.getDate("fechaFinReserva").toLocalDate());
                reserva.setEstadoReserva(resultSet.getBoolean("estadoReserva"));
                Huesped huesped=mostrarHuesped(resultSet.getLong("dniHuesped"));
                reserva.setHuesped(huesped);
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("idHabitacion"));
                reserva.setHabitacion((Habitacion) habitacion);
                reservas.add(reserva);
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return reservas;
    }
    
    public List<Reserva> buscarReserva(LocalDate fecha){
        //recibo una fecha de inicio de la reserva
        //busco en la base de datos si hay alguna reserva para esa fecha 
        //alguna habitacion
        List<Reserva> reservas = new ArrayList<>();
        //List<Huesped> huespedes = new ArrayList<Huesped>();
        
        try {
            String sql = "SELECT * FROM reserva, huesped, habitacion WHERE reserva.dniHuesped=huesped.dniHuesped and habitacion.idHabitacion=reserva.idHabitacion and fechaInicioReserva= "+ fecha.toString() + ";" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            Reserva reserva;
            
            while(resultSet.next()){
                reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setFechaInicioReserva(resultSet.getDate("fechaInicioReserva").toLocalDate());
                reserva.setFechaFinReserva(resultSet.getDate("fechaFinReserva").toLocalDate());
                reserva.setEstadoReserva(resultSet.getBoolean("estadoReserva"));
                Huesped huesped=mostrarHuesped(resultSet.getLong("dniHuesped"));
                reserva.setHuesped(huesped);
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("idHabitacion"));
                reserva.setHabitacion((Habitacion) habitacion);
                reservas.add(reserva);
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return reservas;
    }    
       
    public void hacerReserva(Reserva reserva){
        try {
            
            String sql = "INSERT INTO reserva( fechaInicioReserva, fechaFinReserva, estadoReserva, Huesped_dniHuesped, Habitacion_numeroHabitacion) VALUES ( ? , ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            statement.setDate(1,  java.sql.Date.valueOf(reserva.getFechaInicioReserva()));
            statement.setDate(2, java.sql.Date.valueOf(reserva.getFechaFinReserva()));
            statement.setBoolean(3, reserva.getEstadoReserva());
            statement.setLong(4, reserva.getHuesped().getDniHuesped());
            statement.setInt(5, reserva.getHabitacion().getNumeroHabitacion());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            
             if (rs.next()) {
                reserva.setIdReserva(rs.getInt(1));
            } else {
                System.out.println("No se pudo obtener el id luego de insertar una reserva");
            }
          
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar una reserva: " + ex.getMessage());
        }
    }
    
    public void modificarReserva(Reserva reserva){
            
        try {
            
            String sql = "UPDATE reserva SET fechaInicioReserva= ? ,fechaFinReserva= ? ,estadoReserva= ? ,Huesped_dniHuesped= ? ,Habitacion_numeroHabitacion= ?  WHERE idReserva= ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            
           
            statement.setDate(1,  java.sql.Date.valueOf(reserva.getFechaInicioReserva()));
            statement.setDate(2, java.sql.Date.valueOf(reserva.getFechaFinReserva()));
            statement.setBoolean(3, reserva.getEstadoReserva());
            statement.setLong(4, reserva.getHuesped().getDniHuesped());
            statement.setInt(5, reserva.getHabitacion().getNumeroHabitacion());
            statement.setInt(6, reserva.getIdReserva());
            
            statement.executeUpdate();
            
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar una reserva: " + ex.getMessage());
        }
        
        
    }
    
    //borra una reserva
    public void cancelarReserva(int idReserva){
         try {
            
            String sql = "DELETE FROM reserva \n WHERE idReserva =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, idReserva);
                       
            statement.executeUpdate();
             
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un tipo de Habitacion: " + ex.getMessage());
        }
   
    }
     
    
    public Huesped mostrarHuesped(long dni) {
        try {
            conexion= new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener las habitaciones: " + ex.getMessage());
        }
        HuespedData huespedData = new HuespedData(conexion);
        
        return huespedData.mostrarHuesped(dni);
    }

    public Habitacion mostrarHabitacion(int idHabitacion) {
        try {
            conexion= new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al obtener las habitaciones: " + ex.getMessage());
        }
        HabitacionData habitacionData = new HabitacionData(conexion);
        return habitacionData.mostrarHabitacion(idHabitacion);
    }
     
    
    
    //innecesario?
    //modifica el estado de una reserva 1 activa por lo que debe tomar una reserva como parametro
    
    public void finReserva(Huesped huesped){
         try {
            
            String sql = "UPDATE reserva INNER JOIN  huesped  INNER JOIN habitacion  ON huesped.dniHuesped= reserva.dniHuesped AND reserva.numeroHabitacion= habitacion.numeroHabitacion SET reserva.estadoReserva= 0 , habitacion.estadoHabitacion= 0  WHERE huesped.dniHuesped= ? ;";

            PreparedStatement statement = connection.prepareStatement(sql);
                       
            statement.setLong(1, huesped.getDniHuesped());
            
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {            System.out.println("Error al actualizar una reserva: " + ex.getMessage());
        }
    }
    
    
    // lo calcula la UI?
   // public int diasReserva(){}
       
   //public double montoReserva(){}
    
    
    
}
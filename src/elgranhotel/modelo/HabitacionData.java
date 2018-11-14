
package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


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
 public int guardarHabitacion(Habitacion habitacion){
         int rta=0;
    try {
                     
            String sql = "INSERT INTO habitacion (numeroHabitacion, pisoHabitacion, estadoHabitacion, idTipoHabitacion) VALUES ( ? , ? , ? , ? ) ;";
            
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
               habitacion.setTipoHabitacion(buscarTipoHabitacion(resultSet.getInt("idTipoHabitacion"), conexion));
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar una habitacion: " + ex.getMessage());
        }
         return habitacion;
    }
 
//modifica todos los campos de una habitacion
 public int actualizarHabitacion(Habitacion habitacion){
    int rta=0;
       try {
            
            String sql = "UPDATE habitacion SET  pisoHabitacion = ?, estadoHabitacion = ?, idTipoHabitacion = ? WHERE numeroHabitacion = ? ;";

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
//elimino habitacion filtrando por el numero de la habitacion
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

//obtengo las habitaciones existentes de la entidad habitacion
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
                TipoHabitacion tH=buscarTipoHabitacion(resultSet.getInt("idTipoHabitacion"), conexion);
                habitacion.setTipoHabitacion(tH);
                habitaciones.add(habitacion);
             }
             statement.close();
            } catch (SQLException ex) {
            System.out.println("Error al obtener las Habitaciones: " + ex.getMessage());
        }
     
    return habitaciones;
}

//obtengo habitaciones segun condicion, 1 si esta ocupada y 0 si esta libre
public List<Habitacion> obtenerHabitacionesSi(Boolean condicion,Conexion conexion){
     Habitacion habitacion;
     List<Habitacion> habitaciones= new ArrayList<>();
     try {
            String sql = "SELECT * FROM habitacion WHERE habitacion.estadoHabitacion= ?;";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setBoolean(1, condicion);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                habitacion= new Habitacion();
                habitacion.setNumeroHabitacion(resultSet.getInt("numeroHabitacion"));
                habitacion.setPisoHabitacion(resultSet.getInt("pisoHabitacion"));
                habitacion.setEstadoHabitacion(resultSet.getBoolean("estadoHabitacion"));
                TipoHabitacion tH=buscarTipoHabitacion(resultSet.getInt("idTipoHabitacion"), conexion);
                habitacion.setTipoHabitacion(tH);
                habitaciones.add(habitacion);
             }
             statement.close();
            } catch (SQLException ex) {
            System.out.println("Error al obtener las Habitaciones: " + ex.getMessage());
        }
     
    return habitaciones;
}

//busco un tipo de habitacion en la clase TipoHabitacionData
public TipoHabitacion buscarTipoHabitacion(int idTipoHabitacion, Conexion conexion) {
       TipoHabitacionData tipohabitacionData = new TipoHabitacionData(conexion);
       TipoHabitacion th= tipohabitacionData.buscarTipoHabitacion(idTipoHabitacion);
        
        return th;
    }
    

public boolean ocupada(Habitacion h, LocalDate fechaInicioReserva, LocalDate fechaFinReserva){
    boolean ocupada= false;
    LocalDate fechaHoy= LocalDate.now();
    if(fechaInicioReserva.isBefore(fechaHoy.plusDays(1)) || fechaInicioReserva.equals(fechaHoy.plusDays(1))&& fechaFinReserva.isAfter(fechaHoy.plusDays(1)) || fechaFinReserva.equals(fechaHoy.plusDays(1))){
          ocupada=true;
          h.setEstadoHabitacion(ocupada);
          this.actualizarHabitacion(h);
                            }
    
    
    return ocupada;
}

}








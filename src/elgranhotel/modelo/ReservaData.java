
package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

    public List<Reserva> buscarReserva(long dni){
        //recibo un huesped
        //busco en la base de datos si el dniHuesped esta en alguna reserva y en
        //alguna habitacion
        List<Reserva> reservas = new ArrayList<Reserva>();
        //List<Huesped> huespedes = new ArrayList<Huesped>();
        
        try {
            String sql = "SELECT * FROM reserva, huesped, habitacion WHERE reserva.dniHuesped=huesped.dniHuesped and habitacion.idHabitacion=reserva.idHabitacion and dniHuesped = "+ dni + "= ;" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            Reserva reserva;
            
            while(resultSet.next()){
                reserva = new Reserva();
                reserva.setIdReserva(resultSet.getInt("idReserva"));
                reserva.setFechaInicioReserva(resultSet.getDate("fechaInicioReserva").toLocalDate());
                reserva.setFechaFinReserva(resultSet.getDate("fechaFinReserva").toLocalDate());
                reserva.setEstadoReserva(resultSet.getBoolean("estadoReserva"));
                List<Huesped> huesped=mostrarHuesped(resultSet.getLong("dniHuesped"));
                reserva.setHuesped((Huesped) huesped);
                List<Habitacion> habiacion=mostrarHabitacion(resultSet.getInt("idHabitacion"));
                reserva.setHabitacion((Habitacion) habiacion);
                reservas.add(reserva);
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return reservas;
    }

    
    
    public List<Huesped> mostrarHuesped(long dni) {
        HuespedData huespedData = new HuespedData(conexion);
        
        return huespedData.mostrarHuesped(dni);
    }

    public List<Habitacion> mostrarHabitacion(int idHabitacion) {
        HabitacionData habitacionData = new HabitacionData(conexion);
        return habitacionData.mostrarHabitacion(idHabitacion);
    }
     
    
}

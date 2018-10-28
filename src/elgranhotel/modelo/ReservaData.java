
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
               
                Huesped huesped=mostrarHuesped(resultSet.getLong("dniHuesped"));
               
                reserva.setHuesped(huesped);
                
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("numeroHabitacion"));
                reserva.setHabitacion(habitacion);
                reservas.add(reserva);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las reservas: " + ex.getMessage());
        }
        
        
        return reservas;
    }
    
    public List<Reserva> buscarReserva(long dni){
        //recibo un huesped
        //busco en la base de datos si el dniHuesped esta en alguna reserva y en
        //alguna habitacion
        List<Reserva> reservas = new ArrayList<>();
        //List<Huesped> huespedes = new ArrayList<Huesped>();
        
        try {
            String sql = "SELECT * FROM reserva, huesped, habitacion WHERE reserva.dniHuesped=huesped.dniHuesped AND habitacion.numeroHabitacion=reserva.numeroHabitacion AND reserva.dniHuesped = "+ dni + ";" ;
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
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("numeroHabitacion"));
                reserva.setHabitacion(habitacion);
                reservas.add(reserva);
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return reservas;
    }
    
    public List<Reserva> buscarReserva(LocalDate fechaI, LocalDate fechaF){
        //recibo una fecha de inicio de la reserva
        //busco en la base de datos si hay alguna reserva para esa fecha 
        //alguna habitacion
        List<Reserva> reservas = new ArrayList<>();
        System.out.println(fechaI);
        System.out.println(fechaF);
        //List<Huesped> huespedes = new ArrayList<Huesped>();
        
        try {
            String sql = "SELECT * FROM reserva, huesped, habitacion WHERE reserva.dniHuesped=huesped.dniHuesped and habitacion.numeroHabitacion=reserva.numeroHabitacion and fechaInicioReserva>='"+fechaI.toString()+"' and fechaFinReserva<='"+fechaF.toString()+"';";
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
                Habitacion habitacion=mostrarHabitacion(resultSet.getInt("numeroHabitacion"));
                reserva.setHabitacion(habitacion);
                reservas.add(reserva);
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener una reserva por esas fecha: " + ex.getMessage());
        }
        
        
        return reservas;
    }
    
      public void finReserva(Huesped huesped){
         try {
            //busco por dni huesped las reservas que hizo
            List<Reserva> listaReservasHuesped= this.buscarReserva(huesped.getDniHuesped());
            
            //controlar si fecha hoy >= fecha fin reserva
            LocalDate fechaHoy = LocalDate.now();
           
            //1 es la fila y 6 son las columnas
            String filaBusquedaHabitaciones[][]=new String[listaReservasHuesped.size()][6];
             int i;
             for (i=0; i<listaReservasHuesped.size(); i++){
               filaBusquedaHabitaciones[i][0] = String.valueOf(listaReservasHuesped.get(i).getIdReserva());
             //filaBusquedaDni[i][1] = String.valueOf(listaBuscarReservaDni.get(i).getFechaInicioReserva());
               filaBusquedaHabitaciones[i][2] = String.valueOf(listaReservasHuesped.get(i).getFechaFinReserva());
             //filaBusquedaDni[i][3] = String.valueOf(listaBuscarReservaDni.get(i).getEstadoReserva());
             //filaBusquedaDni[i][4] = String.valueOf(listaBuscarReservaDni.get(i).getHuesped().getDniHuesped());
            // filaBusquedaDni[i][5] = String.valueOf(listaBuscarReservaDni.get(i).getHabitacion().getNumeroHabitacion());

                 //si la fecha de hoy es mayor o igual que la fecha de salida
                 if(fechaHoy.isAfter(listaReservasHuesped.get(i).getFechaFinReserva()) || fechaHoy.equals(listaReservasHuesped.get(i).getFechaFinReserva()))
                 {
                     //la habitacion y la reserva pasan a estar libre(0)
                    String sql = "UPDATE reserva INNER JOIN  huesped  INNER JOIN habitacion  ON huesped.dniHuesped= reserva.dniHuesped AND reserva.numeroHabitacion= habitacion.numeroHabitacion SET reserva.estadoReserva= 0 , habitacion.estadoHabitacion= 0  WHERE reserva.idReserva= ? ;";

                    PreparedStatement statement = connection.prepareStatement(sql);
                       
                    statement.setInt(1, listaReservasHuesped.get(i).getIdReserva());
            
                    statement.executeUpdate();
            
                    statement.close();
                 }
                 
                 
                 
            
            }
            
            
    
        } catch (SQLException ex) {            System.out.println("Error al actualizar una reserva: " + ex.getMessage());
        }
    }
    
    
     public void hacerReserva(Reserva reserva){
        try {
            
            String sql = "INSERT INTO reserva (fechaInicioReserva, fechaFinReserva, estadoReserva, dniHuesped, numeroHabitacion) VALUES ( ? , ? , ? , ? , ? );";

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

       public Huesped mostrarHuesped(long dni){
    
        HuespedData huespedData=new HuespedData(conexion);
        
        return huespedData.mostrarHuesped(dni);
        
    }
    
    public Habitacion mostrarHabitacion(int id){
    
        HabitacionData habitacionData=new HabitacionData(conexion);
        return habitacionData.mostrarHabitacion(id);
    
    } 
    
   
     
    
}

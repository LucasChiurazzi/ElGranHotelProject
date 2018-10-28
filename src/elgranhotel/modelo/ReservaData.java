
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
             System.out.println("aqui en try");
            //busco por dni huesped las reservas que hizo
            List<Reserva> listaReservasHuesped= this.buscarReserva(huesped.getDniHuesped());
             System.out.println("listareservashuespedd");
            //controlar si fecha hoy >= fecha fin reserva
            LocalDate fechaHoy = LocalDate.now();
             System.out.println("la fecha de hoy es: "+fechaHoy);
            //1 es la fila y 6 son las columnas
            String filaBusquedaHabitaciones[][]=new String[listaReservasHuesped.size()][6];
             int i;
             System.out.println("el tamanio lista es: "+listaReservasHuesped.size());
             for (i=0; i<listaReservasHuesped.size(); i++){
               filaBusquedaHabitaciones[i][0] = String.valueOf(listaReservasHuesped.get(i).getIdReserva());
               filaBusquedaHabitaciones[i][1]= String.valueOf(listaReservasHuesped.get(i).getFechaInicioReserva());
               filaBusquedaHabitaciones[i][2] = String.valueOf(listaReservasHuesped.get(i).getFechaFinReserva());
               filaBusquedaHabitaciones[i][3] = String.valueOf(listaReservasHuesped.get(i).getEstadoReserva());
               filaBusquedaHabitaciones[i][4] = String.valueOf(listaReservasHuesped.get(i).getHuesped().getDniHuesped());
               filaBusquedaHabitaciones[i][5] = String.valueOf(listaReservasHuesped.get(i).getHabitacion().getNumeroHabitacion());
               System.out.println("estoy en for");
               //por alguna razon me guarda la fecha menos 1 dia
                LocalDate fechaAComparar=LocalDate.parse(filaBusquedaHabitaciones[i][2]);
                
                 System.out.println("la fecha es"+fechaAComparar);
                 //si la fecha de hoy es mayor o igual que la fecha de salida, le sumo 1 dia para que sea igual que en la base de datos
                 if(fechaHoy.isAfter(fechaAComparar.plusDays(1)) || fechaHoy.equals(fechaAComparar.plusDays(1)))
                 {
                     System.out.println("se cumplio el if");
                     System.out.println("fechafin"+fechaAComparar.plusDays(1));
                     //la habitacion y la reserva pasan a estar libre(0)
                    String sql = "UPDATE reserva INNER JOIN  huesped  INNER JOIN habitacion  ON huesped.dniHuesped= reserva.dniHuesped AND reserva.numeroHabitacion= habitacion.numeroHabitacion SET reserva.estadoReserva= 0 , habitacion.estadoHabitacion= 0  WHERE reserva.idReserva= ? ;";

                    PreparedStatement statement = connection.prepareStatement(sql);
                       
                    statement.setInt(1, listaReservasHuesped.get(i).getIdReserva());
                     System.out.println("numero reserva"+listaReservasHuesped.get(i).getIdReserva());
                    statement.executeUpdate();
            
                    statement.close();
                 }
                 
                 System.out.println("estoy aca");
                 
            
            }
                System.out.println("sali del for");
            
    
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

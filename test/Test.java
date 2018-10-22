/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Habitacion;
import elgranhotel.modelo.HabitacionData;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import elgranhotel.modelo.TipoHabitacion;
import elgranhotel.modelo.TipoHabitacionData;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class Test {
        public static Conexion conexion;
     public static void main(String args[]) {
      
         
          try {
      conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaHuesped.class.getName()).log(Level.SEVERE, null, ex);
}
          
          
    
        ReservaData reservaData =new ReservaData(conexion);
        HabitacionData habitacionData= new HabitacionData(conexion);
        TipoHabitacionData tipoHabitacionData= new TipoHabitacionData(conexion);
        List<Habitacion> listaHabitaciones= new ArrayList<>();
        HuespedData huespedData= new HuespedData(conexion);
        
        List<Habitacion> todasLasHabitaciones= habitacionData.mostrarHabitaciones();
        System.out.println(todasLasHabitaciones);
        
        List<Reserva> td= reservaData.obtenerReservas();
        System.out.println(td);
        
        TipoHabitacion th= tipoHabitacionData.mostrarTipoHabitacion(1);
        System.out.println(th);
                
        Habitacion h= habitacionData.mostrarHabitacion(1); 
         System.out.println(h);
         
        List<TipoHabitacion> todasLasTipoHabitaciones= tipoHabitacionData.mostrarTipoHabitacion();
        System.out.println(todasLasTipoHabitaciones);
        List<Huesped> huespedes= huespedData.mostrarHuespedes();
        System.out.println(huespedes);
        //OK
        /*String objetCb= (String)jCBTipoHabitacionReserva.getSelectedItem();
        TipoHabitacion tpHabSelec=searchDeStringATipoHabitacion(objetCb);
                      
       
        
        
        for(Habitacion h: todasLasHabitaciones){
            if(h.getTipoHabitacion().getIdTipoHabitacion()==tpHabSelec.getIdTipoHabitacion()){
                listaHabitaciones.add(h);
            }
        }*/
    
   }
}

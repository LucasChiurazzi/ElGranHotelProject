/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.controlador;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Habitacion;
import elgranhotel.modelo.HabitacionData;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import elgranhotel.modelo.TipoHabitacion;
import elgranhotel.modelo.TipoHabitacionData;
import elgranhotel.vista.DialogoReservaHuesped;
import static elgranhotel.vista.Principal.escritorio;
import elgranhotel.vista.VistaBuscarReserva;
import elgranhotel.vista.VistaTipoHabitacion;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;

/**
 *
 * @author Lucas
 */
public class ControladorReserva {
    
    private TipoHabitacion tipoHabitacion;
    private TipoHabitacionData tipoHabitacionData;
    private List<TipoHabitacion> listaTiposHabitacion;
    private List<Habitacion> listaHabitaciones;
    private Conexion conexion;
    private HuespedData huespedData;
    private ArrayList<Huesped> listaHuespedes;
    private Reserva reserva;
    private ReservaData reservaData;
    private DefaultTableModel modeloReserva;
    private Habitacion habitacion;
    private HabitacionData habitacionData;
    private List<Reserva> listaBuscarReservaDni;
    private List<Reserva> listaBuscarReservaFecha;
    DefaultTableModel modelo;
    
   
    
    
public ControladorReserva(){    
     try {   
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
            
            
            tipoHabitacionData = new TipoHabitacionData(conexion);
            huespedData= new HuespedData(conexion);
            habitacionData= new HabitacionData(conexion);
            reservaData= new ReservaData(conexion);
            listaTiposHabitacion =(ArrayList)tipoHabitacionData.mostrarTipoHabitacion();
            
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaTipoHabitacion.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }



//Busca un huesped para la reserva, si el huesped ya esta cargado desplega el dni y el nombre, recibe DNI    
public void buscarHuesped(JTextField jtfhuesped, JInternalFrame vistaReserva){
 // Busca el huesped con el dni, si el huesped es null abre un dialgo para poder cargar en la vista huesped
       long dni=Long.parseLong(jtfhuesped.getText().substring(0, 8).trim());
       Huesped huesped= (Huesped)huespedData.mostrarHuesped(dni);
        
        if(huesped==null){
        DialogoReservaHuesped dialogo= new DialogoReservaHuesped(new javax.swing.JFrame(), true);
        
        // guarda el dni en una variable en el jdialog para usar en huesped 
        dialogo.setDniHuesped(dni);
        dialogo.setVisible(true);  
        dialogo.setLocation(1000, 1000);
        vistaReserva.dispose();
        
         } else{
             
            jtfhuesped.setText(huesped.getDniHuesped()+" - "+huesped.getNombreHuesped());
              
         }                         
}

public void buscarReservaXhuesped(JTextField jtfhuesped, JTable jtable){
        long dni=Long.parseLong(jtfhuesped.getText().substring(0, 8).trim());
        reservaData = new ReservaData(conexion);
        listaBuscarReservaDni = reservaData.buscarReserva(dni);
        
        //1 es la fila y 6 son las columnas
        String filaBusquedaDni[][]=new String[listaBuscarReservaDni.size()][6];
        int i;
        for (i=0; i<listaBuscarReservaDni.size(); i++){
       
         filaBusquedaDni[i][0] = String.valueOf(listaBuscarReservaDni.get(i).getIdReserva());
         filaBusquedaDni[i][1] = String.valueOf(listaBuscarReservaDni.get(i).getFechaInicioReserva().plusDays(1));
         filaBusquedaDni[i][2] = String.valueOf(listaBuscarReservaDni.get(i).getFechaFinReserva().plusDays(1));
         filaBusquedaDni[i][3] = String.valueOf(listaBuscarReservaDni.get(i).getEstadoReserva());
         filaBusquedaDni[i][4] = String.valueOf(listaBuscarReservaDni.get(i).getHuesped().getDniHuesped());
         filaBusquedaDni[i][5] = String.valueOf(listaBuscarReservaDni.get(i).getHabitacion().getNumeroHabitacion());

        }
      
      jtable.setModel(new javax.swing.table.DefaultTableModel(
            filaBusquedaDni,
            new String [] {
                "Id Reserva", "Fecha Inicio", "Fecha Fin", "Estado", "Dni Huesped", "Habitacion"
            }
        ));    
  
}

public int confirmarReserva(JTextField jtfhuesped, JTable jtable,JXDatePicker jxdI, JXDatePicker jxdF, DefaultTableModel modeloReserva, Conexion conexion){
    
    int rtaR=0;
    
    
    long dni= Long.parseLong(jtfhuesped.getText().substring(0,8).trim());
    LocalDate fechaInicio= fromPickerToLocalDate(jxdI);
    LocalDate fechaFin = fromPickerToLocalDate(jxdF);
    
    int filaSeleccionada= jtable.getSelectedRow();
     
    
        if(filaSeleccionada!=-1){
          
            int numeroHabitacion= (Integer)modeloReserva.getValueAt(filaSeleccionada,0);
            System.out.println(numeroHabitacion);
 //HABITACION seleccionada por la lista, filtrada del data por el numeroHabitacion
           
            
            Habitacion h= habitacionData.buscarHabitacion(numeroHabitacion, conexion);
             System.out.println(h);     
            //HUESPED
           Huesped huesped= huespedData.mostrarHuesped(dni);
                //carga la reserva con los datos
                //el estado es por defecto true
            reserva= new Reserva(fechaInicio, fechaFin, true, huesped, h);
            habitacionData.ocupada(h, fechaInicio, fechaFin);   
            
            rtaR=reservaData.hacerReserva(reserva);
            
           
           
        }
  return rtaR;        
}



public void armaCabeceraTabla(JTable jtable){
        borraFilasTabla();
    
        ArrayList<Object> columnas=new ArrayList<>();
        columnas.add("Numero Habitacion");
        columnas.add("Piso");
        columnas.add("Tipo");
        columnas.add("Tipo Cama");
        columnas.add("Cant Camas");
        for(Object it:columnas){
        
            modeloReserva.addColumn(it);
        }
        jtable.setModel(modeloReserva);
  }

public void borraFilasTabla(){

   int a =modeloReserva.getRowCount()-1;

for(int i=a;i>=0;i--){
   
modeloReserva.removeRow(i );
}
}

//metodos Auxiliares
public LocalDate fromPickerToLocalDate(JXDatePicker datePicker){
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
    
    String toLocalDate= formater.format(datePicker.getDate());
    LocalDate fechaInLD= LocalDate.parse(toLocalDate);
        
    return fechaInLD;
   }


}

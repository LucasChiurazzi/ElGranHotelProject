
package elgranhotel.vista;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Habitacion;
import elgranhotel.modelo.HabitacionData;
import elgranhotel.modelo.TipoHabitacion;
import elgranhotel.modelo.TipoHabitacionData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import static java.time.temporal.ChronoUnit.DAYS;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.jdesktop.swingx.JXDatePicker;


public class VistaReserva extends javax.swing.JInternalFrame {
    
    private TipoHabitacion tipoHabitacion;
    private TipoHabitacionData tipoHabitacionData;
    private List<TipoHabitacion> listaTiposHabitacion;
    private List<Habitacion> listaHabitaciones;
    private Conexion conexion;
    private HuespedData huespedData;
    private HuespedData huespedData1;
    private ArrayList<Huesped> listaHuespedes;
    private Reserva reserva;
    private ReservaData reservaData;
    private DefaultTableModel modeloReserva;
    private Habitacion habitacion;
    private HabitacionData habitacionData;
    private List<Reserva> listaReservas;
    
   
    
    
    
    
    /**
     * Creates new form VisaReserva
     */
    public VistaReserva() {
        initComponents();
        
          try {   
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
            
             modeloReserva=new DefaultTableModel();
            
            tipoHabitacionData = new TipoHabitacionData(conexion);
            huespedData= new HuespedData(conexion);
            
            
            listaTiposHabitacion =(ArrayList)tipoHabitacionData.mostrarTipoHabitacion();
                       
            //Método encargado de llenar el combobox
           cargarTiposHabitacionEnComboBox();
          
           armaCabeceraTabla();
            
           
         
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaReserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        
      
    }
    

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jDHuespedReserva = new javax.swing.JDialog();
        jBCancelarPopUpHuespedReserva = new javax.swing.JButton();
        jBCargarPopUpHuespedReserva = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTHuespedReserva = new javax.swing.JTextField();
        jBBuscarHuespedReserva = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFDiasReserva = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jCBTipoHabitacionReserva = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jBConfirmarReserva = new javax.swing.JButton();
        jBBuscarHabitacionesReserva = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTHabitacionesReserva = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jTFCantPersonasReserva = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTFMontoReserva = new javax.swing.JTextField();
        jBLimpiarReserva = new javax.swing.JButton();
        jBBuscarTipoHabitacion = new javax.swing.JButton();
        jXDPInicioReserva = new org.jdesktop.swingx.JXDatePicker();
        jXDPFinReserva = new org.jdesktop.swingx.JXDatePicker();

        jBCancelarPopUpHuespedReserva.setText("CANCELAR");
        jBCancelarPopUpHuespedReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jBCargarPopUpHuespedReserva.setText("CARGAR");
        jBCargarPopUpHuespedReserva.setToolTipText("");
        jBCargarPopUpHuespedReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBCargarPopUpHuespedReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCargarPopUpHuespedReservaActionPerformed(evt);
            }
        });

        jLabel8.setText("<html>No se encuentra el huesped buscado. <br>¿Desea cargarlo?</html>");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel12.setText("ERROR AL BUSCAR HUESPED");

        javax.swing.GroupLayout jDHuespedReservaLayout = new javax.swing.GroupLayout(jDHuespedReserva.getContentPane());
        jDHuespedReserva.getContentPane().setLayout(jDHuespedReservaLayout);
        jDHuespedReservaLayout.setHorizontalGroup(
            jDHuespedReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDHuespedReservaLayout.createSequentialGroup()
                .addGroup(jDHuespedReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDHuespedReservaLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jBCargarPopUpHuespedReserva)
                        .addGap(39, 39, 39)
                        .addComponent(jBCancelarPopUpHuespedReserva))
                    .addGroup(jDHuespedReservaLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel12))
                    .addGroup(jDHuespedReservaLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jDHuespedReservaLayout.setVerticalGroup(
            jDHuespedReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDHuespedReservaLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDHuespedReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBCargarPopUpHuespedReserva)
                    .addComponent(jBCancelarPopUpHuespedReserva))
                .addGap(16, 16, 16))
        );

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Reservas - El Gran Hotel 1.0");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("HACER RESERVA");

        jLabel2.setText("Huesped");

        jBBuscarHuespedReserva.setText("BUSCAR");
        jBBuscarHuespedReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHuespedReservaActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha Inicio");

        jLabel4.setText("Fecha Fin");

        jTFDiasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFDiasReservaActionPerformed(evt);
            }
        });

        jLabel5.setText("Cantidad de Personas");

        jCBTipoHabitacionReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoHabitacionReservaActionPerformed(evt);
            }
        });

        jLabel6.setText("Tipo de Habitacion");

        jBConfirmarReserva.setText("Confirmar");
        jBConfirmarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBConfirmarReservaActionPerformed(evt);
            }
        });

        jBBuscarHabitacionesReserva.setText("Habitaciones Disponibles");
        jBBuscarHabitacionesReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarHabitacionesReservaActionPerformed(evt);
            }
        });

        jTHabitacionesReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTHabitacionesReserva);

        jLabel9.setText("Habitaciones disponibles");

        jTFCantPersonasReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCantPersonasReservaActionPerformed(evt);
            }
        });

        jLabel10.setText("Dias");

        jLabel11.setText("Monto Total");

        jBLimpiarReserva.setText("Limpiar");
        jBLimpiarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarReservaActionPerformed(evt);
            }
        });

        jBBuscarTipoHabitacion.setText("Buscar");
        jBBuscarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarTipoHabitacionActionPerformed(evt);
            }
        });

        jXDPFinReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jXDPFinReservaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jBConfirmarReserva)
                                .addGap(43, 43, 43)
                                .addComponent(jBLimpiarReserva))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jCBTipoHabitacionReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBBuscarTipoHabitacion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11)
                                .addGap(16, 16, 16)
                                .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(2, 2, 2)
                                .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 529, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBBuscarHuespedReserva)
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBBuscarHabitacionesReserva)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTHuespedReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscarHuespedReserva))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jXDPInicioReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDPFinReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFDiasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(jTFCantPersonasReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jBBuscarTipoHabitacion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBTipoHabitacionReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTFMontoReserva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBBuscarHabitacionesReserva)
                            .addComponent(jBConfirmarReserva)
                            .addComponent(jBLimpiarReserva)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Busca un huesped para la reserva, si el huesped ya esta cargado desplega el dni y el nombre, recibe DNI
    private void jBBuscarHuespedReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHuespedReservaActionPerformed
        
        botonBuscarHuesped();
        
    }//GEN-LAST:event_jBBuscarHuespedReservaActionPerformed
   
    //Crea una nueva reserva
    private void jBConfirmarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBConfirmarReservaActionPerformed
    
        botonConfirmar();
          
    }//GEN-LAST:event_jBConfirmarReservaActionPerformed

    
    private void jBCargarPopUpHuespedReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCargarPopUpHuespedReservaActionPerformed

        VistaHuesped vh=new VistaHuesped();
        Principal.escritorio.add(vh);
        vh.toFront();
        vh.setVisible(true);

    }//GEN-LAST:event_jBCargarPopUpHuespedReservaActionPerformed

    
    private void jBBuscarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarTipoHabitacionActionPerformed
       
        botonBuscarCantPersonas();
        
    }//GEN-LAST:event_jBBuscarTipoHabitacionActionPerformed

    private void jXDPInicioReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDPInicioReservaActionPerformed
        cargarDias();


    }//GEN-LAST:event_jXDPInicioReservaActionPerformed

    //carga la lista de habitaciones segun el tipo
    private void jBBuscarHabitacionesReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarHabitacionesReservaActionPerformed
        
            botonHabitacionesDisponibles();
            
    }//GEN-LAST:event_jBBuscarHabitacionesReservaActionPerformed

    private void jTFDiasReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFDiasReservaActionPerformed
       
        
    }//GEN-LAST:event_jTFDiasReservaActionPerformed

    private void jXDPFinReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jXDPFinReservaActionPerformed
        cargarDias();       
    }//GEN-LAST:event_jXDPFinReservaActionPerformed

    private void jCBTipoHabitacionReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoHabitacionReservaActionPerformed
      
    }//GEN-LAST:event_jCBTipoHabitacionReservaActionPerformed

    private void jTFCantPersonasReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCantPersonasReservaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCantPersonasReservaActionPerformed

    private void jBLimpiarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarReservaActionPerformed
       
       botonLimpiar(); 
        
    }//GEN-LAST:event_jBLimpiarReservaActionPerformed

    //METODOS para botones
    
    public void botonBuscarHuesped(){
        
        // Busca el huesped con el dni, si el huesped es null abre un dialgo para poder cargar en la vista huesped
        
         long dni=Long.parseLong(jTHuespedReserva.getText().substring(0, 8).trim());
          
         Huesped huesped= (Huesped)huespedData.mostrarHuesped(dni);
        
         if(huesped==null){
         DialogoReservaHuesped dialogo= new DialogoReservaHuesped(new javax.swing.JFrame(), true);
        
        // guarda el dni en una variable en el jdialog para usar en huesped 
        dialogo.setDniHuesped(dni);
        dialogo.setVisible(true);       
        dispose();
        
         } else{
             
            jTHuespedReserva.setText(huesped.getDniHuesped()+" - "+huesped.getNombreHuesped());
              
         }                         
        
    }
    
    public void botonConfirmar(){
     int rta=0;
     
     if(!datosvacios()){  
    
    long dni= Long.parseLong(jTHuespedReserva.getText().substring(0,8).trim());
    LocalDate fechaInicio= fromPickerToLocalDate(jXDPInicioReserva);
    LocalDate fechaFin = fromPickerToLocalDate(jXDPFinReserva);
    int filaSeleccionada= jTHabitacionesReserva.getSelectedRow();
        
        //si seleccione alguna fila de la tabla
        if(filaSeleccionada!=-1){
            //obtengo el numero de la habitacion como int
            int numeroHabitacion= (Integer)modeloReserva.getValueAt(filaSeleccionada,0);
           
            //HABITACION seleccionada por la lista, filtrada del data por el numeroHabitacion
           Habitacion h= habitacionData.buscarHabitacion(numeroHabitacion, conexion);
                  
           
               //HUESPED
           Huesped huesped= huespedData.mostrarHuesped(dni);
                 //obtengo fecha de hoy
                 LocalDate fechaDeHoy = LocalDate.now();
                //carga la reserva con los datos
                //el estado es por defecto true
            reserva= new Reserva(fechaInicio, fechaFin, true, huesped, h);
            //estado de habitacion ocupado
            h.setEstadoHabitacion(true);
            //realizo la reserva
            rta=reservaData.hacerReserva(reserva);
            //actualizo la informacion de la habitacion reservada
            habitacionData.actualizarHabitacion(h);
            //invoco a finreserva para que finalize reservas con respecto al dia de hoy
            reservaData.finReserva( conexion);
           if(rta==1) {JOptionPane.showMessageDialog(this, "La Reserva se GUARDO correctamente");}
            else {JOptionPane.showMessageDialog(this, "FALLÓ la operación");}
        }
        }else{
         JOptionPane.showMessageDialog(this, "Completar DATOS ");
   }
    }
    
    public void botonBuscarCantPersonas(){
        cargarTiposHabitacionEnComboBoxXCP();
       precioReserva();
    }
        
    public void botonHabitacionesDisponibles(){
        
    borraFilasTabla();
        
    LocalDate fechaInicioHR= fromPickerToLocalDate(jXDPInicioReserva);
        
    LocalDate fechaFinHR = fromPickerToLocalDate(jXDPFinReserva);
       
    reservaData =new ReservaData(conexion);
     
    habitacionData= new HabitacionData(conexion);
       
    listaHabitaciones= new ArrayList<>(); 
     
   
     
    //hasta aca ok
    //obtengo el elemento seleccionado del combobox como string
    String objetCb= (String)jCBTipoHabitacionReserva.getSelectedItem();
    //lo convierto a tipo habitacion
    TipoHabitacion tpHabSelec=searchDeStringATipoHabitacion(objetCb);
                  
     /*for (Iterator<Habitacion> it= tlhR.iterator(); it.hasNext();){
    Habitacion h= it.next();
    if(h.getTipoHabitacion().getIdTipoHabitacion()==tpHabSelec.getIdTipoHabitacion())
        listaHabitaciones.add(h);
     }*/
    
    //obtengo las habitaciones
    List<Habitacion> todasLasHabitaciones= habitacionData.obtenerHabitaciones(conexion);
    //filtro habitaciones segun el tipo elegido
    todasLasHabitaciones.stream().filter((h) -> (h.getTipoHabitacion().getIdTipoHabitacion()==tpHabSelec.getIdTipoHabitacion())).forEachOrdered((h) -> {
        //agrego las habitaciones del tipo de habitacion elegido
        listaHabitaciones.add(h);
    
        });
   //obtengo reservas
   List<Reserva> reservas= reservaData.obtenerReservas( conexion);
   //creo lista donde tendre habitaciones a borrar
   List<Integer> numerosHABOrrar= new ArrayList<>();
    for (Reserva r:reservas){
        
        if (estaDentroDelRango(fechaInicioHR, fechaFinHR, r.getFechaInicioReserva().plusDays(1)) || 
                r.getFechaInicioReserva().plusDays(1).isBefore(fechaInicioHR) && r.getFechaFinReserva().plusDays(1).isAfter(fechaInicioHR)
              ) 
        {  
            if(estaDentroDelRango(fechaInicioHR, fechaFinHR, r.getFechaFinReserva().plusDays(1)) || 
                    r.getFechaFinReserva().plusDays(1).isAfter(fechaFinHR) && r.getFechaInicioReserva().plusDays(1).isBefore(fechaFinHR))
            {
            //si esta dentro del rango lo agrega a la lista    
           int numeroH=r.getHabitacion().getNumeroHabitacion();
           numerosHABOrrar.add((Integer)numeroH);
           }
        }     
    }
    //mediante este for voy recorriendo la listaHabitaciones y donde el numero habitacion coincida lo borra
    //de la listaHabitaciones
    int remove_h = -1;
    for(int k=0;k< numerosHABOrrar.size();k++){
         for(int i=0;i<listaHabitaciones.size();i++){
            if(listaHabitaciones.get(i).getNumeroHabitacion()==(numerosHABOrrar.get(k))){
                remove_h = i;
            }
        }
        if(remove_h > -1){
            listaHabitaciones.remove(remove_h);
            remove_h = -1;
        }
    }
    //una vez pasado por el filtro de for, lo muestra en la tabla 
    for(Habitacion h:listaHabitaciones){
          
          modeloReserva.addRow(new Object[]{h.getNumeroHabitacion(), h.getPisoHabitacion(), h.getTipoHabitacion().getCategoriaTipoHabitacion(),h.getTipoHabitacion().getTipoCamaTipoHabitacion(), h.getTipoHabitacion().getCantidadCamasTipoHabitacion()});
        }
    }
    
    public void botonLimpiar(){
         limpiarComboBox();
        cargarTiposHabitacionEnComboBox();
        armaCabeceraTabla();
        jTHuespedReserva.setText("");
        jTFDiasReserva.setText("");
        jTFCantPersonasReserva.setText("");
        jTFMontoReserva.setText("");
    }
    
    //metodos tabla
    public void armaCabeceraTabla(){
        //agrego el nombre de cada columna
        ArrayList<Object> columnas=new ArrayList<>();
        columnas.add("Numero Habitacion");
        columnas.add("Piso");
        columnas.add("Tipo");
        columnas.add("Tipo Cama");
        columnas.add("Cant Camas");
        for(Object it:columnas){
            //mediante un for agrego las columnas a modeloReserva
            modeloReserva.addColumn(it);
        }
        //aca ya le asigno a la tabla lo que le agregue a modeloReserva
        jTHabitacionesReserva.setModel(modeloReserva);
  }
    
    public void borraFilasTabla(){
        //declaro entero a y le asigno la cantidad de filas que tiene el modelo reserva -1
   int a =modeloReserva.getRowCount()-1;
        //uso un for para eliminar las filas que consulte en un evento anterior
    for(int i=a;i>=0;i--)
    {
        modeloReserva.removeRow(i );
    }
}
    
     //metodos combobox
    public void cargarTiposHabitacionEnComboBox(){
    //Carga los tipos de habitacion  al ComboBox
    //si no tengo nada en el combobox de tipoHabitacion
    if(jCBTipoHabitacionReserva.getItemCount()==0){
        //agrego mediante un for elementos al combobox
     for(TipoHabitacion item: tipoHabitacionData.mostrarTipoHabitacion()){
            jCBTipoHabitacionReserva.addItem(item.getIdTipoHabitacion() +" "+ item.getCategoriaTipoHabitacion());
                }
          
            }
    }
    
    public void cargarTiposHabitacionEnComboBoxXCP(){
    //Carga los tipos de habitacion  al ComboBox
    
    //lista para agregar tipos de habitacion acorde al tipo
    List<TipoHabitacion> resultado= new ArrayList<>(); 
    int cantPersonas= Integer.parseInt(0+jTFCantPersonasReserva.getText());
        
        
        for(TipoHabitacion tipo:tipoHabitacionData.mostrarTipoHabitacion()){
           if(tipo.getCantPersonasTipoHabitacion()==(cantPersonas)){
               //agrego a la lista resultado la habitacion que cumple con la cantidad y tipo
            resultado.add(tipo);
            }
         }  
       
    //Limpiar comboBox
    limpiarComboBox();
      
      
    //le paso al combo box solo los tipos que correspondan
    if(jCBTipoHabitacionReserva.getItemCount()==0){
     for(TipoHabitacion item: resultado){
            jCBTipoHabitacionReserva.addItem(item.getIdTipoHabitacion() +" "+ item.getCategoriaTipoHabitacion());
                }
          
            }
    }
   
    public void limpiarComboBox(){
        
        jCBTipoHabitacionReserva.removeAllItems();
       
     }
    
    public  TipoHabitacion searchDeStringATipoHabitacion(String selectedItemComboBox){
        //sacar el id y pasarlo a int, buscar con el id en la base de datos y sacarlo como un tipoHabitacion completo
        int idTipoHabitacion= Integer.parseInt(selectedItemComboBox.substring(0, 2).trim());
      
       TipoHabitacion tH=(tipoHabitacionData.buscarTipoHabitacion(idTipoHabitacion));
               
    
        return tH;
    }
          
     //cargar dias en diasreserva
     public void cargarDias(){
    LocalDate fechaInicio= fromPickerToLocalDate(jXDPInicioReserva);
    LocalDate fechaFin = fromPickerToLocalDate(jXDPFinReserva);
     if(fechaFin.isBefore(fechaInicio) || fechaInicio.isAfter(fechaFin)){
        //si fecha fin es menor a fecha inicio o si fecha inicio es mayor que fecha fin
        JOptionPane.showMessageDialog(this, "No se puede realizar la reserva, revisar fecha");
        jBBuscarTipoHabitacion.setEnabled(false);
        jBConfirmarReserva.setEnabled(false);
       
    }else{ 
         if(fechaInicio.isEqual(fechaFin)){
        //Si fecha inicio es igual a fecha de salida no se puede reservar
        JOptionPane.showMessageDialog(this, "No se puede realizar la reserva en el mismo dia");
        jBBuscarTipoHabitacion.setEnabled(false);
        jBConfirmarReserva.setEnabled(false);
    }else{
             jBBuscarTipoHabitacion.setEnabled(true);
             jBConfirmarReserva.setEnabled(true);
         }
    }  
    long diasReserva=fechaInicio.until(fechaFin, DAYS);
    System.out.println(diasReserva);
    jTFDiasReserva.setText(diasReserva +"");
       
     }
     
     public void precioReserva(){
        String objetCb= (String)jCBTipoHabitacionReserva.getSelectedItem();
        TipoHabitacion tpHabSelec=searchDeStringATipoHabitacion(objetCb);
         
         
         int dias=Integer.parseInt(jTFDiasReserva.getText());
         double precioXnoche=tpHabSelec.getPrecioNocheTipoHabitacion();
         double monto= dias*precioXnoche;
         jTFMontoReserva.setText(monto + "");
}
      
     public LocalDate fromPickerToLocalDate(JXDatePicker datePicker){
         //con este metodo me encargo de dejar listo lo que obtengo de jxdatepicker
         //para enviarlo a la base de datos con el estilo corrrespondiente
         
         //declaro el formato que debe llevar la fecha yyyy-MM-dd
    SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
        //formateo lo que obtengo de jxDPicker
    String toLocalDate= formater.format(datePicker.getDate());
        //convierto a localdate
    LocalDate fechaInLD= LocalDate.parse(toLocalDate);
        //devuelvo el valor ya list en yyyy-MM-dd
    return fechaInLD;
   }
     
     public boolean datosvacios(){
         //si hay datos vacios
       boolean hayDatosVacios=   
               jTHuespedReserva.getText().equals("") &&
               jTFDiasReserva.getText().equals("") &&
               jTFCantPersonasReserva.getText().equals("") &&
               jTHabitacionesReserva.getSelectedRow()==-1;
         //devuelvo true en hayDatosVacios
         return hayDatosVacios;
     } 
     
     //metodo para controlar fecha que se encuentre en elrango
     boolean estaDentroDelRango(LocalDate inicio, LocalDate fin, LocalDate fecha) {
        return !(fecha.isBefore(inicio) || fecha.isAfter(fin));
}   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBBuscarHabitacionesReserva;
    private javax.swing.JButton jBBuscarHuespedReserva;
    private javax.swing.JButton jBBuscarTipoHabitacion;
    private javax.swing.JButton jBCancelarPopUpHuespedReserva;
    private javax.swing.JButton jBCargarPopUpHuespedReserva;
    private javax.swing.JButton jBConfirmarReserva;
    private javax.swing.JButton jBLimpiarReserva;
    private javax.swing.JComboBox<String> jCBTipoHabitacionReserva;
    private javax.swing.JDialog jDHuespedReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCantPersonasReserva;
    private javax.swing.JTextField jTFDiasReserva;
    private javax.swing.JTextField jTFMontoReserva;
    private javax.swing.JTable jTHabitacionesReserva;
    public javax.swing.JTextField jTHuespedReserva;
    private org.jdesktop.swingx.JXDatePicker jXDPFinReserva;
    private org.jdesktop.swingx.JXDatePicker jXDPInicioReserva;
    // End of variables declaration//GEN-END:variables
}

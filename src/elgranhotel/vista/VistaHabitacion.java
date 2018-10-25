/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.vista;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Habitacion;
import elgranhotel.modelo.HabitacionData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import elgranhotel.modelo.TipoHabitacion;
import elgranhotel.modelo.TipoHabitacionData;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static org.jdesktop.swingx.plaf.basic.CalendarState.TODAY;

/**
 *
 * @author Usuario
 */
public class VistaHabitacion extends javax.swing.JInternalFrame {
private TipoHabitacionData tipoHabitacionData;
private TipoHabitacion tipoHabitacion;
private HabitacionData habitacionData;
private Conexion conexion;  
DefaultTableModel modelo;
private ArrayList<Habitacion> listaHabitacion;
private ReservaData reservaData;

    public VistaHabitacion() {
        initComponents();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        habitacionData = new HabitacionData(conexion);
        tipoHabitacionData= new TipoHabitacionData(conexion);
        //inicializa la tabla    
       
        cargarTiposHabitacionEnComboBox();
        
        modelo=new DefaultTableModel();
        modelo.addColumn("Numero");
        modelo.addColumn("Piso");
        modelo.addColumn("Estado");
        modelo.addColumn("Id Tipo Habitacion");
        this.Tabla.setModel(modelo);
       } 
        catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaHabitacion.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFNroHabitacion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campoPiso = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonBuscar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();
        botonListar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        cbEstado = new javax.swing.JCheckBox();
        jCBTipoHabitacion = new javax.swing.JComboBox<>();
        jTFEstadoHabitacion = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HABITACION");

        jLabel7.setText("Numero");

        jLabel2.setText("Piso");

        jLabel8.setText("ESTADO");

        jLabel4.setText("TIPO HABITACION");

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        botonBorrar.setText("BORRAR");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        botonActualizar.setText("ACTUALIZAR");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        botonListar.setText("LISTAR");
        botonListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonListarActionPerformed(evt);
            }
        });

        botonLimpiar.setText("LIMPIAR");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(Tabla);

        jCBTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoHabitacionActionPerformed(evt);
            }
        });

        jTFEstadoHabitacion.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 621, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNroHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                                    .addComponent(campoPiso)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonGuardar)
                                .addGap(31, 31, 31)
                                .addComponent(botonActualizar)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(botonBorrar)))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTFEstadoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jCBTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonBuscar)
                                        .addGap(31, 31, 31)
                                        .addComponent(botonListar)
                                        .addGap(33, 33, 33)
                                        .addComponent(botonLimpiar)))))
                        .addGap(75, 75, 75))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cbEstado)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(cbEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFEstadoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonListar)
                    .addComponent(botonLimpiar)
                    .addComponent(botonActualizar)
                    .addComponent(botonBuscar)
                    .addComponent(botonBorrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        int rta=0;
        TipoHabitacion th;
        
        if(!campoPiso.getText().equals("") &&  !jTFNroHabitacion.getText().equals(""))
        {
            int nro= Integer.parseInt(jTFNroHabitacion.getText());
            int piso=Integer.parseInt(campoPiso.getText());
            
            TipoHabitacion tpHabSelec=deJCBaTipo(jCBTipoHabitacion);
            Habitacion habitacion=new Habitacion(nro, piso, false, tpHabSelec); 
            rta=habitacionData.guardarHabitacion(habitacion);
            if(rta==1) {JOptionPane.showMessageDialog(this, "Operación EXITOSA");}
            else {JOptionPane.showMessageDialog(this, "FALLÓ la operación");}
        }
        else
        JOptionPane.showMessageDialog(this, "Completar DATOS ");
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        if (!jTFNroHabitacion.getText().equals(""))
        {
            int id=Integer.parseInt(jTFNroHabitacion.getText());
            Habitacion habitacion= habitacionData.buscarHabitacion(id, conexion);
            if(habitacion!=null)
            {
                limpiar();
                mostrarHabitacion(habitacion);
            }
            else
            JOptionPane.showMessageDialog(this, "NO EXISTE  la Habitación que busca");
        }
        else 
        JOptionPane.showMessageDialog(this, "Complete el ID");
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        int rta=0;
        if(!jTFNroHabitacion.getText().equals(""))
        {
            int id=Integer.parseInt(jTFNroHabitacion.getText());
            Habitacion habitacion= habitacionData.buscarHabitacion(id, conexion);
            if(habitacion!=null)
            {
                rta=habitacionData.borrarHabitacion(id);
                if(rta==1) {JOptionPane.showMessageDialog(this, "Operación EXITOSA");}
                else {JOptionPane.showMessageDialog(this, "FALLÓ la operación");}
            }
            else
            JOptionPane.showMessageDialog(this, "NO EXISTE  el Tipo de Habitación que busca");
        }
        else
        JOptionPane.showMessageDialog(this, "Complete el ID");
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        Habitacion habitacion;
        Habitacion thAux;
        TipoHabitacion th;
        int rta=0;
        if(!jCBTipoHabitacion.getSelectedItem().equals("") &&!campoPiso.getText().equals("") && !jTFNroHabitacion.getText().equals(""))
        {
            int id=Integer.parseInt(jTFNroHabitacion.getText());
            int piso=Integer.parseInt(campoPiso.getText());
            boolean estado=cbEstado.isSelected();
             th=deJCBaTipo(jCBTipoHabitacion);
            
            habitacion=new Habitacion(id,piso,estado,th);
            thAux= habitacionData.buscarHabitacion(id, conexion);
            if(thAux!=null)
            {
                rta=habitacionData.actualizarHabitacion(habitacion);
                if(rta==1) {JOptionPane.showMessageDialog(this, "Operación EXITOSA");}
                else {JOptionPane.showMessageDialog(this, "FALLÓ la operación");}
            }
            else
            JOptionPane.showMessageDialog(this, "NO EXISTE  la Habitación que quiere actualizar");
        }
        else
        JOptionPane.showMessageDialog(this, "Completar TODOS los Datos ");
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        borraFilasTabla();
        listaHabitacion=(ArrayList)habitacionData.obtenerHabitaciones(conexion);
        for(Habitacion m:listaHabitacion)
        modelo.addRow(new Object[]{m.getNumeroHabitacion(), m.getPisoHabitacion(), m.getEstadoHabitacion(),m.getTipoHabitacion().getIdTipoHabitacion()  });
    }//GEN-LAST:event_botonListarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void jCBTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoHabitacionActionPerformed

    }//GEN-LAST:event_jCBTipoHabitacionActionPerformed
public void borraFilasTabla(){

    int a =modelo.getRowCount()-1;
    System.out.println("Tabla "+a);
    for(int i=a;i>=0;i--){
        modelo.removeRow(i );
        System.out.println("Tabla "+i);
    }
}

public void mostrarHabitacion(Habitacion habitacion){

 String id= String.valueOf(habitacion.getNumeroHabitacion());
 jTFNroHabitacion.setText(id); 
 String piso= String.valueOf(habitacion.getPisoHabitacion());
 campoPiso.setText(piso);

 reservaData= new ReservaData(conexion);
 List <Reserva> reservasHabitacion= reservaData.obtenerReservas();
 LocalDate hoy=  LocalDate.now();
 Reserva rH = null;
 for (Reserva r:reservasHabitacion){
        if(r.getHabitacion().getNumeroHabitacion()==habitacion.getNumeroHabitacion()){
           rH= r;
           }
    }
    System.out.println(rH);
 boolean estado=habitacion.getEstadoHabitacion();
  if(estado && rH.getFechaFinReserva().plusDays(1).isAfter(hoy) && rH.getFechaInicioReserva().plusDays(1).isBefore(hoy) ||rH.getFechaFinReserva().plusDays(1).equals(hoy) || rH.getFechaInicioReserva().plusDays(1).isBefore(hoy)) {
     jTFEstadoHabitacion.setText("OCUPADA");
         cbEstado.setSelected(true);
 }else {jTFEstadoHabitacion.setText("LIBRE");
      cbEstado.setSelected(false);}
 
 
 String idTH= String.valueOf(habitacion.getTipoHabitacion().getIdTipoHabitacion());
 String tipoTH= String.valueOf(habitacion.getTipoHabitacion().getCategoriaTipoHabitacion());
 jCBTipoHabitacion.setSelectedItem(idTH+" "+tipoTH);

}
public void limpiar(){
    limpiarComboBox();
    cargarTiposHabitacionEnComboBox();
    jTFNroHabitacion.setText("");
    campoPiso.setText("");
    cbEstado.setSelected(false);
  }

 public  TipoHabitacion searchDeStringATipoHabitacion(String selectedItemComboBox){
        //sacar el id y pasarlo a int, buscar con el id en la base de datos y sacarlo como un tipoHabitacion completo
        int idTipoHabitacion= Integer.parseInt(selectedItemComboBox.substring(0, 2).trim());
      
       TipoHabitacion tH=(tipoHabitacionData.mostrarTipoHabitacion(idTipoHabitacion));
    
        return tH;
    }

 //metodos combobox
    public void cargarTiposHabitacionEnComboBox(){
    //Carga los tipos de habitacion  al ComboBox
    if(jCBTipoHabitacion.getItemCount()==0){
     for(TipoHabitacion item: tipoHabitacionData.mostrarTipoHabitacion()){
            jCBTipoHabitacion.addItem(item.getIdTipoHabitacion() +" "+ item.getCategoriaTipoHabitacion());
                }
          
            }
    }
    
   /* public void cargarTiposHabitacionEnComboBoxXCP(){
    //Carga los tipos de habitacion  al ComboBox
    
    //Limpiar comboBox
    limpiarComboBox();
      
    //le paso al combo box solo los tipos que correspondan
    if(jCBTipoHabitacion.getItemCount()==0){
     for(TipoHabitacion item: tipoHabitacionData.mostrarTipoHabitacion()){
            jCBTipoHabitacion.addItem(item.getIdTipoHabitacion() +" "+ item.getCategoriaTipoHabitacion());
                }
          
            }
    }
    */
   
    public void limpiarComboBox(){
        
        jCBTipoHabitacion.removeAllItems();
       
     }
    
    
    public TipoHabitacion deJCBaTipo(JComboBox jcomobox){
        
        String objetCb= (String)jcomobox.getSelectedItem();
        TipoHabitacion tpHabSelec=searchDeStringATipoHabitacion(objetCb);
        
         return tpHabSelec;
    }
    
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonListar;
    private javax.swing.JTextField campoPiso;
    private javax.swing.JCheckBox cbEstado;
    private javax.swing.JComboBox<String> jCBTipoHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFEstadoHabitacion;
    private javax.swing.JTextField jTFNroHabitacion;
    // End of variables declaration//GEN-END:variables
}


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


public class VistaHabitacion extends javax.swing.JInternalFrame {
private TipoHabitacionData tipoHabitacionData;
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
        cargarCabeceraTabla();
       
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
        tablaHabitacion = new javax.swing.JTable();
        jCBTipoHabitacion = new javax.swing.JComboBox<>();
        jTFEstadoHabitacion = new javax.swing.JTextField();
        jRBLibre = new javax.swing.JRadioButton();
        jRBOcupada = new javax.swing.JRadioButton();
        checkBoxLibre = new javax.swing.JCheckBox();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("HABITACION");

        jLabel7.setText("Numero");

        jLabel2.setText("Piso");

        jLabel8.setText("Estado");

        jLabel4.setText("Tipo Habitacion");

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

        tablaHabitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tablaHabitacion.setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        tablaHabitacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tablaHabitacionMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tablaHabitacion);

        jCBTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoHabitacionActionPerformed(evt);
            }
        });

        jTFEstadoHabitacion.setEnabled(false);

        jRBLibre.setText("Libre");
        jRBLibre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBLibreActionPerformed(evt);
            }
        });

        jRBOcupada.setText("Ocupada");
        jRBOcupada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBOcupadaActionPerformed(evt);
            }
        });

        checkBoxLibre.setText("LIBRE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTFNroHabitacion, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                            .addComponent(campoPiso))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel4))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTFEstadoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(checkBoxLibre)))
                        .addGap(17, 17, 17)))
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonBuscar)
                .addGap(32, 32, 32)
                .addComponent(botonListar)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonGuardar)
                        .addGap(41, 41, 41)
                        .addComponent(botonActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(botonBorrar)
                        .addGap(32, 32, 32)
                        .addComponent(botonLimpiar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jRBLibre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRBOcupada)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFEstadoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTFNroHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(checkBoxLibre))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campoPiso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCBTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonListar)
                    .addComponent(botonLimpiar)
                    .addComponent(botonActualizar)
                    .addComponent(botonBorrar)
                    .addComponent(botonBuscar)
                    .addComponent(botonGuardar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBLibre)
                    .addComponent(jRBOcupada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
       
        botonGuardar();
        
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
       
        botonBuscar();
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed
        
        botonBorrar();
        
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
       
        botonActualizar();
        
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonListarActionPerformed
        borraFilasTabla();
        cargarTabla();
    }//GEN-LAST:event_botonListarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        
        limpiar();
        
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void jCBTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoHabitacionActionPerformed
      
        //si hay muchas selecciones en la tabla se puede cambiar el tipo seleccionandolo en el combobox
        if(tablaHabitacion.getSelectedRowCount()>1){
         multipleSelectTabla();
         borraFilasTabla();
         cargarTabla();
        }
    }//GEN-LAST:event_jCBTipoHabitacionActionPerformed

    private void tablaHabitacionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaHabitacionMousePressed
       
       deTablaACampos();
        
    }//GEN-LAST:event_tablaHabitacionMousePressed

    private void jRBLibreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBLibreActionPerformed
        //al presionar el radio boton libre
        jRBOcupada.setSelected(false);
        cargaDatos(false);
    }//GEN-LAST:event_jRBLibreActionPerformed

    private void jRBOcupadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBOcupadaActionPerformed
        jRBLibre.setSelected(false);
        cargaDatos(true);
    }//GEN-LAST:event_jRBOcupadaActionPerformed

   //METODOS PARA BOTONES
    public void botonGuardar(){
         int rta=0;
                
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
    }
    
    public void botonBuscar(){
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
    }
    
    public void botonBorrar(){
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
    }
    
    public void botonActualizar(){
         Habitacion habitacion;
        Habitacion thAux;
        TipoHabitacion th;
        int rta=0;
        if(!jCBTipoHabitacion.getSelectedItem().equals("") &&!campoPiso.getText().equals("") && !jTFNroHabitacion.getText().equals(""))
        {
            int id=Integer.parseInt(jTFNroHabitacion.getText());
            int piso=Integer.parseInt(campoPiso.getText());
            boolean estado=!checkBoxLibre.isSelected();
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
    }
    
    public void borraFilasTabla(){

    int a =modelo.getRowCount()-1;
    //System.out.println("Tabla "+a);
    for(int i=a;i>=0;i--){
        modelo.removeRow(i );
        //System.out.println("Tabla "+i);
    }
}

    public void cargarTabla(){
     listaHabitacion=(ArrayList)habitacionData.obtenerHabitaciones(conexion);
        
        for(Habitacion m:listaHabitacion)
            
        modelo.addRow(new Object[]{m.getNumeroHabitacion(), m.getPisoHabitacion(), estadoHabitacion(m.getEstadoHabitacion()),m.getTipoHabitacion().getIdTipoHabitacion()+" "+ m.getTipoHabitacion().getCategoriaTipoHabitacion() });
   
  } 
    
    public void deTablaACampos(){
         //obtener fila seleccionada    
        int row = tablaHabitacion.getSelectedRow();
        
        //Creo variables que van a almacenar lo que hay en la fila
        String numero=tablaHabitacion.getValueAt(row, 0).toString();
        String piso=tablaHabitacion.getValueAt(row, 1).toString();
        String estado=tablaHabitacion.getValueAt(row, 2).toString();
        String tipoHab=tablaHabitacion.getValueAt(row, 3).toString();
        //inserto en textfield
       //numero Habitacion
       jTFNroHabitacion.setText(numero);
        //piso
       campoPiso.setText(piso);
        //estado
       jTFEstadoHabitacion.setText(estado);
      //combobox
       jCBTipoHabitacion.setSelectedItem(tipoHab);
    }
    
    public void limpiar(){
    limpiarComboBox();
    cargarTiposHabitacionEnComboBox();
    borraFilasTabla();
    jTFNroHabitacion.setText("");
    campoPiso.setText("");
    jTFEstadoHabitacion.setText("");
    checkBoxLibre.setSelected(false);
  }

    
    //calcula si la habitacion esta ocupada o no en base a las reservas en cursoñ
    public void mostrarHabitacion(Habitacion habitacion){

            String id= String.valueOf(habitacion.getNumeroHabitacion());
            jTFNroHabitacion.setText(id); 
            String piso= String.valueOf(habitacion.getPisoHabitacion());
            campoPiso.setText(piso);

            reservaData= new ReservaData(conexion);
            List <Reserva> reservasHabitacion= reservaData.obtenerReservas( conexion);
            LocalDate hoy=  LocalDate.now();
            Reserva rH = null;
            for (Reserva r:reservasHabitacion){
                   if(r.getHabitacion().getNumeroHabitacion()==habitacion.getNumeroHabitacion()){
                      rH= r;
                      }
               }
               //System.out.println(rH);
            boolean estado=habitacion.getEstadoHabitacion();
             if(estado && rH.getFechaFinReserva().plusDays(1).isAfter(hoy) && rH.getFechaInicioReserva().plusDays(1).isBefore(hoy) ||rH.getFechaFinReserva().plusDays(1).equals(hoy) || rH.getFechaInicioReserva().plusDays(1).isBefore(hoy)) {
                jTFEstadoHabitacion.setText("OCUPADA");
                    checkBoxLibre.setSelected(false);
            }else {jTFEstadoHabitacion.setText("LIBRE");
                checkBoxLibre.setSelected(true);}


            String idTH= String.valueOf(habitacion.getTipoHabitacion().getIdTipoHabitacion());
            String tipoTH= String.valueOf(habitacion.getTipoHabitacion().getCategoriaTipoHabitacion());
            jCBTipoHabitacion.setSelectedItem(idTH+" "+tipoTH);

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
   
    public void limpiarComboBox(){
        
        jCBTipoHabitacion.removeAllItems();
       
     }
    
    public TipoHabitacion deJCBaTipo(JComboBox jcomobox){
        
        String objetCb= (String)jcomobox.getSelectedItem();
        TipoHabitacion tpHabSelec=searchDeStringATipoHabitacion(objetCb);
        
         return tpHabSelec;
    }
    
    public  TipoHabitacion searchDeStringATipoHabitacion(String selectedItemComboBox){
        //sacar el id y pasarlo a int, buscar con el id en la base de datos y sacarlo como un tipoHabitacion completo
        int idTipoHabitacion= Integer.parseInt(selectedItemComboBox.substring(0, 2).trim());
      
       TipoHabitacion tH=(tipoHabitacionData.buscarTipoHabitacion(idTipoHabitacion));
    
        return tH;
    }
    
    public void multipleSelectTabla(){
      
      int[] numeroHabitacion =new int[tablaHabitacion.getSelectedRowCount()]; 
      for(int j=tablaHabitacion.getSelectedRow(); j<tablaHabitacion.getSelectedRow() +tablaHabitacion.getSelectedRowCount();j++){ 
          numeroHabitacion[j]= (int)tablaHabitacion.getValueAt(j, 0); 
      } 
      
      TipoHabitacion tpHabSelec= deJCBaTipo(jCBTipoHabitacion);
     
      for(int n:numeroHabitacion) {
          Habitacion h= habitacionData.buscarHabitacion(n, conexion);
          h.setTipoHabitacion(tpHabSelec);
          habitacionData.actualizarHabitacion(h);
          }
    }
  
    public String estadoHabitacion(Boolean buleano){
  String estado;
  if(buleano){
  estado= "OCUPADA";
  }else{
  estado= "LIBRE"; 
  }
  return estado;
  }
  
    public void cargaDatos(Boolean evento){
       borraFilasTabla();
        listaHabitacion=(ArrayList)habitacionData.obtenerHabitacionesSi(evento,conexion);
         for(Habitacion m:listaHabitacion)
            
        modelo.addRow(new Object[]{m.getNumeroHabitacion(), m.getPisoHabitacion(), estadoHabitacion(m.getEstadoHabitacion()),m.getTipoHabitacion().getIdTipoHabitacion()+" "+ m.getTipoHabitacion().getCategoriaTipoHabitacion() });
   
  } 
   
    public void cargarCabeceraTabla(){
      modelo=new DefaultTableModel();
  
        modelo.addColumn("Numero");
        modelo.addColumn("Piso");
        modelo.addColumn("Estado");
        modelo.addColumn("Tipo de Habitacion");
        this.tablaHabitacion.setModel(modelo);
}

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonListar;
    private javax.swing.JTextField campoPiso;
    private javax.swing.JCheckBox checkBoxLibre;
    private javax.swing.JComboBox<String> jCBTipoHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jRBLibre;
    private javax.swing.JRadioButton jRBOcupada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFEstadoHabitacion;
    private javax.swing.JTextField jTFNroHabitacion;
    private javax.swing.JTable tablaHabitacion;
    // End of variables declaration//GEN-END:variables
}

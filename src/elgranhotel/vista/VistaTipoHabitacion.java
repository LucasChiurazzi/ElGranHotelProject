/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.vista;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.TipoHabitacion;
import elgranhotel.modelo.TipoHabitacionData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lucas
 */
public class VistaTipoHabitacion extends javax.swing.JInternalFrame {
    private TipoHabitacionData tipoHabitacionData;
    private ArrayList<TipoHabitacion> listaTiposHabitacion;
    private Conexion conexion;
    
    

    /**
     * Creates new form VistaTipoHabitacion
     */
    public VistaTipoHabitacion() {
        initComponents();
        
        try {   
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
            
            tipoHabitacionData = new TipoHabitacionData(conexion);
            listaTiposHabitacion =(ArrayList)tipoHabitacionData.mostrarTipoHabitacion();
            
            
            //Método encargado de llenar el combobox
            cargarTiposHabitacionEnComboBox();
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaTipoHabitacion.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFCategoriaTipoHabitacion = new javax.swing.JTextField();
        jTFTipoCamaTipoHabitacion = new javax.swing.JTextField();
        jTFCantidadCamasTipoHabitacion = new javax.swing.JTextField();
        jTFCantPersonasTipoHabitacion = new javax.swing.JTextField();
        jBLimpiarTipoHabitacion = new javax.swing.JButton();
        jBBorrarTipoHabitacion = new javax.swing.JButton();
        jBActualizarTipoHabitacion = new javax.swing.JButton();
        jBNuevoTipoHabitacion = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jCBTipoHabitacion = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTFPrecioNocheTipoHabitacion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTFCodigoTipoHabitacion = new javax.swing.JTextField();
        jBActualizarPrecioTipoHabitacion = new javax.swing.JButton();

        setClosable(true);
        setForeground(java.awt.Color.gray);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion Yipos De Habitacion - El Gran Hotel 1.0");

        jLabel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel1.setText("TIPOS DE HABITACION");

        jLabel2.setText("TIPO");

        jTFCategoriaTipoHabitacion.setToolTipText("Ingrese Nombre de la categoria");

        jTFTipoCamaTipoHabitacion.setToolTipText("Ingrese el nombre de la categoria de cama");

        jTFCantidadCamasTipoHabitacion.setToolTipText("Ingrese numero de camas");

        jTFCantPersonasTipoHabitacion.setToolTipText("Ingrese el numero de la cantidad maxima de personas");

        jBLimpiarTipoHabitacion.setText("Limpiar");
        jBLimpiarTipoHabitacion.setToolTipText("<html>Limpia los campos, <br>puede usarlo antes de hacer un NUEVO tipo</html>\n");
        jBLimpiarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarTipoHabitacionActionPerformed(evt);
            }
        });

        jBBorrarTipoHabitacion.setText("Borrar");
        jBBorrarTipoHabitacion.setToolTipText("Borra el tipo de habitacion seleccionado");
        jBBorrarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarTipoHabitacionActionPerformed(evt);
            }
        });

        jBActualizarTipoHabitacion.setText("Actualizar");
        jBActualizarTipoHabitacion.setToolTipText("Modifica los campos del tipo de habitacion seleccionado");
        jBActualizarTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarTipoHabitacionActionPerformed(evt);
            }
        });

        jBNuevoTipoHabitacion.setText("Nuevo");
        jBNuevoTipoHabitacion.setToolTipText("<html>Crea un nuevo tipo de habitacion,<br> antes de escribir puede LIMPIAR los campos</html>");
        jBNuevoTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBNuevoTipoHabitacionActionPerformed(evt);
            }
        });

        jLabel7.setText("PRECIO X NOCHE");

        jCBTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBTipoHabitacionActionPerformed(evt);
            }
        });

        jLabel3.setText("NOMBRE");

        jLabel4.setText("CANTIDAD MAX PERSONAS");

        jLabel5.setText("CANTIDAD DE CAMAS");

        jLabel6.setText("TIPO DE CAMA");

        jTFPrecioNocheTipoHabitacion.setToolTipText("Ingrese el precio, puede usar decimales.");

        jLabel8.setText("CODIGO");

        jTFCodigoTipoHabitacion.setToolTipText("Ingrese Nro Codigo");

        jBActualizarPrecioTipoHabitacion.setText("Actualizar Precio");
        jBActualizarPrecioTipoHabitacion.setToolTipText("Util cuando solo se quiere ACTUALIZAR el PRECIO");
        jBActualizarPrecioTipoHabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarPrecioTipoHabitacionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBActualizarPrecioTipoHabitacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(3, 3, 3)
                                                .addComponent(jTFCategoriaTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTFCantidadCamasTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTFCantPersonasTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTFPrecioNocheTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(jTFTipoCamaTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 254, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(165, 165, 165)
                                        .addComponent(jLabel1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(40, 40, 40)
                                        .addComponent(jTFCodigoTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCBTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jBLimpiarTipoHabitacion)
                .addGap(56, 56, 56)
                .addComponent(jBBorrarTipoHabitacion)
                .addGap(66, 66, 66)
                .addComponent(jBActualizarTipoHabitacion)
                .addGap(55, 55, 55)
                .addComponent(jBNuevoTipoHabitacion)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFCategoriaTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel8)
                    .addComponent(jTFCodigoTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTFTipoCamaTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFCantidadCamasTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTFCantPersonasTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTFPrecioNocheTipoHabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBActualizarPrecioTipoHabitacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBBorrarTipoHabitacion)
                    .addComponent(jBActualizarTipoHabitacion)
                    .addComponent(jBNuevoTipoHabitacion)
                    .addComponent(jBLimpiarTipoHabitacion))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //cargar nuevos tipos de habitacion al hacer click en nuevo
    private void jBNuevoTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBNuevoTipoHabitacionActionPerformed
        
        
        int idTipoHabitacion = Integer.parseInt(jTFCodigoTipoHabitacion.getText());
        String nombreTipoHabitacion=jTFCategoriaTipoHabitacion.getText();
        String nombreTipoCama = jTFTipoCamaTipoHabitacion.getText();
        int cantidadCamas = Integer.parseInt(jTFCantidadCamasTipoHabitacion.getText());
        int cantMaxPersonas= Integer.parseInt(jTFCantPersonasTipoHabitacion.getText());
        double precioPorNoche= Double.parseDouble(jTFPrecioNocheTipoHabitacion.getText());
       
        
        TipoHabitacion tipoHabitacion= new TipoHabitacion(idTipoHabitacion, nombreTipoHabitacion, cantMaxPersonas, precioPorNoche, nombreTipoCama, cantidadCamas);
        tipoHabitacionData.agregarTipoHabitacion(tipoHabitacion);
        limpiarComboBox();
        
    }//GEN-LAST:event_jBNuevoTipoHabitacionActionPerformed

    
     //Borrar un tipo de habitacion seleccionado
    private void jBBorrarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarTipoHabitacionActionPerformed
      int idTipoHabitacion = Integer.parseInt(jTFCodigoTipoHabitacion.getText());
        
        tipoHabitacionData.eliminarTipoHabitacion(idTipoHabitacion);
        
        limpiarComboBox();
    }//GEN-LAST:event_jBBorrarTipoHabitacionActionPerformed

    
     //COMBOBOX Tipos de Habitacion
    private void jCBTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBTipoHabitacionActionPerformed
        
        
       cargarDatosDesdeElComboBox();
       
       
       
        
        
        
    }//GEN-LAST:event_jCBTipoHabitacionActionPerformed

    
    //actualizar los tipos de habitacion 
    private void jBActualizarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarTipoHabitacionActionPerformed

        int idTipoHabitacion = Integer.parseInt(jTFCodigoTipoHabitacion.getText());
        String nombreTipoHabitacion=jTFCategoriaTipoHabitacion.getText();
        String nombreTipoCama = jTFTipoCamaTipoHabitacion.getText();
        int cantidadCamas = Integer.parseInt(jTFCantidadCamasTipoHabitacion.getText());
        int cantMaxPersonas= Integer.parseInt(jTFCantPersonasTipoHabitacion.getText());
        double precioPorNoche= Double.parseDouble(jTFPrecioNocheTipoHabitacion.getText());

        TipoHabitacion tipoHabitacion= new TipoHabitacion(idTipoHabitacion, nombreTipoHabitacion, cantMaxPersonas, precioPorNoche, nombreTipoCama, cantidadCamas);
        tipoHabitacionData.cambiarTipoHabitacion(tipoHabitacion);
        
       
        limpiarComboBox();
        
        
        
    }//GEN-LAST:event_jBActualizarTipoHabitacionActionPerformed

    //actualizar solamente el precio 
    private void jBActualizarPrecioTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarPrecioTipoHabitacionActionPerformed
       int idTipoHabitacion = Integer.parseInt(jTFCodigoTipoHabitacion.getText());
       double precioPorNoche= Double.parseDouble(jTFPrecioNocheTipoHabitacion.getText());
        tipoHabitacionData.cambiarPrecioTipoHabitacion(precioPorNoche, idTipoHabitacion);
        limpiarComboBox();
        
    }//GEN-LAST:event_jBActualizarPrecioTipoHabitacionActionPerformed

    //limpia la interfaz  
    private void jBLimpiarTipoHabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarTipoHabitacionActionPerformed
        
        jTFCodigoTipoHabitacion.setText("");
        jTFCategoriaTipoHabitacion.setText("");
        jTFTipoCamaTipoHabitacion.setText("");
        jTFCantidadCamasTipoHabitacion.setText("");
        jTFCantPersonasTipoHabitacion.setText("");
        jTFPrecioNocheTipoHabitacion.setText("");
            
    }//GEN-LAST:event_jBLimpiarTipoHabitacionActionPerformed

   
    

//metodos combobox
    public void cargarTiposHabitacionEnComboBox(){
    //Carga los tipos de habitacion  al ComboBox
    if(jCBTipoHabitacion.getItemCount()==0){
     for(TipoHabitacion item: tipoHabitacionData.mostrarTipoHabitacion()){
            jCBTipoHabitacion.addItem(item.getIdTipoHabitacion() +" "+ item.getCategoriaTipoHabitacion());
                }
          
            }
    }
    
    public void cargarDatosDesdeElComboBox(){
      
            //Obtengo el tipo  q esta seleccionada en el ComboBox
            //TipoHabitacion tH=(TipoHabitacion)jCBTipoHabitacion.getSelectedItem();
            //cargarDatos(tH);
            if(jCBTipoHabitacion.getItemCount()>0){
                String objetCb= (String)jCBTipoHabitacion.getSelectedItem();
            
                cargarDatos(searchDeStringATipoHabitacion(objetCb));
            }
    }
    
    public  TipoHabitacion searchDeStringATipoHabitacion(String selectedItemComboBox){
        //sacar el id y pasarlo a int, buscar con el id en la base de datos y sacarlo como un tipoHabitacion completo
        int idTipoHabitacion= Integer.parseInt(selectedItemComboBox.substring(0, 2).trim());
      
       TipoHabitacion tH=(tipoHabitacionData.mostrarTipoHabitacion(idTipoHabitacion));
    
        return tH;
    }
        
    public void cargarDatos(TipoHabitacion tipoHabitacion) {

              
        
        if (tipoHabitacion != null) {
        jTFCodigoTipoHabitacion.setText(tipoHabitacion.getIdTipoHabitacion()+"");
        jTFCategoriaTipoHabitacion.setText(tipoHabitacion.getCategoriaTipoHabitacion());
        jTFTipoCamaTipoHabitacion.setText(tipoHabitacion.getTipoCamaTipoHabitacion());
        jTFCantidadCamasTipoHabitacion.setText(tipoHabitacion.getCantidadCamasTipoHabitacion()+"");
        jTFCantPersonasTipoHabitacion.setText(tipoHabitacion.getCantPersonasTipoHabitacion()+"");
        jTFPrecioNocheTipoHabitacion.setText(tipoHabitacion.getPrecioNocheTipoHabitacion()+"");
            
        
        }
    }
    
    public void limpiarComboBox(){
        
        jCBTipoHabitacion.removeAllItems();
        cargarTiposHabitacionEnComboBox();
        
    }
    
    
    
    
    
    
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizarPrecioTipoHabitacion;
    private javax.swing.JButton jBActualizarTipoHabitacion;
    private javax.swing.JButton jBBorrarTipoHabitacion;
    private javax.swing.JButton jBLimpiarTipoHabitacion;
    private javax.swing.JButton jBNuevoTipoHabitacion;
    private javax.swing.JComboBox<String> jCBTipoHabitacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTFCantPersonasTipoHabitacion;
    private javax.swing.JTextField jTFCantidadCamasTipoHabitacion;
    private javax.swing.JTextField jTFCategoriaTipoHabitacion;
    private javax.swing.JTextField jTFCodigoTipoHabitacion;
    private javax.swing.JTextField jTFPrecioNocheTipoHabitacion;
    private javax.swing.JTextField jTFTipoCamaTipoHabitacion;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.vista;


import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import static elgranhotel.vista.Principal.escritorio;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class VistaHuesped extends javax.swing.JInternalFrame {
      private HuespedData huespedData;
      private Conexion conexion;
      private Huesped huesped;
      private List<Huesped> listaHuespedes;
      DefaultTableModel modeloHuesped;
      private String opcion;
      
    /**
     * Creates new form VistaHuesped1
     */
    public VistaHuesped() {
        initComponents();
        
        try {
        conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        modeloHuesped=new DefaultTableModel();
        huespedData= new HuespedData(conexion);
        listaHuespedes=new ArrayList<>();
        armaCabeceraTabla();
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaHuesped.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jtDomicilio = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jtCelular = new javax.swing.JTextField();
        jBtGuardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jBtModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jBtBorrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtBuscarDniHuesped = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableHuesped = new javax.swing.JTable();
        jBbuscarTodosH = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jtDni = new javax.swing.JFormattedTextField();
        jtNombre = new javax.swing.JTextField();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestion de Huespedes- El Gran Hotel 1.0");

        jLabel6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel6.setText("HUESPED");

        jLabel5.setText("Celular");

        jBtGuardar.setText("Guardar");
        jBtGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtGuardarActionPerformed(evt);
            }
        });

        jLabel1.setText("DNI");

        jBtModificar.setText("Modificar");
        jBtModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre");

        jBtBorrar.setText("Borrar");
        jBtBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBorrarActionPerformed(evt);
            }
        });

        jLabel3.setText("Domicilio");

        jLabel4.setText("Correo");

        jBtBuscarDniHuesped.setText("Buscar");
        jBtBuscarDniHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtBuscarDniHuespedActionPerformed(evt);
            }
        });

        jTableHuesped.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título 1", "Título 2", "Título 3", "Título 4"
            }
        ));
        jTableHuesped.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableHuespedMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableHuesped);

        jBbuscarTodosH.setText("Todos");
        jBbuscarTodosH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBbuscarTodosHActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        try {
            jtDni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 456, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(166, 166, 166)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(4, 4, 4)
                                                .addComponent(jBtBuscarDniHuesped)
                                                .addGap(18, 18, 18)
                                                .addComponent(jBbuscarTodosH))
                                            .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel5)
                                                .addGap(31, 31, 31)
                                                .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jBtGuardar)
                                                .addGap(45, 45, 45)
                                                .addComponent(jBtModificar)))
                                        .addGap(24, 24, 24)
                                        .addComponent(jBtBorrar)
                                        .addGap(28, 28, 28)
                                        .addComponent(jBLimpiar)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDni, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtBuscarDniHuesped)
                        .addComponent(jBbuscarTodosH)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtGuardar)
                    .addComponent(jBtModificar)
                    .addComponent(jBtBorrar)
                    .addComponent(jBLimpiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtGuardarActionPerformed
        long dni= Long.parseLong(jtDni.getText());
        String nombre=jtNombre.getText();
        String domicilio=jtDomicilio.getText();
        String correo=jtCorreo.getText();
        String celular=jtCelular.getText();

        huesped=new Huesped(dni,nombre,domicilio,correo,celular);
        huespedData.crearHuesped(huesped);
       
        
        JOptionPane.showMessageDialog(escritorio, "El Huesped se guardo correctamente");
        
        VistaReserva vr=new VistaReserva();
        Principal.escritorio.add(vr);
        vr.toFront();
        vr.setVisible(true);
        // toma el dni que buscaron en reserva y lo setea en el text field de dni 
        vr.jTHuespedReserva.setText(dni+" "+huesped.getNombreHuesped());
      
        dispose();
        
        

    }//GEN-LAST:event_jBtGuardarActionPerformed

    private void jBtModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtModificarActionPerformed
        if (jtDni.getText()!=null){
            long dni=Long.parseLong(jtDni.getText());
            String nombre=jtNombre.getText();
            String domicilio=jtDomicilio.getText();
            String correo=jtCorreo.getText();
            String celular=jtCelular.getText();

            huesped=new Huesped(dni,nombre,domicilio,correo,celular);
            huespedData.modificarHuesped(huesped);
        }
            JOptionPane.showMessageDialog(escritorio, "Se ha Modificado un Huesped.");
            borraFilasTabla();
    }//GEN-LAST:event_jBtModificarActionPerformed

    private void jBtBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBorrarActionPerformed
        //elimino un huesped
        long dni=Long.parseLong(jtDni.getText());
        huespedData.eliminarHuesped(dni);
        JOptionPane.showMessageDialog(escritorio, "Se ha borrado un Huesped.");
        borraFilasTabla();
    }//GEN-LAST:event_jBtBorrarActionPerformed

    private void jBtBuscarDniHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtBuscarDniHuespedActionPerformed
        //declaro y recibo dni
        long dniHuesped;
        dniHuesped = Long.parseLong(jtDni.getText());
        
        //si el campo dni no esta vacio, inserto los valores en el formulario
        if (jtDni.getText()!=null){
                         
            huesped= huespedData.mostrarHuesped(dniHuesped);
            jtNombre.setText(huesped.getNombreHuesped());
            jtDomicilio.setText(huesped.getDomicilioHuesped());
            jtCorreo.setText(huesped.getCorreoHuesped());
            jtCelular.setText(huesped.getCelularHuesped());
          
            opcion="buscarDni";
            //cargo datos en la tabla
            cargarDatos(opcion); 
        
        }
        
  
        
         
    }//GEN-LAST:event_jBtBuscarDniHuespedActionPerformed

    private void jBbuscarTodosHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarTodosHActionPerformed
       //boton buscar
        opcion="buscarTodos";
        cargarDatos(opcion);
        
    }//GEN-LAST:event_jBbuscarTodosHActionPerformed

    private void jTableHuespedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableHuespedMouseClicked
        //clic en alguna fila de la tabla
        cargarDatosDesdeTabla();
        
        
    }//GEN-LAST:event_jTableHuespedMouseClicked

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        //limpieza de campos
        limpiar();
        
    }//GEN-LAST:event_jBLimpiarActionPerformed
public void armaCabeceraTabla(){
  
        ArrayList<Object> columnas=new ArrayList<>();
        columnas.add("Id Reserva");
        columnas.add("Fecha Ingreso");
        columnas.add("Fecha Salida");
        columnas.add("Estado");
        columnas.add("Huesped");
        columnas.add("Habitación");
        for(Object it: columnas){
            modeloHuesped.addColumn(it);
        }
        jTableHuesped.setModel(modeloHuesped);
  }
    
    public void cargarDatos(String opcion){
        borraFilasTabla();
        if(opcion=="buscarDni"){
            listaHuespedes.removeAll(listaHuespedes);
            listaHuespedes.add(huespedData.mostrarHuesped(Long.parseLong(jtDni.getText())));
        }          
        if(opcion=="buscarTodos"){
            listaHuespedes.removeAll(listaHuespedes);
            listaHuespedes = huespedData.mostrarHuespedes();
        }
        for(Huesped h:listaHuespedes){
            modeloHuesped.addRow(new Object[]{h.getDniHuesped(), h.getNombreHuesped(), h.getDomicilioHuesped(), h.getCorreoHuesped(), h.getCelularHuesped()});
        }        
    }

    public void cargarDatosDesdeTabla(){
        
         //obtener fila seleccionada    
        int row = jTableHuesped.getSelectedRow();
        
        //Creo variables que van a almacenar lo que hay en la fila
        String dni=jTableHuesped.getValueAt(row, 0).toString();
        String nombre=jTableHuesped.getValueAt(row, 1).toString();
        String domicilio=jTableHuesped.getValueAt(row, 2).toString();
        String correo=jTableHuesped.getValueAt(row, 3).toString();
        String celular=jTableHuesped.getValueAt(row, 4).toString();
        //inserto en textfield
         jtDni.setText(dni);
         jtNombre.setText(nombre);
         jtDomicilio.setText(domicilio);
         jtCorreo.setText(correo);
         jtCelular.setText(celular);
       
    
    }

    public void limpiar(){
         jtDni.setText("");
         jtNombre.setText("");
         jtDomicilio.setText("");
         jtCorreo.setText("");
         jtCelular.setText("");
        
    }
    
      public void borraFilasTabla(){

      int a =modeloHuesped.getRowCount()-1; 
         //uso for que inicie en el valor de a y va disminuyendo hasta ser igual a 0
         for(int i=a;i>=0;i--){
            //limpieza de tabla
            modeloHuesped.removeRow(i ); 
        }
     }
    
  
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBbuscarTodosH;
    private javax.swing.JButton jBtBorrar;
    private javax.swing.JButton jBtBuscarDniHuesped;
    private javax.swing.JButton jBtGuardar;
    private javax.swing.JButton jBtModificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableHuesped;
    private javax.swing.JTextField jtCelular;
    private javax.swing.JTextField jtCorreo;
    public static javax.swing.JFormattedTextField jtDni;
    private javax.swing.JTextField jtDomicilio;
    private javax.swing.JTextField jtNombre;
    // End of variables declaration//GEN-END:variables
}

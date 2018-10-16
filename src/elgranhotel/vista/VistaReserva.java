/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.vista;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hugo
 */
public class VistaReserva extends javax.swing.JInternalFrame {
private ArrayList<Reserva> listaReservas;
private ArrayList<Huesped> listaHuespedes;
private DefaultTableModel modelo;
private HuespedData huespedData;
private ReservaData reservaData;
private Conexion conexion;
/**
     * Creates new form VistaReserva
     */
    public VistaReserva() {
       initComponents();
        
        try {
        conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        modelo=new DefaultTableModel();
        
        huespedData = new HuespedData(conexion);
        listaHuespedes =(ArrayList)huespedData.obtenerHuespedes();
        
        reservaData = new ReservaData(conexion);
        listaReservas =(ArrayList)reservaData;
        
        huespedData = new HuespedData(conexion);
        listaHuespedes =(ArrayList)huespedData.obtenerHuespedes();
        
      
        
        //Método encargado de llenar el combobox
        cargaMaterias();
         
        armaCabeceraTabla();
        cargaDatos();
        
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaAlumnos.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
     public void armaCabeceraTabla(){
    
        //Titulos de Columnas
        ArrayList<Object> columnas=new ArrayList<Object>();
        columnas.add("idReserva");
        columnas.add("fechaInicioReserva");
        columnas.add("fechaFinReserva");
        columnas.add("estadoReserva");
        columnas.add("dniHuesped");
        columnas.add("idHabitacion");
        
        for(Object it:columnas){
        
            modelo.addColumn(it);
        }
        tReservas.setModel(modelo);
  }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextFieldDniHuesped = new javax.swing.JTextField();
        jButtonDniHuesped = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tReservas = new javax.swing.JTable();

        jLabel4.setText("Reserva");

        jButtonDniHuesped.setText("Buscar Huesped");
        jButtonDniHuesped.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDniHuespedActionPerformed(evt);
            }
        });

        tReservas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tReservas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonDniHuesped)
                    .addComponent(jTextFieldDniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldDniHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonDniHuesped)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDniHuespedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDniHuespedActionPerformed
        buscarDatos();
    }//GEN-LAST:event_jButtonDniHuespedActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDniHuesped;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldDniHuesped;
    private javax.swing.JTable tReservas;
    // End of variables declaration//GEN-END:variables
public void buscarDatos(){
    //Carga las materias al ComboBox
     for(Reserva item:listaReservas){
            cbReservas.addItem(item);
    }

}
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.vista;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Habitacion;
import elgranhotel.modelo.HabitacionData;
import elgranhotel.modelo.Huesped;
import elgranhotel.modelo.HuespedData;
import elgranhotel.modelo.Reserva;
import elgranhotel.modelo.ReservaData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hugo
 */
public class VistaReserva extends javax.swing.JInternalFrame {

private DefaultTableModel modelo;    
private ArrayList<Reserva> listaReserva;
private ArrayList<Huesped> listaHuespedes;
private ArrayList<Habitacion> listaHabitaciones;
private ReservaData reservaData;
private HuespedData huespedData;
private HabitacionData habitacionData;
private Conexion conexion;
//public JTable jTable1;    
    
    public VistaReserva() {
        initComponents();
   
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableBuscarReservaDni = new javax.swing.JTable();
        Buscar = new javax.swing.JButton();
        jtfDni = new javax.swing.JTextField();

        jTableBuscarReservaDni.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableBuscarReservaDni);

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jtfDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDniActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Buscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfDni))
                        .addGap(152, 152, 152))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
       //recibo dni 
        long dniHuesped;
        dniHuesped = Long.parseLong(jtfDni.getText());
        //mostrarConsulta();
        try {
        conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        
        reservaData= new ReservaData(conexion);
        
        listaReserva = (ArrayList<Reserva>) reservaData.buscarReserva(dniHuesped);
        String fila[][]= new String [listaReserva.size()][6];
        int i;
        for (i=0; i<listaReserva.size(); i++){
       
         fila[i][0] = String.valueOf(listaReserva.get(i).getIdReserva());
         fila[i][1] = String.valueOf(listaReserva.get(i).getFechaInicioReserva());
         fila[i][2] = String.valueOf(listaReserva.get(i).getFechaFinReserva());
         fila[i][3] = String.valueOf(listaReserva.get(i).getEstadoReserva());
         fila[i][4] = String.valueOf(listaReserva.get(i).getHuesped().getDniHuesped());
         fila[i][5] = String.valueOf(listaReserva.get(i).getHabitacion().getNumeroHabitacion());
        }
// for (Reserva h: listaReserva){  
       //           System.out.println((Arrays.toString(new Object[]{h.getIdReserva(),h.getFechaInicioReserva(),h.getFechaFinReserva(),h.getEstadoReserva(),h.getHuesped().getDniHuesped(),h.getHabitacion().getNumeroHabitacion()})));

       // } 
      jTableBuscarReservaDni.setModel(new javax.swing.table.DefaultTableModel(
               fila,
            new String [] {
               "Id reserva", "fecha Inicio", "fecha fin" , "Estado", "dni" , "habitacion"
            }
        ));     
  } catch (ClassNotFoundException ex) {
        Logger.getLogger(VistaReserva.class.getName()).log(Level.SEVERE, null, ex);
   }
    
      
    }//GEN-LAST:event_BuscarActionPerformed

    private void jtfDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDniActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableBuscarReservaDni;
    private javax.swing.JTextField jtfDni;
    // End of variables declaration//GEN-END:variables
}

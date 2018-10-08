/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Grupo7
 */
public class ElGranHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
     Conexion conexion = null;
     HuespedData huespedDataTest;
     
        try {
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ElGranHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
     huespedDataTest = new HuespedData(conexion);
     
        
  
     
    }
    
}

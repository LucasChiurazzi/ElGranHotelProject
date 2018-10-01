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
        try {
            Conexion conexion=new Conexion("hotel","root","");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ElGranHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Huesped huesped= new Huesped("juancito",12321234,"calle falsa 123","juanci@gmail.com","2664212121");
        
    }
    
}

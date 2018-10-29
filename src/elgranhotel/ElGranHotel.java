/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

import java.text.ParseException;

/**
 *
 * @author ma
 */
public class ElGranHotel {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) throws ParseException {
        
        Conexion conexion;
 
        try {
            conexion = new Conexion("jdbc:mysql://localhost/prueba", "root", "");
            HuespedData huespedData = new HuespedData(conexion);
            
  huespedData.mostrarHuesped().forEach(huesped -> {
                System.out.println("Nombre: " + huesped.getNombre() );
            });
            
            
        } catch (Exception e) {
            System.out.println("Error al instanciar la clase conexion: " + e.getMessage());
        }
   
        
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel;

import java.util.Scanner;
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
     TipoHabitacionData tipoHabitacionDataTest;
     
        try {
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ElGranHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     //Vemos que funcione todo bien
     //instanciamos un objeto huespedDataTest que recibe un objeto conexion
     huespedDataTest = new HuespedData(conexion);
     //usamos Scanner para que pueda usar la consola de java para recibir valores por teclado
    tipoHabitacionDataTest = new TipoHabitacionData(conexion);
    
    TipoHabitacion tipoHabitacionTest;
    
    //tipoHabitacionTest= new TipoHabitacion(2, "Estandar simple", 1, 200, "Simple", 1);
    
    //tipoHabitacionDataTest.agregarTipoHabitacion(tipoHabitacionTest);
    
    System.out.println(tipoHabitacionDataTest.mostrarTipoHabitacion());
        
  
     
    }
    
}

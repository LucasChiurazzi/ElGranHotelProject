/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elgranhotel.modelo;

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
     
        try {
            conexion = new Conexion("jdbc:mysql://localhost/hotel", "root", "");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ElGranHotel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
     //Vemos que funcione todo bien
     //instanciamos un objeto huespedDataTest que recibe un objeto conexion
     huespedDataTest = new HuespedData(conexion);
     //usamos Scanner para que pueda usar la consola de java para recibir valores por teclado
     Scanner scanner = new Scanner(System.in);
     
     //pedimos valores para el huesped
     System.out.println("--Nuevo huesped--");
     System.out.print("Ingrese dni: ");
     long dni=Long.parseLong(scanner.nextLine());
     System.out.print("Ingrese nombre: ");
     String nombre = scanner.nextLine();
     System.out.print("Ingrese domicilio: ");
     String domicilio = scanner.nextLine();
     System.out.print("Ingrese correo: ");
     String correo = scanner.nextLine();
     System.out.print("Ingrese celular: ");
     String celular = scanner.nextLine();
     
     //una vez que recibimos todos los valores
     //instanciamos un objeto huesped con los valores ingresados
     //en el constructor
     Huesped huesped = new Huesped(dni, nombre, domicilio, correo, celular);
     //por ultimo usamos el metodo crear huesped de la clase Huesped data
     // a traves del objeto huespedDataTest
     huespedDataTest.crearHuesped(huesped);
        
  
     
    }
    
}


package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class HuespedData {
    //atributo
    private Connection connection = null;

    //constructor
    public HuespedData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    //metodos
    
    //creo un nuevo huesped
    public int crearHuesped(Huesped huesped){
        int rta=0;
        try {
            
            String sql = "INSERT INTO huesped (dniHuesped, nombreHuesped, domicilioHuesped, correoHuesped, celularHuesped) VALUES ( ? , ? , ? , ? , ?);";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, huesped.getDniHuesped());
            statement.setString(2, huesped.getNombreHuesped());
            statement.setString(3, huesped.getDomicilioHuesped());
            statement.setString(4, huesped.getCorreoHuesped());
            statement.setString(5, huesped.getCelularHuesped());
            
            rta=statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un huesped: " + ex.getMessage());
        }
        return rta;
    }
    //modifico todos los campos de un huesped
    public int modificarHuesped(Huesped huesped){
        int rta=0;
        try {
            
            String sql = "UPDATE huesped SET nombreHuesped = ?, domicilioHuesped = ? , correoHuesped = ? , celularHuesped = ? WHERE dniHuesped = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, huesped.getNombreHuesped());
            statement.setString(2, huesped.getDomicilioHuesped());
            statement.setString(3, huesped.getCorreoHuesped());
            statement.setString(4, huesped.getCelularHuesped());
            statement.setLong(5, huesped.getDniHuesped());
            rta=statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un huesped: " + ex.getMessage());
        }
    return rta;
}
    //elimino huesped filtrando por dni
    public int eliminarHuesped(long dni){
     int rta=0;
     try {
            
            String sql = "DELETE FROM huesped WHERE dniHuesped =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, dni);
                       
            rta=statement.executeUpdate();
             
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un huesped: " + ex.getMessage());
        }
        return rta;
    
    }
    //muestro huesped filtrado por dni
    public Huesped mostrarHuesped(long dni){
        Huesped huesped=null;
            

        try {
            String sql = "SELECT * FROM huesped WHERE dniHuesped = ? ;" ;
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, dni);
            ResultSet resultSet = statement.executeQuery();
            
            
            
            while(resultSet.next()){
                huesped = new Huesped();
                huesped.setDniHuesped(resultSet.getLong("dniHuesped"));
                huesped.setNombreHuesped(resultSet.getString("nombreHuesped"));
                huesped.setDomicilioHuesped(resultSet.getString("domicilioHuesped"));
                huesped.setCorreoHuesped(resultSet.getString("correoHuesped"));
                huesped.setCelularHuesped(resultSet.getString("celularHuesped"));

            
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return huesped;
    }
    
//muestro todos los huespedes
     public List<Huesped> mostrarHuespedes(){
      List<Huesped> huespedes = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM huesped; " ;
            PreparedStatement statement = connection.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            
            
             Huesped huesped;
            
            while(resultSet.next()){
                huesped = new Huesped();
                huesped.setDniHuesped(resultSet.getLong("dniHuesped"));
                huesped.setNombreHuesped(resultSet.getString("nombreHuesped"));
                huesped.setDomicilioHuesped(resultSet.getString("domicilioHuesped"));
                huesped.setCorreoHuesped(resultSet.getString("correoHuesped"));
                huesped.setCelularHuesped(resultSet.getString("celularHuesped"));

                huespedes.add(huesped);
               
            }      
            
            
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return huespedes;
    }
   
}
    
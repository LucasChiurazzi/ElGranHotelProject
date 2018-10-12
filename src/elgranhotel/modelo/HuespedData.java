
package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    public void crearHuesped(Huesped huesped){
        try {
            
            String sql = "INSERT INTO huesped (dniHuesped, nombreHuesped, domicilioHuesped, correoHuesped, celularHuesped) VALUES ( ? , ? , ? , ? , ?);";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, huesped.getDniHuesped());
            statement.setString(2, huesped.getNombreHuesped());
            statement.setString(3, huesped.getDomicilioHuesped());
            statement.setString(4, huesped.getCorreoHuesped());
            statement.setString(5, huesped.getCelularHuesped());
            
            statement.executeUpdate();
            
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un huesped: " + ex.getMessage());
        }
    }
    //modifico todos los campos de un huesped
    public void modificarHuesped(Huesped huesped){
    
        try {
            
            String sql = "UPDATE huesped SET nombreHuesped = ?, domicilioHuesped = ? , correoHuesped = ? , celularHuesped = ? WHERE dniHuesped = ?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, huesped.getNombreHuesped());
            statement.setString(2, huesped.getDomicilioHuesped());
            statement.setString(3, huesped.getCorreoHuesped());
            statement.setString(4, huesped.getCelularHuesped());
            statement.setLong(5, huesped.getDniHuesped());
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al actualizar un huesped: " + ex.getMessage());
        }
    
}
    //elimino huesped filtrando por dni
    public void eliminarHuesped(long dni){
    try {
            
            String sql = "DELETE FROM huesped WHERE dniHuesped =?;";

            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setLong(1, dni);
                       
            statement.executeUpdate();
             
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al borrar un huesped: " + ex.getMessage());
        }
        
    
    }
    //muestro huesped filtrado por dni
    public List<Huesped> mostrarHuesped(long dni){
        List<Huesped> huespedes = new ArrayList<Huesped>();
            

        try {
            String sql = "SELECT * FROM huesped WHERE dniHuesped = "+ dni + " ;" ;
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
    
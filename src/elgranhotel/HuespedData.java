
package elgranhotel;

import elgranhotel.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class HuespedData {
    private Connection connection = null;

    public HuespedData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }
    
    
    public void crearHuesped(Huesped huesped){
        try {
            
            String sql = "INSERT INTO huesped (nombre, dni, domicilio, correo, celular)";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, huesped.getNombre());
            statement.setLong(2, huesped.getDni ());
            statement.setString(3, huesped.getDomicilio());
            statement.setString(4, huesped.getCorreo());
            statement.setString(5, huesped.getCelular());
            
            statement.executeUpdate();
            
            ResultSet rs = statement.getGeneratedKeys();
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un huesped: " + ex.getMessage());
        }
    }
    
    public void modificarHuesped(Huesped huesped){
    
        try {
            
            String sql = "UPDATE huesped SET nombreHuesped = ?, domicilioHuesped = ? , correoHuesped = ? , celularHuesped = ? WHERE dniHuesped = ?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, huesped.getNombre());
            statement.setString(2, huesped.getDomicilio());
            statement.setString(3, huesped.getCorreo());
            statement.setString(4, huesped.getCelular());
            statement.setLong(5, huesped.getDni());
            statement.executeUpdate();
            
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un huesped: " + ex.getMessage());
        }
    
}
 
    public void eliminarHuesped(long dni){
    try {
            
            String sql = "DELETE FROM huesped WHERE dniHuesped =?;";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setLong(1, dni);
                       
            statement.executeUpdate();
             
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un huesped: " + ex.getMessage());
        }
        
    
    }
    
    public List<Huesped> mostrarHuesped(long dni){
        List<Huesped> huespedes = new ArrayList<Huesped>();
            

        try {
            String sql = "SELECT * FROM huesped WHERE dniHuesped = ? ;";
            PreparedStatement statement = connection.prepareStatement(sql);
            Huesped huespedDni= new Huesped();
            statement.setLong(1, huespedDni.getDni());
            ResultSet resultSet = statement.executeQuery();
            Huesped huesped;
            while(resultSet.next()){
                huesped = new Huesped();
                huesped.setNombre(resultSet.getString("nombre"));
                huesped.setDni(resultSet.getLong("dni"));
                huesped.setDomicilio(resultSet.getString("domicilio"));
                huesped.setCorreo(resultSet.getString("correo"));
                huesped.setCelular(resultSet.getString("celular"));

                huespedes.add(huesped);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        
        return huespedes;
    }
    
}
    
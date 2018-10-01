package elgranhotel;

import elgranhotel.modelo.Conexion;
import elgranhotel.modelo.Huesped;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


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
            
            String sql = "INSERT INTO Huesped (dniHuesped, nombreHuesped, domicilioHuesped, correoHuesped, celularHuesped) VALUES ( ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setLong(1, huesped.getDni());
            statement.setString(2, huesped.getNombre());
            statement.setString(3, huesped.getDomicilio());
            statement.setString(4, huesped.getCorreo());
            statement.setString(5, huesped.getCelular());
            statement.executeUpdate();
            
            //ResultSet rs = statement.getGeneratedKeys();

            /*if (rs.next()) {
              //  huesped.setDni(rs.getDni(1));
            
        } else {
                System.out.println("No se pudo obtener el DNI luego de insertar un huesped");
            }*/
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un huesped: " + ex.getMessage());
        }
    }
public void ModificarHuesped(Huesped huesped){
    
        try {
            
            String sql = "UPDATE huesped SET nombreHuesped = ?, domicilioHuesped = ? , correoHuesped =? , celularHuesped =? WHERE dniHuesped = ?;";

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

public void EliminarHuesped(long dni){
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
}

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

//Constructor
public HuespedData(Conexion conexion) {
        try {
            connection = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

//metodos
public void crearHuesped(Huesped huesped){
        try {
            
            String sql = "INSERT INTO huesped (dniHuesped, nombreHuesped, domicilioHuesped, correoHuesped, celularHuesped) VALUES ( ? , ? , ? , ? , ? );";

            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setLong(1, huesped.getDni());
            statement.setString(2, huesped.getNombre());
            statement.setString(3, huesped.getDomicilio());
            statement.setString(4, huesped.getCorreo());
            statement.setString(5, huesped.getCelular());
            statement.executeUpdate();
           
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
            String sql = "SELECT * FROM huesped;";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            Huesped huesped;
            while(resultSet.next()){
                huesped = new Huesped();
                huesped.setNombre(resultSet.getString("nombreHuesped"));
                huesped.setDni(resultSet.getLong("dniHuesped"));
                huesped.setDomicilio(resultSet.getString("domicilioHuesped"));
                huesped.setCorreo(resultSet.getString("correoHuesped"));
                huesped.setCelular(resultSet.getString("celularHuesped"));
                huespedes.add(huesped);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los huespedes: " + ex.getMessage());
        }
        
        return huespedes;
    } 
}

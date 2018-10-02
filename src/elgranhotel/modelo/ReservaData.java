
package elgranhotel.modelo;

import java.sql.Connection;
import java.sql.SQLException;


public class ReservaData {
    private Connection connection = null;

    public ReservaData(Conexion conexion) {
        try {
            connection=conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }

    public Huesped buscarReserva(Huesped huesped){
    
    }
    
}

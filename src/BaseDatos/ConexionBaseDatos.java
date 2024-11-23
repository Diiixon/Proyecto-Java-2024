package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Dixon Tapia Aguilera
 */
public class ConexionBaseDatos {
    
    public Connection conectar()
    {
        Connection conexion = null;
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectojava","root","3597");
            System.out.println("\nConectado a la Base de Datos!");
            
        } catch (Exception e) {
            System.out.println("\nImposible conectar a la Base de Datos!");
        }return conexion;
    }

}

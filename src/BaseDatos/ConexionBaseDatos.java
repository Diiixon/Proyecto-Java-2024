package BaseDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Dixon Tapia Aguilera
 */
public class ConexionBaseDatos {
    static String url = "jdbc:mysql://proyectojava.c6qc4fmw5hv7.us-east-1.rds.amazonaws.com:3306/proyectojava";
    static String usuario = "admin";
    static String contrasena ="Dangerous2506";
    
    public static Connection conectar(){
        Connection con = null;
        try {
            con = DriverManager.getConnection(url,usuario,contrasena);
            System.out.println("Conexion exitosa ");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
    
    

}

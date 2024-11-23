
package Controlador;

import BaseDatos.ConexionBaseDatos;
import Modelo.Usuario;
import Modelo.Medico;
import Modelo.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Metodos {
    
    public boolean registrarUsuario(Usuario usuario)
    {
        try {
            
            ConexionBaseDatos conbd = new ConexionBaseDatos();
            Connection conex = conbd.conectar();
            
            String query = "INSERT INTO usuario(DIA_NAC_USUARIO,MES_NAC_USUARIO,ANO_NAC_USUARIO,NUMRUT_USUARIO,NOMBRE_USUARIO,CORREO_USUARIO,TELEFONO_USUARIO) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement stmt = conex.prepareStatement(query);
            
            stmt.setInt(1, usuario.getDia());
            stmt.setInt(2, usuario.getMes());
            stmt.setInt(3, usuario.getAno());
            stmt.setString(4, usuario.getNumRut());
            stmt.setString(5, usuario.getNombre());
            stmt.setString(6, usuario.getCorreo());
            stmt.setInt(7, usuario.getNumTelefono());
            
            stmt.executeUpdate();
            stmt.close();
            conex.close();
            
            return true;
            
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al registrar Usuario "+ e.getMessage());
            return false;
        }
        catch (Exception e)
        {
            System.out.println("Error en el método registrar Usuario "+ e.getMessage());
            return false;
        }
    }
    
    public boolean registrarMedico(Medico medico)
    {
        
        try {
            
            ConexionBaseDatos conbd = new ConexionBaseDatos();
            Connection conex = conbd.conectar();
            
            String query = "INSERT INTO medico(ID_ESPECIALIDAD,NUMRUT_MEDICO,NOMBRE_MEDICO,CORREO_MEDICO,TELEFONO_MEDICO) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conex.prepareStatement(query);
            
            stmt.setInt(1, medico.getIdEspecialidad());
            stmt.setString(2, medico.getNumRut());
            stmt.setString(3, medico.getNombre());
            stmt.setString(4, medico.getCorreo());
            stmt.setInt(5, medico.getNumTelefono());
            
            
            
            stmt.executeUpdate();
            stmt.close();
            conex.close();
            
            return true;
              
        }
        catch (SQLException e)
        {
            System.out.println("Error en SQL al registrar Médico");
            return false;
        }
        
        catch (Exception e) {
            System.out.println("Error en el método registrar Médico");
            return false;
        }
        
    }
    
    public ArrayList<Medico> mostrarMedicos()
    {
        ArrayList<Medico> lista = new ArrayList<>();
        
        try {
            
            ConexionBaseDatos conbd = new ConexionBaseDatos();
            Connection conex = conbd.conectar();
            
            String query = "SELECT * FROM medico ORDER BY id_especialidad";
            PreparedStatement stmt = conex.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while   (rs.next())
            {
                Medico medico = new Medico();
                medico.setIdEspecialidad(rs.getInt("ID_ESPECIALIDAD"));
                medico.setNumRut(rs.getString("NUMRUT_MEDICO"));
                medico.setNombre(rs.getString("NOMBRE_MEDICO"));
                medico.setCorreo(rs.getString("CORREO_MEDICO"));
                medico.setNumTelefono(rs.getInt("TELEFONO_MEDICO"));
                
                lista.add(medico);
            }
            
            rs.close();
            stmt.close();
            conex.close();
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al mostrar Medicos "+ e.getMessage());
        }
        return lista;
        
        
    }
    
    public boolean registrarEspecialidad(Especialidad especialidad)
    {
        try {
            
            ConexionBaseDatos conbd = new ConexionBaseDatos();
            Connection conex = conbd.conectar();
            
            String query = "INSERT INTO especialidad (ID_ESPECIALIDAD,DESC_ESPECIALIDAD) VALUES (?,?)";
            PreparedStatement stmt = conex.prepareStatement(query);
            
            stmt.setInt(1, especialidad.getIdEspecialidad());
            stmt.setString(2, especialidad.getDescEspecialidad());
            
            stmt.executeUpdate();
            stmt.close();
            conex.close();
            
            return true;
            
                       
            
        } catch (SQLException e) {
            System.out.println("Error en SQL al registrar Especialidad");
            return false;
        }
        catch (Exception e){
            System.out.println("Error en el método registrar Especialidad");
            return false;
        }
    }
    
    

}

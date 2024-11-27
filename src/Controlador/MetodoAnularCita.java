
package Controlador;

import BaseDatos.ConexionBaseDatos;
import Modelo.Cita;
import Modelo.Horario;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author orellana
 */
public class MetodoAnularCita {

    
    public List<Cita> obtenerCitasPorRut(String rutUsuario) {
        List<Cita> citas = new ArrayList<>();
        String sql = "SELECT * FROM CITA WHERE NUMRUT_USUARIO = ?";

        try (Connection con = ConexionBaseDatos.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, rutUsuario);  
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Cita cita = new Cita();
                    cita.setIdCita(rs.getInt("ID_CITA"));
                    cita.setNumRutUsuario(rs.getString("NUMRUT_USUARIO"));  
                    cita.setFechaCita(rs.getString("FECHA_CITA")); 
                    cita.setHoraCita(rs.getString("HORA_CITA"));  
                    cita.setNumRutMedico(rs.getString("NUMRUT_MEDICO"));  
                    citas.add(cita);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citas;
    }

    public void anularCita(int idCita, String hora, int dia, int mes, int ano, String rut) {
        String sql = "DELETE FROM CITA WHERE ID_CITA = ?";  

        try (Connection con = ConexionBaseDatos.conectar(); 
            PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCita);  

            int rowsAffected = ps.executeUpdate(); 

            if (rowsAffected > 0) {
                System.out.println("Cita anulada con éxito.");
            } else {
                System.out.println("No se pudo anular la cita.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        String sql2 = "DELETE FROM HORARIO WHERE HORA = ? AND NUMRUT_MEDICO = ? AND DIA_HORARIO = ? AND MES_HORARIO = ? AND ANO_HORARIO = ?";
        
        try (Connection con = ConexionBaseDatos.conectar();
                PreparedStatement ps1 = con.prepareStatement(sql))
        {
            ps1.setString(1, hora);
            ps1.setString(2, rut);
            ps1.setInt(3, dia);
            ps1.setInt(4, mes);
            ps1.setInt(5, ano);
            
            ps1.executeUpdate();
            System.out.println("Horario eliminado");
            
        } catch (Exception e) {
            
        }

    }

    public ArrayList<Horario> obtenerHorariosDisponibles() {
        ArrayList<Horario> horariosDisponibles = new ArrayList<>();
        String sql = "SELECT * FROM HORARIO WHERE ESTADO = 'Disponible'";

        try (Connection con = ConexionBaseDatos.conectar(); Statement stmt = con.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Horario horario = new Horario();
                horario.setNumRut(rs.getString("NUMRUT_MEDICO"));
                horario.setDia(rs.getInt("DIA"));
                horario.setMes(rs.getInt("MES"));
                horario.setAno(rs.getInt("ANO"));
                horario.setHora(rs.getString("HORA"));
                horario.setEstado(rs.getString("ESTADO"));
                horariosDisponibles.add(horario);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return horariosDisponibles;
    }
    public void establerEstado(String rut, int dia, int mes, int ano, String hora) {
    String sql = "UPDATE HORARIO SET ESTADO = 1 WHERE NUMRUT_MEDICO = ? AND DIA_HORARIO = ? AND MES_HORARIO = ? AND ANO_HORARIO = ? AND HORA = ?";  

    try (Connection con = ConexionBaseDatos.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, rut);  
        ps.setInt(2, dia);
        ps.setInt(3, mes);
        ps.setInt(4, ano);
        ps.setString(5, hora);

        int rowsAffected = ps.executeUpdate();  

        if (rowsAffected > 0) {
            System.out.println("Estado disponible");
        } else {
            System.out.println("Error al establer estado en disponible");
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }
}
 
    }

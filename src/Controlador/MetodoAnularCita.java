/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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

    // Método para obtener las citas de un usuario por su RUT
    public List<Cita> obtenerCitasPorRut(String rutUsuario) {
        List<Cita> citas = new ArrayList<>();
        String sql = "SELECT * FROM CITA WHERE NUMRUT_USUARIO = ?";

        try (Connection con = ConexionBaseDatos.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, rutUsuario);  // Asignamos el rutUsuario al PreparedStatement
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Cita cita = new Cita();
                    cita.setIdCita(rs.getInt("ID_CITA"));
                    cita.setNumRutUsuario(rs.getString("NUMRUT_USUARIO"));  // Utilizamos numRutUsuario
                    cita.setFechaCita(rs.getString("FECHA_CITA"));  // Usamos String para la fecha
                    cita.setHoraCita(rs.getString("HORA_CITA"));  // Usamos String para la hora
                    cita.setNumRutMedico(rs.getString("NUMRUT_MEDICO"));  // Utilizamos numRutMedico
                    citas.add(cita);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return citas;
    }

    public void anularCita(int idCita) {
        String sql = "DELETE FROM CITA WHERE ID_CITA = ?";  // SQL para eliminar la cita

        try (Connection con = ConexionBaseDatos.conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idCita);  // Establecer el ID de la cita que se va a eliminar

            int rowsAffected = ps.executeUpdate();  // Ejecuta la consulta

            if (rowsAffected > 0) {
                System.out.println("Cita anulada con éxito.");
            } else {
                System.out.println("No se pudo anular la cita.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    // Método para obtener los horarios disponibles de la base de datos
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
    String sql = "UPDATE HORARIO SET ESTADO = 1 WHERE NUMRUT_MEDICO = ? AND DIA_HORARIO = ? AND MES_HORARIO = ? AND ANO_HORARIO = ? AND HORA = ?";  // SQL para eliminar la cita

    try (Connection con = ConexionBaseDatos.conectar();
         PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, rut);  // Establecer el ID de la cita que se va a eliminar
        ps.setInt(2, dia);
        ps.setInt(3, mes);
        ps.setInt(4, ano);
        ps.setString(5, hora);

        int rowsAffected = ps.executeUpdate();  // Ejecuta la consulta

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

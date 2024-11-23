/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import BaseDatos.ConexionBaseDatos;
import Modelo.Cita;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
/**
 *
 * @author orellana
 */
public class MetodoAnularCita {
    
    public ArrayList<Cita> obtenerCitasPorRut(String rutUsuario) {
        ArrayList<Cita> citas = new ArrayList<>();
        String sql = "SELECT ID_CITA, NUMRUT_USUARIO, FECHA_CITA, HORA_CITA, NUMRUT_MEDICO, MOTIVO FROM CITA WHERE NUMRUT_USUARIO = ?";

        try (Connection conn = ConexionBaseDatos.conectar();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, rutUsuario);

            try (ResultSet rs = pstmt.executeQuery()) {
                while (rs.next()) {
                    int idCita = rs.getInt("ID_CITA");
                    String numRutUsuario = rs.getString("NUMRUT_USUARIO");
                    String numRutMedico = rs.getString("NUMRUT_MEDICO");
                    Date fechaCita = rs.getDate("FECHA_CITA");
                    Time horaCita = rs.getTime("HORA_CITA");
                    String motivo = rs.getString("MOTIVO");

                    Cita cita = new Cita(idCita, numRutUsuario, numRutMedico, fechaCita, horaCita, motivo);
                    citas.add(cita);
                }
            }
        } catch (SQLException e) {
            System.out.println("Error en SQL al obtener citas: " + e.getMessage());
        }

        return citas;
    }
    
}

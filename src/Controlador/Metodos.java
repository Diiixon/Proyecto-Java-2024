package Controlador;

import BaseDatos.ConexionBaseDatos;
//import Modelo.Cita;
import Modelo.Usuario;
import Modelo.Medico;
import Modelo.Especialidad;
import Modelo.Horario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Metodos {

    public boolean registrarUsuario(Usuario usuario) {
        try {
            Connection conex = ConexionBaseDatos.conectar();

            String query = "INSERT INTO USUARIO (DIA_NAC_USUARIO,MES_NAC_USUARIO,ANO_NAC_USUARIO,NUMRUT_USUARIO,NOMBRE_USUARIO,CORREO_USUARIO,TELEFONO_USUARIO) VALUES (?,?,?,?,?,?,?)";
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
            System.out.println("Error en SQL al registrar Usuario " + e.getMessage());

            return false;
        } catch (Exception e) {
            System.out.println("Error en el método registrar Usuario " + e.getMessage());
            return false;
        }
    }

    public boolean registrarMedico(Medico medico) {

        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "INSERT INTO MEDICO(DESC_ESPECIALIDAD,NUMRUT_MEDICO,NOMBRE_MEDICO,CORREO_MEDICO,TELEFONO_MEDICO) VALUES (?,?,?,?,?)";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, medico.getDescEspecialidad());
            stmt.setString(2, medico.getNumRut());
            stmt.setString(3, medico.getNombre());
            stmt.setString(4, medico.getCorreo());
            stmt.setInt(5, medico.getNumTelefono());

            stmt.executeUpdate();
            stmt.close();
            conex.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al registrar Médico");
            return false;
        } catch (Exception e) {
            System.out.println("Error en el método registrar Médico");
            return false;
        }

    }

    public ArrayList<Medico> mostrarMedicos() {
        ArrayList<Medico> lista = new ArrayList<>();

        try {

            Connection conex = ConexionBaseDatos.conectar();

//            String query = """
//                           SELECT 
//                               m.NUMRUT_MEDICO AS RutMedico,
//                               m.NOMBRE_MEDICO AS NombreMedico,
//                               m.CORREO_MEDICO AS CorreoMedico,
//                               m.TELEFONO_MEDICO AS TelefonoMedico,
//                               e.DESC_ESPECIALIDAD AS Especialidad
//                           FROM 
//                               MEDICO m
//                           INNER JOIN 
//                               ESPECIALIDAD e 
//                           ON 
//                               m.DESC_ESPECIALIDAD = e.ID_ESPECIALIDAD
//                           ORDER BY 
//                               e.DESC_ESPECIALIDAD;
//                           """;
            String query = "SELECT * FROM MEDICO ORDER BY numrut_medico";
            PreparedStatement stmt = conex.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Medico medico = new Medico();
                medico.setDescEspecialidad(rs.getString("DESC_ESPECIALIDAD"));
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
            System.out.println("Error en SQL al mostrar Medicos " + e.getMessage());
        }
        return lista;

    }

    public boolean registrarEspecialidad(Especialidad especialidad) {
        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "INSERT INTO ESPECIALIDAD (ID_ESPECIALIDAD,DESC_ESPECIALIDAD) VALUES (?,?)";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, especialidad.getIdEspecialidad());
            stmt.setString(2, especialidad.getDescEspecialidad());

            stmt.executeUpdate();
            stmt.close();
            conex.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al registrar Especialidad");
            return false;
        } catch (Exception e) {
            System.out.println("Error en el método registrar Especialidad");
            return false;
        }
    }

    public ArrayList<Usuario> mostrarUsuarios() {
        ArrayList<Usuario> lista = new ArrayList<>();

        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "SELECT * FROM USUARIO ORDER BY numrut_usuario";
            PreparedStatement stmt = conex.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setDia(rs.getInt("DIA_NAC_USUARIO"));
                usuario.setMes(rs.getInt("MES_NAC_USUARIO"));
                usuario.setAno(rs.getInt("ANO_NAC_USUARIO"));
                usuario.setNumRut(rs.getString("NUMRUT_USUARIO"));
                usuario.setNombre(rs.getString("NOMBRE_USUARIO"));
                usuario.setCorreo(rs.getString("CORREO_USUARIO"));
                usuario.setNumTelefono(rs.getInt("TELEFONO_USUARIO"));

                lista.add(usuario);
            }

            rs.close();
            stmt.close();
            conex.close();

        } catch (SQLException e) {
            System.out.println("Error en SQL al mostrar Usuarios " + e.getMessage());
        }
        return lista;

    }

    public ArrayList<Especialidad> mostrarEspecialidad() {
        ArrayList<Especialidad> lista = new ArrayList<>();

        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "SELECT * FROM ESPECIALIDAD ORDER BY id_especialidad";
            PreparedStatement stmt = conex.prepareStatement(query);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Especialidad especialidad = new Especialidad();
                especialidad.setIdEspecialidad(rs.getString("ID_ESPECIALIDAD"));
                especialidad.setDescEspecialidad(rs.getString("DESC_ESPECIALIDAD"));

                lista.add(especialidad);
            }

            rs.close();
            stmt.close();
            conex.close();

        } catch (SQLException e) {
            System.out.println("Error en SQL al mostrar Especialidades " + e.getMessage());
        }
        return lista;

    }

    public boolean eliminarUsuario(String rut) {
        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "DELETE FROM USUARIO WHERE numrut_usuario = ?";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, rut);

            stmt.executeUpdate();
            stmt.close();
            conex.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al eliminar Usuario" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error en el método eliminar Usuario" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarMedico(String rut) {
        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "DELETE FROM MEDICO WHERE numrut_medico = ?";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, rut);

            stmt.executeUpdate();
            stmt.close();
            conex.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al eliminar Medico" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error en el método eliminar Medico" + e.getMessage());
            return false;
        }
    }

    public boolean eliminarEspecialidad(int idEsp) {
        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "DELETE FROM ESPECIALIDAD WHERE id_especialidad = ?";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setInt(1, idEsp);

            stmt.executeUpdate();
            stmt.close();
            conex.close();

            return true;
        } catch (SQLException e) {
            System.out.println("Error en SQL al eliminar Especialidad" + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Error en el método eliminar Especialidad" + e.getMessage());
            return false;
        }
    }

    public Usuario buscarUsuario(String rut) {

        Usuario usuario = null;
        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "SELECT * FROM USUARIO WHERE numrut_usuario = ?";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, rut);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setDia(rs.getInt("DIA_NAC_USUARIO"));
                usuario.setMes(rs.getInt("MES_NAC_USUARIO"));
                usuario.setAno(rs.getInt("ANO_NAC_USUARIO"));
                usuario.setNumRut(rs.getString("NUMRUT_USUARIO"));
                usuario.setNombre(rs.getString("NOMBRE_USUARIO"));
                usuario.setCorreo(rs.getString("CORREO_USUARIO"));
                usuario.setNumTelefono(rs.getInt("TELEFONO_USUARIO"));

            }
            rs.close();
            stmt.close();
            conex.close();

        } catch (SQLException e) {
            System.out.println("Error en SQL al buscar Usuario");

        }
        return usuario;
    }

    public ArrayList<Medico> buscarMedico(String rut) {
        ArrayList<Medico> lista = new ArrayList<>();
        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "SELECT * FROM MEDICO WHERE numrut_medico = ?";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, rut);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Medico medico = new Medico();
                medico.setNumRut(rs.getString("NUMRUT_MEDICO"));
                medico.setNombre(rs.getString("NOMBRE_MEDICO"));
                medico.setCorreo(rs.getString("CORREO_MEDICO"));
                medico.setNumTelefono(rs.getInt("TELEFONO_MEDICO"));
                medico.setDescEspecialidad(rs.getString("DESC_ESPECIALIDAD"));

                lista.add(medico);

            }
            rs.close();
            stmt.close();
            conex.close();

        } catch (SQLException e) {
            System.out.println("Error en SQL al buscar Usuario");

        }
        return lista;
    }

    public ArrayList<Especialidad> buscarEspecialidad(String id) {
        ArrayList<Especialidad> lista = new ArrayList<>();
        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "SELECT * FROM ESPECIALIDAD WHERE ID_ESPECIALIDAD = ?";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                Especialidad especialidad = new Especialidad();

                especialidad.setIdEspecialidad(rs.getString("ID_ESPECIALIDAD"));
                especialidad.setDescEspecialidad(rs.getString("DESC_ESPECIALIDAD"));

                lista.add(especialidad);

            }
            rs.close();
            stmt.close();
            conex.close();

        } catch (SQLException e) {
            System.out.println("Error en SQL al buscar Usuario");

        }
        return lista;
    }

    public void RellenarCombo(String tabla, String valor, JComboBox combo) {

        String sql = "select * from " + tabla;
        Statement st;
        Connection conex = ConexionBaseDatos.conectar();

        try {
            st = conex.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                combo.addItem(rs.getString(valor));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.toString());
        }

    }

    public String ObtenerID(String desc) {

        String idEspecialidad = null;

        try {

            Connection conex = ConexionBaseDatos.conectar();
            String sql = "select ID_ESPECIALIDAD from ESPECIALIDAD where DESC_ESPECIALIDAD = ? ";
            PreparedStatement stmt = conex.prepareStatement(sql);
            stmt.setString(1, desc);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                idEspecialidad = rs.getString("ID_ESPECIALIDAD");
            }
            rs.close();
            stmt.close();
            conex.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return idEspecialidad;
    }

    public ArrayList<Horario> obtenerHorarios() {
        ArrayList<Horario> Horarios = new ArrayList<>();
        try {
            Connection conex = ConexionBaseDatos.conectar();

            String sql = "SELECT DIA_HORARIO, MES_HORARIO, ANO_HORARIO, HORA, NUMRUT_MEDICO, ESTADO FROM HORARIO;";
            PreparedStatement stmt = conex.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Horario horario = new Horario();
                horario.setDia(rs.getInt("DIA_HORARIO"));
                horario.setMes(rs.getInt("MES_HORARIO"));
                horario.setAno(rs.getInt("ANO_HORARIO"));
                horario.setHora(rs.getString("HORA"));
                horario.setNumRut(rs.getString("NUMRUT_MEDICO"));
                horario.setEstado(rs.getString("ESTADO"));

                Horarios.add(horario);

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return Horarios;
    }

    public boolean actualizarUsuario(Usuario usuario) {
        try {
            Connection conex = ConexionBaseDatos.conectar();

            String query = "UPDATE USUARIO set DIA_NAC_USUARIO = ?, MES_NAC_USUARIO = ?,ANO_NAC_USUARIO = ?,NOMBRE_USUARIO = ?,CORREO_USUARIO = ?,TELEFONO_USUARIO = ? where NUMRUT_USUARIO = ?";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setInt(1, usuario.getDia());
            stmt.setInt(2, usuario.getMes());
            stmt.setInt(3, usuario.getAno());
            stmt.setString(4, usuario.getNombre());
            stmt.setString(5, usuario.getCorreo());
            stmt.setInt(6, usuario.getNumTelefono());
            stmt.setString(7, usuario.getNumRut());

            stmt.executeUpdate();
            stmt.close();
            conex.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al actualizar Usuario " + e.getMessage());

            return false;
        } catch (Exception e) {
            System.out.println("Error en el método actualizar Usuario " + e.getMessage());
            return false;
        }
    }

    public Medico BuscarMedicoPorRut(ArrayList lista, String numrut) {

        ArrayList<Medico> listaBuscar = lista;

        for (Medico medico : listaBuscar) {
            if (medico.getNumRut().equals(numrut)) {
                return medico;
            }

        }
        return null;
    }

    public void ReservarHora(String RUT) {

        try {
            Connection conex = ConexionBaseDatos.conectar();

            String query = "UPDATE HORARIO SET ESTADO = 0 WHERE NUMRUT_MEDICO = ?";

            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, RUT);
            stmt.executeUpdate();
            stmt.close();
            conex.close();

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }

    }

    public void AgregarCita(String Fecha, String rut_doc, String rut_usu, String hora) {

        try {

            Connection conex = ConexionBaseDatos.conectar();

            String query = "INSERT INTO CITA (FECHA_CITA, NUMRUT_USUARIO, NUMRUT_MEDICO, HORA_CITA) VALUES (?,?,?,?)";

            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setString(1, Fecha);
            stmt.setString(2, rut_usu);
            stmt.setString(3, rut_doc);
            stmt.setString(4, hora);

            stmt.executeUpdate();
            stmt.close();
            conex.close();

        } catch (SQLException e) {
            System.out.println("Error Al agregar Cita " + e.getMessage());
        }

    }

    public boolean agregarHoras(Horario horario) {

        try {
            Connection conex = ConexionBaseDatos.conectar();

            String query = "INSERT INTO HORARIO (DIA_HORARIO,MES_HORARIO,ANO_HORARIO,HORA,NUMRUT_MEDICO,ESTADO) VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = conex.prepareStatement(query);

            stmt.setInt(1, horario.getDia());
            stmt.setInt(2, horario.getMes());
            stmt.setInt(3, horario.getAno());
            stmt.setString(4, horario.getHora());
            stmt.setString(5, horario.getNumRut());
            stmt.setString(6, horario.getEstado());

            stmt.executeUpdate();
            stmt.close();
            conex.close();

            return true;

        } catch (SQLException e) {
            System.out.println("Error en SQL al ingresar un Horario " + e.getMessage());

            return false;
        } catch (Exception e) {
            System.out.println("Error en el método ingresar un Horario " + e.getMessage());
            return false;
        }
    }

    public String obtenerRutMedico(String nombre) {
        String rutMedico = null;

        String sql = "SELECT NUMRUT_MEDICO FROM MEDICO WHERE NOMBRE_MEDICO = ?";

        try (Connection conex = ConexionBaseDatos.conectar(); PreparedStatement stmt = conex.prepareStatement(sql)) {

            stmt.setString(1, nombre);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    rutMedico = rs.getString("NUMRUT_MEDICO");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rutMedico;
    }

}

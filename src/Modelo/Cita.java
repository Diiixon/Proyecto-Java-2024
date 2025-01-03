package Modelo;


import java.sql.Time;
import java.sql.Date;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Cita {
    
    private int idCita;
    private String numRutUsuario;
    private String numRutMedico;
    private String fechaCita;
    private String horaCita;
    private Horario horario;
    
    

    public Cita() {
    }

    public Cita(int idCita, String numRutUsuario, String numRutMedico, String fechaCita, String horaCita, Horario horario) {
        this.idCita = idCita;
        this.numRutUsuario = numRutUsuario;
        this.numRutMedico = numRutMedico;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.horario = horario;
    }

    

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getNumRutUsuario() {
        return numRutUsuario;
    }

    public void setNumRutUsuario(String numRutUsuario) {
        this.numRutUsuario = numRutUsuario;
    }

    public String getNumRutMedico() {
        return numRutMedico;
    }

    public void setNumRutMedico(String numRutMedico) {
        this.numRutMedico = numRutMedico;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(String horaCita) {
        this.horaCita = horaCita;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
    
    

    @Override
    public String toString() {
        return "Cita{" + "idCita=" + idCita + ", numRutUsuario=" + numRutUsuario + ", numRutMedico=" + numRutMedico + ", fechaCita=" + fechaCita + ", horaCita=" + horaCita + '}';
    }


}


    
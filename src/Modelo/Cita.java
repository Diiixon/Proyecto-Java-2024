package Modelo;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Cita {
    
    private int idCita;
    private String numRutUsuario;
    private String numRutMedico;
    private Date fechaCita;
    private LocalTime horaCita;
    private String motivo; //motivo de la consulta

    public Cita() {
    }

    public Cita(int idCita, String numRutUsuario, String numRutMedico, Date fechaCita, LocalTime horaCita, String motivo) {
        this.idCita = idCita;
        this.numRutUsuario = numRutUsuario;
        this.numRutMedico = numRutMedico;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.motivo = motivo;
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

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }

    public LocalTime getHoraCita() {
        return horaCita;
    }

    public void setHoraCita(LocalTime horaCita) {
        this.horaCita = horaCita;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Cita" + 
                "idCita = " + idCita + 
                ", numRutUsuario = " + numRutUsuario + 
                ", numRutMedico = " + numRutMedico + 
                ", fechaCita = " + fechaCita + 
                ", horaCita = " + horaCita + 
                ", motivo = " + motivo;
    }

    
    
    

}

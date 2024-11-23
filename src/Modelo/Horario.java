package Modelo;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Horario {
    
    private String numRut;
    private Date fecha;
    private boolean estado; // false = disponible - true = reservado
    private LocalTime hora;

    public Horario() {
    }

    public Horario(String numRut, Date fecha, boolean estado, LocalTime hora) {
        this.numRut = numRut;
        this.fecha = fecha;
        this.estado = estado;
        this.hora = hora;
    }

    public String getNumRut() {
        return numRut;
    }

    public void setNumRut(String numRut) {
        this.numRut = numRut;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Horario" + 
                "numRut = " + numRut + 
                ", fecha = " + fecha + 
                ", estado = " + estado + 
                ", hora = " + hora;
    }

    
    
    

}

package Modelo;

import java.time.LocalTime;
import java.util.Date;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Horario {
    
    private String numRut;
    private int dia,mes,ano,idHorario;
    private String estado; 
    private String hora;
    
    private Medico medico;

    public Horario() {
    }

    public Horario(String numRut, int dia, int mes, int ano, int idHorario, String estado, String hora, Medico medico) {
        this.numRut = numRut;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.idHorario = idHorario;
        this.estado = estado;
        this.hora = hora;
        this.medico = medico;
    }

    

    public String getNumRut() {
        return numRut;
    }

    public void setNumRut(String numRut) {
        this.numRut = numRut;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
    }
    
    

    @Override
    public String toString() {
        return "Horario{" + "numRut=" + numRut + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", estado=" + estado + ", hora=" + hora + ", medico=" + medico + '}';
    }

    

    
    
    

   

    

    
    
    

}

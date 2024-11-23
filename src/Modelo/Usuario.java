package Modelo;

import java.util.Date;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Usuario extends Persona{
    
    private int dia,mes,ano;

    public Usuario() {
    }     

    public Usuario(int dia, int mes, int ano, String numRut, String nombre, String correo, int numTelefono) {
        super(numRut, nombre, correo, numTelefono);
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
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
    
    
    @Override
    public String toString() {
        return "Usuario" + 
                "dia = " + dia + ", mes = " + mes + ", ano = " + ano + '}';
    }

    
    
    

}

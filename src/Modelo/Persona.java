/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Modelo;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Persona {
    
    protected String numRut;
    protected String nombre;
    protected String correo;
    protected int numTelefono;

    public Persona() {
    }

    public Persona(String numRut, String nombre, String correo, int numTelefono) {
        this.numRut = numRut;
        this.nombre = nombre;
        this.correo = correo;
        this.numTelefono = numTelefono;
    }

    public String getNumRut() {
        return numRut;
    }

    public void setNumRut(String numRut) {
        this.numRut = numRut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
    }

    @Override
    public String toString() {
        return "Persona"+ 
                "numRut = " + numRut + ", "
                + "nombre = " + nombre + ", "
                + "correo = " + correo + ", "
                + "numTelefono = " + numTelefono;
    }
    
    

}

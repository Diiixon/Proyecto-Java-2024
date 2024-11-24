package Modelo;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Medico extends Persona{
    
    private String descEspecialidad;

    public Medico() {
    }

    public Medico(String descEspecialidad, String numRut, String nombre, String correo, int numTelefono) {
        super(numRut, nombre, correo, numTelefono);
        this.descEspecialidad = descEspecialidad;
    }

    public String getDescEspecialidad() {
        return descEspecialidad;
    }

    public void setDescEspecialidad(String descEspecialidad) {
        this.descEspecialidad = descEspecialidad;
    }

    @Override
    public String toString() {
        return "Medico" + "idEspecialidad = " + descEspecialidad;
    }
    
    

}

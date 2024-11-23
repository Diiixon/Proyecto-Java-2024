package Modelo;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Medico extends Persona{
    
    private int idEspecialidad;

    public Medico() {
    }

    public Medico(int idEspecialidad, String numRut, String nombre, String correo, int numTelefono) {
        super(numRut, nombre, correo, numTelefono);
        this.idEspecialidad = idEspecialidad;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    @Override
    public String toString() {
        return "Medico" + "idEspecialidad = " + idEspecialidad;
    }
    
    

}

package Modelo;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Especialidad {
    
    private int idEspecialidad;
    private String descEspecialidad;

    public Especialidad() {
    }

    public Especialidad(int idEspecialidad, String descEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.descEspecialidad = descEspecialidad;
    }

    public int getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(int idEspecialidad) {
        this.idEspecialidad = idEspecialidad;
    }

    public String getDescEspecialidad() {
        return descEspecialidad;
    }

    public void setDescEspecialidad(String descEspecialidad) {
        this.descEspecialidad = descEspecialidad;
    }

    @Override
    public String toString() {
        return "Especialidad" + 
                "idEspecialidad = " + idEspecialidad + 
                " descEspecialidad = " + descEspecialidad;
    }
    
    

}

package Modelo;

/**
 *
 * @author Dixon Tapia Aguilera
 */
public class Especialidad {
    
    private String idEspecialidad;
    private String descEspecialidad;

    public Especialidad() {
    }

    public Especialidad(String idEspecialidad, String descEspecialidad) {
        this.idEspecialidad = idEspecialidad;
        this.descEspecialidad = descEspecialidad;
    }

    public String getIdEspecialidad() {
        return idEspecialidad;
    }

    public void setIdEspecialidad(String idEspecialidad) {
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

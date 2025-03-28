public class Estudiante {
    private String nombreEstudiante;
    private int idEstudiante;
    private int edadEstudiante;

    public Estudiante(String nombreEstudiante, int idEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.edadEstudiante = edadEstudiante;
    }

    public String datosEstudiante() {
        return "Estudiante: " + nombreEstudiante + " (ID: " + idEstudiante + ") Edad: " + edadEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public int getEdadEstudiante() {
        return edadEstudiante;
    }
}


/**
 * Representa a un estudiante, con su nombre, ID y edad.
 * 
 */
public class Estudiante {
    private String nombreEstudiante;  // Nombre del estudiante
    private int idEstudiante;  // ID único del estudiante
    private int edadEstudiante;  // Edad del estudiante

    /**
     * Constructor que inicializa un estudiante con los datos proporcionados.
     * 
     * @param nombreEstudiante El nombre del estudiante
     * @param idEstudiante El ID único del estudiante
     * @param edadEstudiante La edad del estudiante
     */
    public Estudiante(String nombreEstudiante, int idEstudiante, int edadEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.idEstudiante = idEstudiante;
        this.edadEstudiante = edadEstudiante;
    }

    /**
     * Devuelve los datos del estudiante en forma de cadena, incluyendo nombre, ID y edad.
     * 
     * @return Una cadena con la información del estudiante
     */
    public String datosEstudiante() {
        return "Estudiante: " + nombreEstudiante + " (ID: " + idEstudiante + ") Edad: " + edadEstudiante;
    }

    /**
     * Obtiene el nombre del estudiante.
     * 
     * @return El nombre del estudiante
     */
    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    /**
     * Obtiene el ID del estudiante.
     * 
     * @return El ID del estudiante
     */
    public int getIdEstudiante() {
        return idEstudiante;
    }

    /**
     * Obtiene la edad del estudiante.
     * 
     * @return La edad del estudiante
     */
    public int getEdadEstudiante() {
        return edadEstudiante;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa a un ciclo educativo.
 */
public class Ciclo {
    private String nombreCiclo;
    private List<Estudiante> listaEstudiantes;

    /**
     * Constructor de la clase Ciclo.
     *
     * @param nombreCiclo Nombre del ciclo educativo
     */
    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
        this.listaEstudiantes = new ArrayList<>();
    }

    /**
     * Agrega un estudiante al ciclo.
     *
     * @param e Estudiante a agregar
     */
    public void agregarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }

    /**
     * Obtiene los datos del ciclo.
     *
     * @return Datos del ciclo como cadena
     */
    public String datosCiclo() {
        StringBuilder datos = new StringBuilder("Ciclo: " + nombreCiclo + "\nEstudiantes:\n");
        for (Estudiante e : listaEstudiantes) {
            datos.append(e.datosEstudiante()).append("\n");
        }
        return datos.toString();
    }

    public String getNombreCiclo() {
        return nombreCiclo;
    }
}

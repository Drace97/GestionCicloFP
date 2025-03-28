import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona la administración de estudiantes y ciclos educativos.
 */
public class GestionCicloFP {
    private List<Estudiante> listaEstudiantes;  // Lista de estudiantes registrados
    private List<Ciclo> listaCiclos;  // Lista de ciclos educativos disponibles

    /**
     * Constructor que inicializa las listas de estudiantes y ciclos.
     */
    public GestionCicloFP() {
        listaEstudiantes = new ArrayList<>();
        listaCiclos = new ArrayList<>();
    }

    /**
     * Agrega un nuevo estudiante a la lista de estudiantes.
     * 
     * @param nombre El nombre del estudiante
     * @param id El ID único del estudiante
     * @param edad La edad del estudiante
     */
    public void agregarEstudiante(String nombre, int id, int edad) {
        listaEstudiantes.add(new Estudiante(nombre, id, edad));
    }

    /**
     * Agrega un nuevo ciclo a la lista de ciclos.
     * 
     * @param nombreCiclo El nombre del ciclo educativo
     */
    public void agregarCiclo(String nombreCiclo) {
        listaCiclos.add(new Ciclo(nombreCiclo));
    }

    /**
     * Matricula a un estudiante en un ciclo educativo.
     * Busca al estudiante por su ID y al ciclo por su nombre, y si ambos existen, lo matricula.
     * 
     * @param idEstudiante El ID del estudiante a matricular
     * @param nombreCiclo El nombre del ciclo en el que se desea matricular al estudiante
     */
    public void matricularEstudiante(int idEstudiante, String nombreCiclo) {
        Estudiante estudiante = null;
        Ciclo ciclo = null;

        // Buscar al estudiante por ID
        for (Estudiante e : listaEstudiantes) {
            if (e.getIdEstudiante() == idEstudiante) {
                estudiante = e;
                break;
            }
        }

        // Buscar el ciclo por nombre
        for (Ciclo c : listaCiclos) {
            if (c.getNombreCiclo().equals(nombreCiclo)) {
                ciclo = c;
                break;
            }
        }

        // Si ambos, estudiante y ciclo, existen, se matricula al estudiante
        if (estudiante != null && ciclo != null) {
            ciclo.agregarEstudiante(estudiante);
        }
    }

    /**
     * Muestra los datos de todos los ciclos educativos registrados.
     */
    public void mostrarCiclos() {
        for (Ciclo ciclo : listaCiclos) {
            System.out.println(ciclo.datosCiclo());
        }
    }

    /**
     * Método principal que prueba la gestión de estudiantes y ciclos.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        gestion.agregarEstudiante("Alicia", 1, 20);
        gestion.agregarEstudiante("Roberto", 2, 22);

        gestion.agregarCiclo("DAW");
        gestion.agregarCiclo("ASIR");

        gestion.matricularEstudiante(1, "DAW");
        gestion.matricularEstudiante(2, "ASIR");

        gestion.mostrarCiclos();
    }
}

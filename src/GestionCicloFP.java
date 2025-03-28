import java.util.ArrayList;
import java.util.List;

public class GestionCicloFP {
    private List<Estudiante> listaEstudiantes;
    private List<Ciclo> listaCiclos;

    public GestionCicloFP() {
        listaEstudiantes = new ArrayList<>();
        listaCiclos = new ArrayList<>();
    }

    public void agregarEstudiante(String nombre, int id, int edad) {
        listaEstudiantes.add(new Estudiante(nombre, id, edad));
    }

    public void agregarCiclo(String nombreCiclo) {
        listaCiclos.add(new Ciclo(nombreCiclo));
    }

    public void matricularEstudiante(int idEstudiante, String nombreCiclo) {
        Estudiante estudiante = null;
        Ciclo ciclo = null;

        for (Estudiante e : listaEstudiantes) {
            if (e.getIdEstudiante() == idEstudiante) {
                estudiante = e;
                break;
            }
        }

        for (Ciclo c : listaCiclos) {
            if (c.getNombreCiclo().equals(nombreCiclo)) {
                ciclo = c;
                break;
            }
        }

        if (estudiante != null && ciclo != null) {
            ciclo.agregarEstudiante(estudiante);
        }
    }

    public void mostrarCiclos() {
        for (Ciclo ciclo : listaCiclos) {
            System.out.println(ciclo.datosCiclo());
        }
    }

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

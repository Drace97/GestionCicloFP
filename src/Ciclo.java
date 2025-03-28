import java.util.ArrayList;
import java.util.List;

public class Ciclo {
    private String nombreCiclo;
    private List<Estudiante> listaEstudiantes;

    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = nombreCiclo;
        this.listaEstudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante e) {
        listaEstudiantes.add(e);
    }

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


package uni1a;

public class Investigador {
    private String nombre;
    private String especialidad;
    private String universidad;

    // Constructor
    public Investigador(String nombre, String especialidad, String universidad) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.universidad = universidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    // Método para mostrar detalles
    public void mostrarDetallesInvestigador() {
        System.out.println("Investigador: " + nombre + " (Especialidad: " + especialidad + ", Univ: " + universidad + ")");
    }
}
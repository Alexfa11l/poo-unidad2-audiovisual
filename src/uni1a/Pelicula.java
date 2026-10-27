package uni1a;

import java.util.ArrayList; // Importamos ArrayList para manejar la lista de actores

// Subclase Pelicula que extiende de ContenidoAudiovisual
public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private ArrayList<Actor> listaActores; // Relación con la clase Actor

    public Pelicula(String titulo, int duracionEnMinutos, String genero, String estudio) {
        super(titulo, duracionEnMinutos, genero);
        this.estudio = estudio;
        this.listaActores = new ArrayList<>(); // Inicializamos la lista de actores
    }

    // Método para agregar un actor a la película
    public void agregarActor(Actor actor) {
        listaActores.add(actor);
    }

    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la película:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Estudio: " + estudio);
        
        // Mostramos los actores asociados
        System.out.println("Actores:");
        for (Actor actor : listaActores) {
            System.out.print("  - ");
            actor.mostrarDetallesActor();
        }
        System.out.println();
    }
}
package uni1a;

import java.util.ArrayList; // Importamos ArrayList para manejar la lista de temporadas

// Subclase SerieDeTV que extiende de ContenidoAudiovisual
public class SerieDeTV extends ContenidoAudiovisual {
    private int temporadas;
    private ArrayList<Temporada> listaTemporadas; // Relación de composición con Temporada

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int temporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.temporadas = temporadas;
        this.listaTemporadas = new ArrayList<>(); // Inicializamos la lista de temporadas
    }

    // Método para agregar temporadas a la serie
    public void agregarTemporada(Temporada temporada) {
        listaTemporadas.add(temporada);
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie de TV:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Temporadas: " + this.temporadas);
        
        // Mostrar la lista detallada de temporadas
        System.out.println("Lista de Temporadas:");
        for (Temporada t : listaTemporadas) {
            System.out.print("  - ");
            t.mostrarDetallesTemporada();
        }
        System.out.println();
    }
}
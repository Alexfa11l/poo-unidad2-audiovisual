package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String nombreHost;
    private int numeroEpisodio;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String nombreHost, int numeroEpisodio) {
        super(titulo, duracionEnMinutos, genero);
        this.nombreHost = nombreHost;
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getNombreHost() {
        return nombreHost;
    }

    public void setNombreHost(String nombreHost) {
        this.nombreHost = nombreHost;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del podcast:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Host / Conductor: " + this.nombreHost);
        System.out.println("Número de Episodio: " + this.numeroEpisodio);
        System.out.println();
    }
}
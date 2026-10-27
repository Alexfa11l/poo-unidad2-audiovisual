package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
    private String director;
    private String festivalPremio;

    public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director, String festivalPremio) {
        super(titulo, duracionEnMinutos, genero);
        this.director = director;
        this.festivalPremio = festivalPremio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getFestivalPremio() {
        return festivalPremio;
    }

    public void setFestivalPremio(String festivalPremio) {
        this.festivalPremio = festivalPremio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles del cortometraje:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Director: " + this.director);
        System.out.println("Festival o Premio: " + this.festivalPremio);
        System.out.println();
    }
}
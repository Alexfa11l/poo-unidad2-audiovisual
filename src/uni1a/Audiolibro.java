package uni1a;

public class Audiolibro extends ContenidoAudiovisual {
    private String narrador;
    private int duracionMinutos;

    // Constructor oficial con los 5 parámetros
    public Audiolibro(String titulo, int anio, String genero, String narrador, int duracionMinutos) {
        super(titulo, anio, genero);
        this.narrador = narrador;
        this.duracionMinutos = duracionMinutos;
    }

    public String getNarrador() {
        return narrador;
    }

    public void setNarrador(String narrador) {
        this.narrador = narrador;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public void mostrarDetalles() {
        // Usamos solo métodos seguros de la clase padre y evitamos getAnio()
        System.out.println("Audiolibro: " + getTitulo() + " | Género: " + getGenero() + " | Narrado por: " + narrador + " | Duración: " + duracionMinutos + " min");
    }
}
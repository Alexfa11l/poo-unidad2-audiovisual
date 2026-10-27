package poo;

import uni1a.*; // Importamos todas las clases del paquete uni1a

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println("Hello from Eclipse!");

        // Crear instancias de las subclases (Polimorfismo) ampliado a 5 elementos
        ContenidoAudiovisual[] contenidos = new ContenidoAudiovisual[5];

        // 1. Película con actores asociados (Asociación / Agregación)
        Pelicula peli = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        peli.agregarActor(new Actor("Sam Worthington", 48, "Australiana"));
        peli.agregarActor(new Actor("Zoe Saldana", 46, "Estadounidense"));
        contenidos[0] = peli;

        // 2. Serie de TV con temporadas asociadas (Composición)
        SerieDeTV serie = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        serie.agregarTemporada(new Temporada(1, 10));
        serie.agregarTemporada(new Temporada(2, 10));
        contenidos[1] = serie;

        // 3. Documental con investigador asociado (Asociación)
        Investigador inv = new Investigador("Carl Sagan", "Astronomía y Astrofísica", "Universidad de Cornell");
        Documental doc = new Documental("Cosmos", 45, "Science", "Astronomy", inv);
        contenidos[2] = doc;

        // 4. Audiolibro (Nuestra subclase propia en lugar de cortometraje)
        Audiolibro audio = new Audiolibro("El Principito", 2023, "Literatura", "Juan Pérez", 120);
        contenidos[3] = audio;

        // 5. Podcast (Nueva subclase propia - Etapa 4)
        Podcast pod = new Podcast("Tecnología al Día", 30, "Tecnología", "Ana Gómez", 45);
        contenidos[4] = pod;

        // Mostrar los detalles de cada contenido audiovisual
        for (ContenidoAudiovisual contenido : contenidos) {
            contenido.mostrarDetalles();
        }
    }
}
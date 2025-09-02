// Classe que representa uma música dentro da playlist
public class Musica {
    // atributos (características de uma música)
    private String titulo;
    private String artista;
    private double duracaoMin; // duração em minutos (ex: 3.5 = 3 minutos e 30 segundos)

    // construtor (usado para criar uma música nova já com os dados)
    public Musica(String titulo, String artista, double duracaoMin) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoMin = duracaoMin;
    }

    // métodos getters (usados para acessar os dados da música)
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public double getDuracaoMin() {
        return duracaoMin;
    }

    // método toString (mostra a música em um formato bonitinho)
    @Override
    public String toString() {
        int minutos = (int) duracaoMin; // parte inteira são os minutos
        int segundos = (int) Math.round((duracaoMin - minutos) * 60); // resto convertido em segundos
        return titulo + " - " + artista + " (" + String.format("%02d:%02d", minutos, segundos) + ")";
    }
}

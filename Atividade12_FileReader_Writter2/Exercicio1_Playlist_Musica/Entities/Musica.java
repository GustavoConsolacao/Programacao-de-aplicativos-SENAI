package Atividade12_FileReader_Writter2.Exercicio1_Playlist_Musica.Entities;

public class Musica {
private String titulo;
private String artista;
private int anoLancamento;
    public Musica() {
    }
public Musica (String titulo, String artista, int anoLancamento) {
    this.anoLancamento = anoLancamento;
    this.artista = artista;
    this.titulo = titulo;
}

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public String getArtista() {
        return artista;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
    return "Título: " + titulo + " | Artista: " + artista + " | Ano: " + anoLancamento;
    }
}

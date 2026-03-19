package lista1;

public class musica {
    
    private String titulo;
    private String artista;
    private int duracao;
    
    public musica(String titulo, String artista, int duracao) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
    }

    public String getDuracaoFormatada() {
        int minutos = duracao / 60;
        int segundos = duracao % 60;
        
        return String.format("%02d:%02d", minutos, segundos);
    }
    
}
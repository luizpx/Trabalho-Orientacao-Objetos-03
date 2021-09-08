import java.util.ArrayList;
import java.util.List;

public class Artista {

    private String nome;
    private List<Musicas> musicasList;

    public Artista(String nome) {
        this.nome = nome;
        this.musicasList = new ArrayList<Musicas>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarMusica(Musicas musicas) {
        if(!this.musicasList.contains(musicas)) {
            this.musicasList.add(musicas);
        }
        musicas.adicionarMusicaArtista(this);
    }

    public  void excluirMusica(Musicas musicas) {
        this.musicasList.remove(musicas);
        musicas.excluirMusicaArtista();
    }

    public boolean verificarMusicaArtista(Musicas musicas) {
        return this.musicasList.contains(musicas);
    }

}

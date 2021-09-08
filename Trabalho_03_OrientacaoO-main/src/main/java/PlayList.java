import java.util.ArrayList;
import java.util.List;

public class PlayList {
    private String nome;
    private static List<Musicas> musicas;

    public PlayList(String nome) {
        this.nome = nome;
        this.musicas = new ArrayList<Musicas>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Musicas> getMusica() {
        return musicas;
    }

    public void setMusica(List<Musicas> musicas) {
        this.musicas = musicas;
    }

    public void adicionarMusica(Musicas musica) {
        if (musica == null) {
            throw new NullPointerException("Musica deve ser informada");
        }
        if (!this.musicas.contains(musica)) {
            this.musicas.add(musica);
        }
        if (!musica.verificarPlayList(this)) {
            musica.adicionarPlayList(this);
        }
    }

    public void apagarMusica(Musicas musica) {
        if (musica == null) {
            throw new NullPointerException("Musica deve ser informada");
        }
        if (this.musicas.contains(musica)) {
            this.musicas.remove(musica);
        }
        if (musica.verificarPlayList(this)) {
            musica.apagarPlayList(this);
        }
    }

    public boolean verificarMusica(Musicas musica) {
        return this.musicas.contains(musica);
    }

    public static int getQuantidadeMusicas(){
        return musicas.size();
    }
}

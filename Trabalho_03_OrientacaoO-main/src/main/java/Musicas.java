import java.util.ArrayList;
import java.util.List;

public class Musicas {
    private String nome;
    private String cantor;
    private Artista artista;
    private List<PlayList> playlist;

    public Musicas(String nome, String cantor) {
        this.nome = nome;
        this.cantor = cantor;
        this.playlist = new ArrayList<PlayList>();
    }

    public Musicas(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Artista getArtista() {
        if(artista == null){
            throw new NullPointerException("Musica sem artista");
        }
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }


    public String getCantor() {
        return cantor;
    }

    public void setCantor(String cantor) {
        this.cantor = cantor;
    }

        public List<PlayList> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<PlayList> playlist) {
        this.playlist = playlist;
    }

    public void adicionarPlayList(PlayList playListNova){
        if(playListNova == null){
            throw new NullPointerException("PlayList deve ser informada");
        }
        if (!this.playlist.contains(playListNova)) {
            this.playlist.add(playListNova);
        }
        if (!playListNova.verificarMusica(this)) {
            playListNova.adicionarMusica(this);
        }
    }

    public void apagarPlayList(PlayList playListNova) {
        if (playListNova == null) {
            throw new NullPointerException("PlayList deve ser informada");
        }
        if (this.playlist.contains(playListNova)) {
            this.playlist.remove(playListNova);
        }
        if (playListNova.verificarMusica(this)) {
            playListNova.apagarMusica(this);
        }
    }

    public void adicionarMusicaArtista(Artista artista) {
        if(this.artista != artista) {
            if (this.artista != null) {
                this.artista.excluirMusica(this);
            }
            this.artista = artista;
            if(this.artista != null) {
                this.artista.adicionarMusica(this);
            }
        }
    }

    public void excluirMusicaArtista(){
        this.artista = null;
    }

    public String getNomeArtista(){
        if(this.artista == null) {
            return "Musica sem artista!";
        }
        return this.artista.getNome();
    }

    public boolean verificarPlayList(PlayList playListNova) {
        return this.playlist.contains(playListNova);
    }



}

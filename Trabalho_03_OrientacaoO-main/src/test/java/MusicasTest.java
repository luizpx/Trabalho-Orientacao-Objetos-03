import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicasTest {

    @Test
    void deveAdicionarMusica() {
        Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
        PlayList playList = new PlayList("Classicas");

        musicas.adicionarPlayList(playList);

        assertTrue(musicas.verificarPlayList(playList));
        assertTrue(playList.verificarMusica(musicas));
    }

    @Test
    void deveApagarMusica() {
        Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
        PlayList playList = new PlayList("Classicas");

        musicas.adicionarPlayList(playList);
        musicas.apagarPlayList(playList);

        assertFalse(musicas.verificarPlayList(playList));
        assertFalse(playList.verificarMusica(musicas));
    }

    @Test
    void deveRetornarExcecaoAdicionarPlayListNula() {
        try {
            Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
            musicas.adicionarPlayList(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("PlayList deve ser informada", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoApagarPlayListNula() {
        try {
            Musicas musicas = new Musicas("Esse cara sou eu","Roberto Carlos");
            musicas.apagarPlayList(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("PlayList deve ser informada", e.getMessage());
        }
    }

    @Test
    void deveAdicionarMusicaArtista() {
        Musicas musicas = new Musicas ("Alive");
        Artista artista = new Artista ("Alok");
        musicas.adicionarMusicaArtista(artista);

        assertEquals("Alok", musicas.getNomeArtista());
        assertTrue(artista.verificarMusicaArtista(musicas));
    }

    @Test
    void deveTransferirMusica() {
        Musicas musicas = new Musicas ("Alive");
        Artista artista1 = new Artista ("Alok");
        musicas.adicionarMusicaArtista(artista1);

        Artista artista2 = new Artista("Vintage");
        musicas.adicionarMusicaArtista(artista2);

        assertEquals("Vintage", musicas.getNomeArtista());
        assertFalse(artista1.verificarMusicaArtista(musicas));
        assertTrue(artista2.verificarMusicaArtista(musicas));
    }

    @Test
    void deveVerificarMusicasSemArtista() {
        Musicas musicas = new Musicas("Alive");

        assertEquals("Musica sem artista!", musicas.getNomeArtista());
    }

    @Test
    void deveVerificarMusicaMudarParaArtsitaNulo() {
        Musicas musicas = new Musicas("Alive");
        Artista artista1 = new Artista ("Alok");
        musicas.adicionarMusicaArtista(artista1);

        musicas.adicionarMusicaArtista(null);

        assertEquals("Musica sem artista!", musicas.getNomeArtista());
        assertFalse(artista1.verificarMusicaArtista(musicas));
    }

}
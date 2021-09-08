import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArtistaTest {
    @Test
    void deveAdicionarMusica() {
        Artista artista = new Artista("Alok");
        Musicas musicas = new Musicas("Alive");

        artista.adicionarMusica(musicas);

        assertTrue(artista.verificarMusicaArtista(musicas));
        assertEquals("Alok", musicas.getNomeArtista());

    }

    @Test
    void deveAdicionarDuasMusicas() {
        Artista artista = new Artista("Alok");
        Musicas musicas = new Musicas("Alive");
        Musicas musicas1 = new Musicas("Hear Me Now");

        artista.adicionarMusica(musicas);
        artista.adicionarMusica(musicas1);

        assertTrue(artista.verificarMusicaArtista(musicas));
        assertEquals("Alok", musicas.getNomeArtista());

        assertTrue(artista.verificarMusicaArtista(musicas1));
        assertEquals("Alok", musicas1.getNomeArtista());
    }

    @Test
    void deveExcluirMusica() {
        Artista artista = new Artista("Alok");
        Musicas musicas = new Musicas("Alive");

        artista.adicionarMusica(musicas);
        artista.excluirMusica(musicas);

        assertFalse(artista.verificarMusicaArtista(musicas));
    }

}
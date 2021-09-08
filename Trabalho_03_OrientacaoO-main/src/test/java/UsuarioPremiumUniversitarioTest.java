import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioPremiumUniversitarioTest {

    UsuarioPremiumUniversitario premiumUniversitario = new UsuarioPremiumUniversitario();

    @Test
    void identificarPessoa() {
        premiumUniversitario.setEmail("abc@gmail.com");
        premiumUniversitario.setSenha("123");
        assertEquals("abc@gmail.com", premiumUniversitario.identificarPessoa());
    }

    @Test
    void calculaValorPacote() {
        premiumUniversitario.setValor(20.0f);
        assertEquals(16.0f, premiumUniversitario.calculaValorPacote());
    }

    @Test
    void calculaValorPacoteComFuncao() {
        premiumUniversitario.setValor(20.0f);
        assertEquals(14.0f, premiumUniversitario.calculaValorPacote(70));
    }

    @Test
    void deveRetornarExcecaoValorDoPacoteComSetNumDispositivos(){
        premiumUniversitario.setValor(20.0f);
        premiumUniversitario.setNumDispositivos(3);
        assertEquals(16.0, premiumUniversitario.calculaValorPacote());
    }

    @Test
    void calculaArmazenamentoEmNuvem() {
        premiumUniversitario.setValor(40.0f);
        assertEquals(3200, premiumUniversitario.armazenamentoEmNuvem(premiumUniversitario.calculaValorPacote()));
    }
}
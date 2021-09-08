import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioPremiumDuoTest {

    UsuarioPremiumDuo premiumDuo = new UsuarioPremiumDuo();

    @Test
    void identificarPessoa() {
        premiumDuo.setEmail("abc@gmail.com");
        premiumDuo.setSenha("123");
        assertEquals("abc@gmail.com", premiumDuo.identificarPessoa());
    }

    @Test
    void calculaValorPacote6telas() {
        premiumDuo.setValor(35.0f);
        premiumDuo.setNumDispositivos(6);
        assertEquals(95.0f, premiumDuo.calculaValorPacote());
    }
    @Test
    void calculaValorPacote2telas() {
        premiumDuo.setValor(35.0f);
        premiumDuo.setNumDispositivos(2);
        assertEquals(55.0f, premiumDuo.calculaValorPacote());
    }

    @Test
    void calculaArmazenamentoEmNuvem() {
        premiumDuo.setValor(35.0f);
        premiumDuo.setNumDispositivos(2);
        assertEquals(5500, premiumDuo.armazenamentoEmNuvem(premiumDuo.calculaValorPacote()));
    }


}
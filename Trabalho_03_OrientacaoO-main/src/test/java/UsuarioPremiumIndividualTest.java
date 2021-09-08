import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioPremiumIndividualTest {

    UsuarioPremiumIndividual premiumIndividual = new UsuarioPremiumIndividual();

    @Test
    void identificarPessoa() {
        premiumIndividual.setEmail("abc@gmail.com");
        premiumIndividual.setSenha("123");
        assertEquals("abc@gmail.com", premiumIndividual.identificarPessoa());
    }

    @Test
    void calculaValorPacote() {
        premiumIndividual.setValor(35.0f);
        assertEquals(35.0f, premiumIndividual.calculaValorPacote());
    }

    @Test
    void deveRetornarValorDoPacoteDosetValor(){
        premiumIndividual.setValor(29.0f);
        premiumIndividual.setNumDispositivos(3);
        assertEquals(29.0, premiumIndividual.calculaValorPacote());
    }

    @Test
    void calculaArmazenamentoEmNuvem() {
        premiumIndividual.setValor(35.0f);
        assertEquals(3500, premiumIndividual.armazenamentoEmNuvem(premiumIndividual.calculaValorPacote()));
    }

}
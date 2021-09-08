import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReceitaGeradaTest {

    UsuarioPremiumDuo premiumduo = new UsuarioPremiumDuo();
    UsuarioPremiumIndividual premiumindividual = new UsuarioPremiumIndividual();
    UsuarioPremiumUniversitario premiumuniversitario = new UsuarioPremiumUniversitario();
    List<Usuario> lista = new ArrayList<Usuario>();
    ReceitaGerada receitaGerada = new ReceitaGerada();

    @Test
    void calcularReceitaGeral() {
        premiumduo.setValor(34);
        premiumduo.setNumDispositivos(2);
        premiumindividual.setValor(36);
        premiumuniversitario.setValor(20);

        lista.add(premiumduo);
        lista.add(premiumindividual);
        lista.add(premiumuniversitario);

        assertEquals(106.0f,receitaGerada.calcularReceitaGeral(lista));
    }
}
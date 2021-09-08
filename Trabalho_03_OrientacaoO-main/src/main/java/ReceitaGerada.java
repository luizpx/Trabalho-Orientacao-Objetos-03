import java.util.List;

public class ReceitaGerada {

    public float calcularReceitaGeral(List<Usuario> usuarios){
        float receitaTotal = 0.0f;
        for(Usuario usuario : usuarios) {
            receitaTotal += usuario.calculaValorPacote();
        }
        return receitaTotal;
    }

}

public class UsuarioPremiumIndividual extends Usuario implements Armazenamento{

    public String identificarPessoa() {
        return getEmail();
    }

    public float calculaValorPacote(){
        return this.getValor();
    }

    public float armazenamentoEmNuvem(float valor) {
        return valor * 100 ;
    }
}

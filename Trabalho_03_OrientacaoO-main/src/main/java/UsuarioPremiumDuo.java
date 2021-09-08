public class UsuarioPremiumDuo extends Usuario implements Armazenamento{

    public String identificarPessoa() {
        return getEmail();
    }

    public float calculaValorPacote() {
        return this.getValor() + (this.getNumDispositivos() * 10.0f);
    }

    public float armazenamentoEmNuvem(float valor) {
        return valor * 100 ;
    }
}

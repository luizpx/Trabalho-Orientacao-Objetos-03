public class UsuarioPremiumUniversitario extends Usuario implements Armazenamento{

    public String identificarPessoa() {
        return this.getEmail();
    }

    public float calculaValorPacote(){
        return this.valor*0.8f;
    }

    public float calculaValorPacote(float desconto) {
        return this.valor *  (desconto/100);
    }

    public float armazenamentoEmNuvem(float valor) {
        return valor * 100 ;
    }
}

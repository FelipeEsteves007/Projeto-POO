// Felipe Esteves de Paula
// RA: 2389576

public class Empresa {
    private String nome;
    private String localizacao;
    private String dados;

    public Empresa() {
        this.nome = "Bels";
        this.dados = """
        A Bels é uma empresa de tecnologia especializada em soluções digitais para apps e sistemas personalizados. 
        Com nossa empresa você pode ter seu próprio app, site ou sistema, tudo feito sob medida para você!""";
    }

    public String getNome() {
        return nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao; //Reflexividade
    }

    public String getDados() {
        return dados;
    }
}

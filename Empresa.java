// Felipe Esteves de Paula
// RA: 2389576

public class Empresa {
    private String nome;
    private String localizacao;
    private String dados;

    public Empresa() {
        this.dados = "A Bels é uma empresa de tecnologia especializada em soluções digitais para apps e sistemas personalizados.";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getDados() {
        return dados;
    }
}

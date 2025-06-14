// Felipe Esteves de Paula
// RA: 2389576

public class ProgramadorBackEnd extends Programador {
    private String linguagemBackEnd;
    private String bancoDeDados;

    public void setLinguagemBackEnd(String linguagemBackEnd) {
        this.linguagemBackEnd = linguagemBackEnd; //Reflexividade
    }

    public void setBancoDeDados(String bancoDeDados) {
        this.bancoDeDados = bancoDeDados; //Reflexividade
    }

    public String getLinguagemBackEnd() {
        return linguagemBackEnd;
    }

    public String getBancoDeDados() {
        return bancoDeDados;
    }

    //Sobrescrita
    @Override
    public String getTipo() {
        return "Especialista em Back-End (" + linguagemBackEnd + ", " + bancoDeDados + ")";
    }

    //Sobrescrita
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Banco de Dados: " + bancoDeDados);
    }
}

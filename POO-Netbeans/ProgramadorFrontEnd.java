// Felipe Esteves de Paula
// RA: 2389576

public class ProgramadorFrontEnd extends Programador {
    private String linguagemFrontEnd;
    private String framework;

    public void setLinguagemFrontEnd(String linguagemFrontEnd) {
        this.linguagemFrontEnd = linguagemFrontEnd; //Reflexividade
    }

    public void setFramework(String framework) {
        this.framework = framework; //Reflexividade
    }

    public String getLinguagemFrontEnd() {
        return linguagemFrontEnd;
    }

    public String getFramework() {
        return framework;
    }

    //Sobrescrita
    @Override
    public String getTipo() {
        return "Especialista em Front-End (" + linguagemFrontEnd + ", " + framework + ")";
    }

    //Sobrescrita
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Framework: " + framework);
    }
}

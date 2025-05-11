//Felipe Esteves de Paula
//RA: 2389576

// Classe filha: Front-End
class ProgramadorFrontEnd extends Programador {
    private String linguagemFrontEnd;
    private String framework;

    public ProgramadorFrontEnd() {
        super();
    }

    public void setLinguagemFrontEnd(String linguagemFrontEnd) {
        this.linguagemFrontEnd = linguagemFrontEnd;
    }

    public void setFramework(String framework) {
        this.framework = framework;
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

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Framework: " + framework);
    }
}
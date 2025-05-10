// Felipe Esteves de Paula
// RA: 2389576

// Classe filha: Front-End
class ProgramadorFrontEnd extends Programador {
    private String linguagemFrontEnd;
    private String framework;

    public ProgramadorFrontEnd() {
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
}

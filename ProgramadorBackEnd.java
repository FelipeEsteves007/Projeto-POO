//Felipe Esteves de Paula
//RA: 2389576

// Classe filha: Back-End
class ProgramadorBackEnd extends Programador {
    private String linguagemBackEnd;
    private String bancoDeDados;

    public void setLinguagemBackEnd(String linguagemBackEnd) {
        this.linguagemBackEnd = linguagemBackEnd;
    }

    public void setBancoDeDados(String bancoDeDados) {
        this.bancoDeDados = bancoDeDados;
    }

    public String getLinguagemBackEnd() {
        return linguagemBackEnd;
    }

    public String getBancoDeDados() {
        return bancoDeDados;
    }
}
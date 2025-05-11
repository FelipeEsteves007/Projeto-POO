// Felipe Esteves de Paula
// RA: 2389576

// Classe filha: Fullstack
class ProgramadorFullstack extends Programador {
    private int anosExperiencia;
    private String projetosConcluidos;

    public ProgramadorFullstack() {
        super();
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setProjetosConcluidos(String projetosConcluidos) {
        this.projetosConcluidos = projetosConcluidos;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public String getProjetosConcluidos() {
        return projetosConcluidos;
    }

    //Sobrescrita
    @Override
    public String getTipo() {
        return "Fullstack com " + anosExperiencia + " anos de experiência";
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Projetos: " + projetosConcluidos);
    }
}
// Felipe Esteves de Paula
// RA: 2389576

// Classe filha: Fullstack
class ProgramadorFullstack extends Programador {
    private int anosExperiencia;
    private String projetosConcluidos;

    public ProgramadorFullstack() {
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
}
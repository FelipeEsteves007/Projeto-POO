// Felipe Esteves de Paula
// RA: 2389576

public class ProgramadorFullstack extends Programador {
    private int anosExperiencia;
    private String projetosConcluidos;

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia; //Reflexividade
    }

    public void setProjetosConcluidos(String projetosConcluidos) {
        this.projetosConcluidos = projetosConcluidos; //Reflexividade
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

    //Sobrescrita
    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Projetos: " + projetosConcluidos);
    }
}

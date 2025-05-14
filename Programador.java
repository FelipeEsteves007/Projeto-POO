// Felipe Esteves de Paula
// RA: 2389576

// Classe mãe
public class Programador implements Exibivel {
    private String nome;
    private boolean ocupado = false;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipo() {
        return "Programador genérico";
    }

    //Sobrecarga
    public void mostrarDetalhes() {
        System.out.println("Nome: " + getNome());
    }

    //Sobrecarga
    public void mostrarDetalhes(String projeto) {
        System.out.println("Nome: " + getNome() + " | Projeto: " + projeto);
    }

    //Sobrecarga
    public void mostrarDetalhes(String projeto, int horas) {
        System.out.println("Nome: " + getNome() + " | Projeto: " + projeto + " | Horas: " + horas);
    }

    //Interface
    public void exibirDados() {
        System.out.println("Programador: " + getNome() + " | Tipo: " + getTipo() + " | Ocupado: " + (ocupado ? "Sim" : "Não"));
    }
}

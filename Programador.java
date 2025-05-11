// Felipe Esteves de Paula
// RA: 2389576

// Interface para exibição
interface Exibivel {
    void exibirDados();
}

// Classe mãe
public class Programador implements Exibivel {
    private String nome;
    private String tipo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
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
        System.out.println("Programador: " + getNome() + " | Tipo: " + getTipo());
    }
}
// Felipe Esteves de Paula
// Ra: 2389576

//Exceção
public class ProgramadorOcupadoException extends Exception {
    public ProgramadorOcupadoException(String nome) {
        super("O programador " + nome + " já está ocupado.");
    }

    public String getSugerencia() {
        return "Escolha outro programador que esteja disponível.";
    }
}

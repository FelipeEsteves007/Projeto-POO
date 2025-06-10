// Felipe Esteves de Paula
// Ra: 2389576

//Exceção
public class ProjetoVazioException extends Exception {
    public ProjetoVazioException(String mensagem){
        super(mensagem);
    }

    public String getDica(){
        return "O nome do projeto não pode estar vazio... Por favor, digite algo válido";
    }
}

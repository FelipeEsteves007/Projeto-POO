// Felipe Esteves de Paula
// RA: 2389576

public class Principal {
    public static void main(String[] args) {
        Cliente clienteUm = new Cliente("Cliente Um", "Desenvolvimento de App");
        Empresa empresa = new Empresa("Bels", "Avaré");

        
        ProgramadorBackEnd programadorUm = new ProgramadorBackEnd();
        programadorUm.setNome("Vitor");
        programadorUm.setTipo("Back-End");
        programadorUm.setLinguagemBackEnd("Java");
        programadorUm.setBancoDeDados("MySQL");

       
        System.out.println("Cliente: " + clienteUm.getNome() + ", Projeto: " + clienteUm.getProjeto());
        System.out.println("Empresa: " + empresa.getNome() + ", Localização: " + empresa.getLocalizacao());
        System.out.println("Programador: " + programadorUm.getNome() + ", Tipo: " + programadorUm.getTipo());
        System.out.println("Linguagem: " + programadorUm.getLinguagemBackEnd());
        System.out.println("Banco de Dados: " + programadorUm.getBancoDeDados());
    }
}

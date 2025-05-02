// Felipe Esteves de Paula
// RA: 2389576

public class Principal {
    public static void main(String[] args) {
        Cliente clienteUm = new Cliente("Cliente Um", "Desenvolimento de App");
        Empresa empresa = new Empresa("Bels", "Avaré");
        Programadores programadorUm = new Programadores("Vitor", "Back-End");

        System.out.println("Cliente: " + clienteUm.getNome() + ", Projeto: " + clienteUm.getProjeto());
        System.out.println("Empresa: " + empresa.getNome() + ", Localização: " + empresa.getLocalizacao());
        System.out.println("Programador: " + programadorUm.getNome() + ", Tipo: " + programadorUm.getTipo());
    }
}

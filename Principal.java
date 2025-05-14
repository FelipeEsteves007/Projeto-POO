// Felipe Esteves de Paula
// RA: 2389576

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int opcao = 0;

        Empresa empresa = new Empresa();
        empresa.setLocalizacao("Avaré");

        List<Cliente> listaClientes = new ArrayList<>();

        // Programador Back-End
        ProgramadorBackEnd prog1 = new ProgramadorBackEnd();
        prog1.setNome("Zé");
        prog1.setLinguagemBackEnd("Java");
        prog1.setBancoDeDados("MySQL");

        // Programador Front-End
        ProgramadorFrontEnd prog2 = new ProgramadorFrontEnd();
        prog2.setNome("Larissa");
        prog2.setLinguagemFrontEnd("JavaScript");
        prog2.setFramework("React");

        // Programador Fullstack
        ProgramadorFullstack prog3 = new ProgramadorFullstack();
        prog3.setNome("Felipe");
        prog3.setAnosExperiencia(4);
        prog3.setProjetosConcluidos("App Mobile + API Web");

        try {
            do {
                System.out.println("\n====== MENU ======");
                System.out.println("1 - Cadastrar Cliente/Projeto");
                System.out.println("2 - Exibir Programadores Disponíveis");
                System.out.println("3 - Exibir Dados da Empresa");
                System.out.println("4 - Exibir Clientes/Projetos");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");

                opcao = Integer.parseInt(reader.readLine());

                switch (opcao) {
                    case 1:
                        Cliente cliente = new Cliente();
                        System.out.print("Nome do Cliente: ");
                        cliente.setNome(reader.readLine());

                        System.out.print("Nome do Projeto: ");
                        cliente.setProjeto(reader.readLine());

                        System.out.println("\nEscolha um programador:");
                        System.out.println("1 - " + prog1.getNome() + " (" + prog1.getTipo() + ")");
                        System.out.println("2 - " + prog2.getNome() + " (" + prog2.getTipo() + ")");
                        System.out.println("3 - " + prog3.getNome() + " (" + prog3.getTipo() + ")");
                        System.out.print("Digite o número: ");
                        int escolha = Integer.parseInt(reader.readLine());

                        if (escolha == 1 && !prog1.isOcupado()) {
                            prog1.setOcupado(true);
                            cliente.setProgramador(prog1.getNome());
                            listaClientes.add(cliente);
                            System.out.println("Projeto atribuído a " + prog1.getNome());
                        } else if (escolha == 2 && !prog2.isOcupado()) {
                            prog2.setOcupado(true);
                            cliente.setProgramador(prog2.getNome());
                            listaClientes.add(cliente);
                            System.out.println("Projeto atribuído a " + prog2.getNome());
                        } else if (escolha == 3 && !prog3.isOcupado()) {
                            prog3.setOcupado(true);
                            cliente.setProgramador(prog3.getNome());
                            listaClientes.add(cliente);
                            System.out.println("Projeto atribuído a " + prog3.getNome());
                        } else {
                            System.out.println("Programador escolhido já está ocupado ou inválido.");
                        }
                        break;

                    case 2:
                        System.out.println("\n--- PROGRAMADORES DISPONÍVEIS ---");
                        if (!prog1.isOcupado()) prog1.exibirDados();
                        if (!prog2.isOcupado()) prog2.exibirDados();
                        if (!prog3.isOcupado()) prog3.exibirDados();
                        break;

                    case 3:
                        System.out.println("\n--- DADOS DA EMPRESA ---");
                        System.out.println("Nome: " + empresa.getNome());
                        System.out.println("Localização: " + empresa.getLocalizacao());
                        System.out.println("Sobre a empresa: " + empresa.getDados());
                        break;

                    case 4:
                        System.out.println("\n--- CLIENTES E PROJETOS CADASTRADOS ---");
                        if (listaClientes.isEmpty()) {
                            System.out.println("Nenhum cliente cadastrado.");
                        } else {
                            for (Cliente c : listaClientes) {
                                System.out.println("Cliente: " + c.getNome() +
                                        " | Projeto: " + c.getProjeto() +
                                        " | Programador: " + c.getProgramador());
                            }
                        }
                        break;

                    case 5:
                        System.out.println("Encerrando o sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida.");
                }
            } while (opcao != 5);

        } catch (IOException e) {
            System.out.println("Erro de entrada: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro: você deve digitar um número válido.");
        }
    }
}


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
                        try {
                            System.out.print("Nome do Cliente: ");
                            String nomeCliente = reader.readLine();
                            validarProjeto(nomeCliente);
                            cliente.setNome(nomeCliente);

                            System.out.print("Nome do Projeto: ");
                            String nomeProjeto = reader.readLine();
                            validarProjeto(nomeProjeto);
                            cliente.setProjeto(nomeProjeto);

                            System.out.println("\nEscolha um programador:");
                            System.out.print("1 - " + prog1.getNome() + " (" + prog1.getTipo() + ")");
                            System.out.println(prog1.isOcupado() ? " [OCUPADO]" : "");

                            System.out.print("2 - " + prog2.getNome() + " (" + prog2.getTipo() + ")");
                            System.out.println(prog2.isOcupado() ? " [OCUPADO]" : "");

                            System.out.print("3 - " + prog3.getNome() + " (" + prog3.getTipo() + ")");
                            System.out.println(prog3.isOcupado() ? " [OCUPADO]" : "");

                            System.out.print("Digite o número: ");
                            int escolha = Integer.parseInt(reader.readLine());

                            if (escolha == 1) {
                                if (prog1.isOcupado())
                                    throw new ProgramadorOcupadoException(prog1.getNome());
                                prog1.setOcupado(true);
                                cliente.setProgramador(prog1.getNome());
                                listaClientes.add(cliente);
                                System.out.println("Projeto atribuído a " + prog1.getNome());
                            } else if (escolha == 2) {
                                if (prog2.isOcupado())
                                    throw new ProgramadorOcupadoException(prog2.getNome());
                                prog2.setOcupado(true);
                                cliente.setProgramador(prog2.getNome());
                                listaClientes.add(cliente);
                                System.out.println("Projeto atribuído a " + prog2.getNome());
                            } else if (escolha == 3) {
                                if (prog3.isOcupado())
                                    throw new ProgramadorOcupadoException(prog3.getNome());
                                prog3.setOcupado(true);
                                cliente.setProgramador(prog3.getNome());
                                listaClientes.add(cliente);
                                System.out.println("Projeto atribuído a " + prog3.getNome());
                            } else {
                                System.out.println("Opção inválida.");
                            }
                        } catch (ProjetoVazioException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Dica: " + e.getDica());
                        } catch (ProgramadorOcupadoException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Ajuda: " + e.getSugerencia());
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

    public static void validarProjeto(String nome) throws ProjetoVazioException {
        if (nome.trim().isEmpty()) {
            throw new ProjetoVazioException("Erro: nome não pode estar vazio.");
        }
    }
}

// Felipe Esteves de Paula
// RA: 2389576

import java.util.ArrayList;

public class BDCliente {
    private ArrayList<Cliente> lista;

    //MÉTODO SINGLETON
    private static BDCliente instance;
    public static BDCliente getInstance() {
        if (instance == null) {
            instance = new BDCliente();
        }
        return instance;
    }

    private BDCliente() {
        lista = new ArrayList<>();
    }

    public boolean inserir(Cliente c) {
        if (consultarPorNome(c.getNome()) == null) {
            lista.add(c);
            return true;
        }
        return false;
    }

    public Cliente consultarPorNome(String nome) {
        for (Cliente c : lista) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        return null;
    }

    public boolean alterar(String nome, Cliente novoCliente) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                lista.set(i, novoCliente);
                return true;
            }
        }
        return false;
    }

    public boolean excluir(String nome) {
        return lista.removeIf(c -> c.getNome().equalsIgnoreCase(nome));
    }

    public ArrayList<Cliente> getTodos() {
        return lista;
    }
}

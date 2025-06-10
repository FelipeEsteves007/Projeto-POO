// Felipe Esteves de Paula
// RA: 2389576

import java.util.ArrayList;

public class BDProgramador {
    private ArrayList<Programador> lista;

    //MÉTODO SINGLETON
    private static BDProgramador instance;
    public static BDProgramador getInstance() {
        if (instance == null) {
            instance = new BDProgramador();
        }
        return instance;
    }

    private BDProgramador() {
        lista = new ArrayList<>();
    }

    public boolean inserir(Programador p) {
        if (consultarPorNome(p.getNome()) == null) {
            lista.add(p);
            return true;
        }
        return false;
    }

    public Programador consultarPorNome(String nome) {
        for (Programador p : lista) {
            if (p.getNome().equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }

    public boolean alterar(String nome, Programador novoProg) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equalsIgnoreCase(nome)) {
                lista.set(i, novoProg);
                return true;
            }
        }
        return false;
    }

    public boolean excluir(String nome) {
        return lista.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    public ArrayList<Programador> getTodos() {
        return lista;
    }
}

package modelodiagrama;

import java.util.ArrayList;
import java.util.List;

public class Candidato {
    private String nome;
    private List<Telefone> telefones;

    public Candidato(String nome, String primeiroNumeroTelefone) {
        this.nome = nome;
        this.telefones = new ArrayList<>();
        if (primeiroNumeroTelefone != null && !primeiroNumeroTelefone.isEmpty()) {
            adicionarTelefone(primeiroNumeroTelefone);
        } else {
            throw new IllegalArgumentException("O candidato deve ter pelo menos um telefone.");
        }
    }

    // Método para adicionar um telefone à lista de telefones do candidato
    public void adicionarTelefone(String numero) {
        Telefone telefone = new Telefone(numero);
        this.telefones.add(telefone);
    }

    // Método para obter a lista de telefones do candidato
    public List<Telefone> getTelefones() {
        return telefones;
    }
}


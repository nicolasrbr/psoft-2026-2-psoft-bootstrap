import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Time {
    private String nome;
    private List<Funcionario> equipe = new ArrayList<>();

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Funcionario> getEquipe() {
        return Collections.unmodifiableList(equipe);
    }

    public void adicionarGerente(Gerente gerente) {
        if (gerente == null || equipe.contains(gerente)) {
            return;
        }
        gerente.setTime(this);
        equipe.add(gerente);
    }

    public void adicionarDesenvolvedor(Desenvolvedor desenvolvedor) {
        if (desenvolvedor == null || equipe.contains(desenvolvedor)) {
            return;
        }
        equipe.add(desenvolvedor);
    }

    public void adicionarLider(Lider lider) {
        if (lider == null || equipe.contains(lider)) {
            return;
        }
        equipe.add(lider);
    }

    public Gerente getGerente() {
        for (Funcionario funcionario : equipe) {
            if (funcionario instanceof Gerente) {
                return (Gerente) funcionario;
            }
        }
        return null;
    }

    public Lider getLiderAtual() {
        for (Funcionario funcionario : equipe) {
            if (funcionario instanceof Lider) {
                return (Lider) funcionario;
            }
        }
        return null;
    }

    public void definirLiderDeTime(Desenvolvedor desenvolvedor) {
        if (desenvolvedor == null) {
            return;
        }

        int indice = equipe.indexOf(desenvolvedor);
        if (indice >= 0) {
            Lider lider = new Lider(desenvolvedor.getNome(), desenvolvedor.getEmail());
            equipe.set(indice, lider);
            desenvolvedor.definirComoLiderDeTime();
            lider.definirComoLiderDeTime();
            return;
        }

        adicionarDesenvolvedor(desenvolvedor);
        definirLiderDeTime(desenvolvedor);
    }

    @Override
    public String toString() {
        return nome + " -> equipe: " + equipe.size();
    }
}

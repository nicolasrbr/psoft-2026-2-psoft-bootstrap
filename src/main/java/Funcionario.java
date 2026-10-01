import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Funcionario {
    private String nome;
    private String email;
    private List<Cargo> cargos = new ArrayList<>();

    public Funcionario(String nome) {
        this(nome, "");
    }

    public Funcionario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void adicionarCargo(Cargo cargo) {
        if (cargo != null && !cargos.contains(cargo)) {
            cargos.add(cargo);
        }
    }

    public List<Cargo> getCargos() {
        return Collections.unmodifiableList(cargos);
    }

    @Override
    public String toString() {
        return nome;
    }
}

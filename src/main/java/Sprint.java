public class Sprint {
    private String nome;
    private Lider lider;

    public Sprint(String nome, Lider lider) {
        this.nome = nome;
        this.lider = lider;
    }

    public Sprint(String nome, Desenvolvedor desenvolvedor) {
        this(nome, desenvolvedor instanceof Lider ? (Lider) desenvolvedor : new Lider(desenvolvedor.getNome(), desenvolvedor.getEmail()));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Lider getLider() {
        return lider;
    }

    public void setLider(Lider lider) {
        this.lider = lider;
    }

    @Override
    public String toString() {
        return nome + " (líder: " + lider + ")";
    }
}

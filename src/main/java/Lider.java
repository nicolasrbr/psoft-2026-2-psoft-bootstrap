public class Lider extends Desenvolvedor {
    private String nomeSprint;

    public Lider(String nome) {
        super(nome);
    }

    public Lider(String nome, String email) {
        super(nome, email);
    }

    public String getNomeSprint() {
        return nomeSprint;
    }

    public void setNomeSprint(String nomeSprint) {
        this.nomeSprint = nomeSprint;
    }

    @Override
    public String toString() {
        return super.toString() + (nomeSprint != null ? " [Sprint: " + nomeSprint + "]" : "");
    }
}

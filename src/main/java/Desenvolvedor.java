public class Desenvolvedor extends Funcionario {
    private boolean liderDeTime;

    public Desenvolvedor(String nome) {
        super(nome);
    }

    public Desenvolvedor(String nome, String email) {
        super(nome, email);
    }

    public void definirComoLiderDeTime() {
        this.liderDeTime = true;
    }

    public void removerPapelDeLider() {
        this.liderDeTime = false;
    }

    public boolean isLiderDeTime() {
        return liderDeTime;
    }

    public Gerente promoverParaGerente() {
        Gerente gerente = new Gerente(getNome(), getEmail());
        gerente.setNome(getNome());
        gerente.setEmail(getEmail());
        return gerente;
    }

    @Override
    public String toString() {
        return super.toString() + (liderDeTime ? " [Líder de time]" : " [Desenvolvedor]");
    }
}

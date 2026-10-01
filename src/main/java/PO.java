public class PO extends Funcionario {
    public PO(String nome) {
        super(nome);
    }

    public PO(String nome, String email) {
        super(nome, email);
    }

    @Override
    public String toString() {
        return super.toString() + " [PO]";
    }
}

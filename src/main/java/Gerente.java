public class Gerente extends Funcionario {
    private Time time;

    public Gerente(String nome) {
        super(nome);
    }

    public Gerente(String nome, String email) {
        super(nome, email);
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return super.toString() + " [Gerente]";
    }
}

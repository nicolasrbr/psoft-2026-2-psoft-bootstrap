public class Funcionario extends Pessoa {

	private Number salario;
	private String email;
	
	public Funcionario(String nome, int idade, String cpf, String telefone, Number salario, String email) {
		super(nome, idade, cpf, telefone);
		this.salario = salario;
		this.email = email;
	}

	public Number getSalario() {
		return salario;
	}

	public void setSalario(Number salario) {
		this.salario = salario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

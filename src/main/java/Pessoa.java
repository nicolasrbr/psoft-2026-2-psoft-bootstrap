import java.util.List;
import java.util.ArrayList;

public abstract class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private String telefone;
	private List<Endereco> enderecos;

	public Pessoa(String nome, int idade, String cpf, String telefone) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
		this.enderecos = new ArrayList<Endereco>();
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String getEndereco(int id) {
		return this.enderecos.get(id).toString();
	}
	
	public int addEndereco(String cidade, String bairro, String rua, int numero, String complemento) {
		int id = this.enderecos.size();
		
		Endereco e = new Endereco(id, cidade, bairro, rua, numero, complemento);
		enderecos.add(e);
		
		return id;
	}

}

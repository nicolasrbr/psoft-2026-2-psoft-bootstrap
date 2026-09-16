
public class Endereco {
	private int id;
	private String cidade;
	private String bairro;
	private String rua;
	private int numero;
	private String complemento;
	
	public Endereco(int id, String cidade, String bairro, String rua, int numero, String complemento) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.bairro = bairro;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
	}

	public int getId() {
		return id;
	}

	public String getCidade() {
		return cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public String getRua() {
		return rua;
	}

	public int getNumero() {
		return numero;
	}

	public String getComplemento() {
		return complemento;
	}

	@Override
	public String toString() {
		return "Endereco [cidade=" + cidade + ", bairro=" + bairro + ", rua=" + rua + ", numero=" + numero
				+ ", complemento=" + complemento + "]";
	}

}

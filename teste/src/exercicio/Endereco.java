package exercicio;

public class Endereco {

	private String rua;
	private String bairro;
	private Cidade cidade;

	public Endereco(String rua, String bairro, Cidade cidade) {
		super();
		this.rua = rua;
		this.bairro = bairro;
		this.cidade = cidade;
	}
	

	@Override
	public String toString() {
		return "\nRua: " + rua + "\nbairro: " + bairro + cidade;
	}


	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

}

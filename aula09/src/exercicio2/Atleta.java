package exercicio2;

public class Atleta {

	private String nome;
	private String posicao;
	private Integer idade;



	@Override
	public String toString() {
		return "\nNome=" + nome + "\nposicao=" + posicao + "\nidade=" + idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}

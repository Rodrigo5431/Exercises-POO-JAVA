package exercicio2;

public class Pais {
	private String nome;
	private Atleta atleta;

	public Pais(String nome, Atleta atleta) {
		super();
		this.nome = nome;
		this.atleta = atleta;

	}

	@Override
	public String toString() {
		return atleta + "\nPais: " + nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Atleta getAtleta() {
		return atleta;
	}

	public void setAtleta(Atleta atleta) {
		this.atleta = atleta;
	}

}
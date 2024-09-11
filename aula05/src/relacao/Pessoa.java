package relacao;

public class Pessoa {

	private String nome;
	private String email;

	public Pessoa(String nome, String email) {
		super();
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "nome= " + nome + ", email= " + email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

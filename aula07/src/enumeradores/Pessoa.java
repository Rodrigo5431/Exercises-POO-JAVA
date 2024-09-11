package enumeradores;

public class Pessoa {

	private String nome;
	private EstadoCivil estadocivil;

	public Pessoa(String nome, EstadoCivil estadocivil) {
		super();
		this.nome = nome;
		this.estadocivil = estadocivil;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoCivil getEstadocivil() {
		return estadocivil;
	}

	public void setEstadocivil(EstadoCivil estadocivil) {
		this.estadocivil = estadocivil;
	}

}

package exercicio;

public class Telefone {

	private String telefone;

	public Telefone(String telefone) {
		super();
		this.telefone = telefone;
	}

	@Override
	public String toString() {
		return  telefone;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}

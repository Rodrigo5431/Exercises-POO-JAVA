package interfaces;

public class Pessoa implements Tributos {
	private String nome;
	private Double rendimentos;

	public Pessoa(String nome, Double rendimentos) {
		super();
		this.nome = nome;
		this.rendimentos = rendimentos;
	}

	@Override
	public String toString() {
		return "Nome=" + nome + "\nRendimentos: " + rendimentos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendimentos() {
		return rendimentos;
	}

	public void setRendimentos(Double rendimentos) {
		this.rendimentos = rendimentos;
	}

	@Override
	public double calcularIR() {
		// TODO Auto-generated method stub
		return rendimentos * IRPESSOAFISICA;
	}

	@Override
	public Double calcularICMS() {
		
		return 0.0;
	}

}

package heranca;

public class Empregado {

	protected String nome, cpf;
	protected Double salario;

	public Empregado() {

	}

	public Empregado(String nome, String cpf, Double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "nome: " + nome + " cpf: " + cpf + " salario: " + salario;
	}

	public void aumentarSalario() {
		salario *= 1.10;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

}

package revisao;

import java.util.Scanner;

public class Funcionario {

	protected String nome;
	protected String cpf;
	

	public Funcionario(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	

	@Override
	public String toString() {
		return "Nome:" + nome + "\ncpf: " + cpf;
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

}

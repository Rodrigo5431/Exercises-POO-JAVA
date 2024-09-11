package aula;

import aula.Funcionario.EstadoCivil;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Rodrigo", EstadoCivil.VIUVO);

		System.out.println("Nome: " + funcionario.getNome() + funcionario.getEstadoCivil());
		System.out.println(funcionario.getEstadoCivil().ordinal());
	}

}

package aula;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TesteFuncionario {

	public static void main(String[] args) {

		List<Funcionario> funcionarios = Arrays.asList(new Funcionario("Ana", 35), new Funcionario("Igor", 18),
				new Funcionario("Rodrigo", 22));

		Collections.sort(funcionarios);
		for (Funcionario f : funcionarios) {
			System.out.println(f);
			System.out.println(funcionarios.indexOf(f));
		}
		//List<String> cores = Arrays.asList
	}
}

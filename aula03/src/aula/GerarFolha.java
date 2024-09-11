package aula;

import java.util.Scanner;

public class GerarFolha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Funcionario funcionario= new Funcionario();
		
		System.out.println("Digite seu cpf");
		funcionario.setCpf(leia.next());
		System.out.println("Digite seu nome");
		funcionario.setNome(leia.next());
		System.out.println("Digite seu salario");
		funcionario.setSalarioBruto(leia.nextDouble());
	
		
			System.out.println("Nome: "+funcionario.getNome() +" Salario liquido: " +funcionario.calcularFolha()); 
			System.out.println("Folha Gerada");

		
		leia.close();
	}

}

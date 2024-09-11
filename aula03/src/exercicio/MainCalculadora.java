package exercicio;

import java.util.Scanner;

public class MainCalculadora {

	
	public static void main(String[] args) {
		
		
		Calculadora calculadora = new Calculadora();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("Digite um numero");
		calculadora.setNumero1(sc.nextDouble());
		System.out.println("Digite outro numero");
		calculadora.setNumero2(sc.nextDouble());
		
		System.out.println("Qual operação voce deseja fazer?\n1)Soma\t\t\t\t\t\t2)Subtracao\n3)Divisão\t\t\t\t\t4)Multiplicacão");
		calculadora.setEscolha(sc.nextInt());
		calculadora.opcoes();
		System.out.println(calculadora.getResultado());
		
		System.out.println("Deseja fazer outra operacão?\n1)Sim\t\t\t\t2)Não");
		 calculadora.setNovamente(sc.nextInt());
		 if (calculadora.getNovamente() == 2) {
			 System.out.println("Obrigado por participar");
			 break;
		 }
		 System.out.println();
			
		}
	}
}
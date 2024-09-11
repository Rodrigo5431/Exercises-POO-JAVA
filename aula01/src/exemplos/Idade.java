package exemplos;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
	

		Scanner leiaInt = new Scanner(System.in);

		System.out.println("Digite sua idade");
		int idade = leiaInt.nextInt();
		if (idade >= 18) {
			System.out.println("pode participar");
		} else {
			System.out.println("Nao pode participar");
		}
		
	}
}

package exercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteTime {

	public static void main(String[] args) {
		
		List<Time> time = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Atleta atleta = new Atleta();
		
		Time times = new Time("Flamengo","coutinho", "Pele",atleta);
		
		System.out.println("Digite o nome do Jogador");
		atleta.setNome(sc.next());
		System.out.println("Digite sua idade");
		atleta.setIdade(sc.nextInt());
		System.out.println("Digite sua posicao");
		atleta.setPosicao(sc.next());
		
		time.add(times);
		for (Time t : time) {
			System.out.println(t);
			
		}
	}
}

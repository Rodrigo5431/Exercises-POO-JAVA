package exercicio;

import java.util.Scanner;

public class TesteProdutos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Produtos produtos = new Produtos();
		
		System.out.println("Digite a descrição");
		produtos.setDescricao(sc.next());
		
		System.out.println("Digite o Valor");
		produtos.setValor(sc.nextDouble());
		
		System.out.println("Digite a quantidade");
		produtos.setQuantidade(sc.nextInt());
		
		System.out.println("Produto: "+ produtos.getDescricao()+ "\nValor: "+ produtos.getValor()+
				"\nQuantidade: "+ produtos.getQuantidade());
		sc.close();
	}
}

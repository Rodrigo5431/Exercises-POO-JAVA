package testes;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Leitura {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String nome;
		
		System.out.println("Entre com nome");
		nome = sc.next();
		System.out.println(nome);
		sc.close();
		
		String nome2 = JOptionPane.showInputDialog("Digite seu nome");
	}
}

package aula;

import java.io.File;
import java.util.Scanner;

public class LeituraDirArq {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe ou digite o nome de um arquivo ou diretorio:\n");
		String nome = sc.nextLine();

		File arquivo = new File(nome);

		if (arquivo.exists()) {
			if (arquivo.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n"
						,arquivo.getName(), arquivo.length());
			} else {
				System.out.println("\nConteudo da pasta:\n");
				for (File file : arquivo.listFiles()) {
					System.out.println(file);
				}
			}
		} else {
			System.err.println("Arquivo ou diretorio nao encontrado");
		}
		sc.close();
	}

}

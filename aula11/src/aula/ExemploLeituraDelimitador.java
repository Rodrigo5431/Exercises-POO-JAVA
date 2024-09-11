package aula;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExemploLeituraDelimitador {

	public static void main(String[] args) {
		try {
			// File arquivo = new File("./teste/alunos.csv");
			Scanner sc = new Scanner(new File("src./teste/alunos.csv"));
			sc.useDelimiter(";");

			while (sc.hasNext()) {
				System.out.println(sc.next());

			}
			sc.close();

		} catch (FileNotFoundException e) {
			System.err.println("arquivo nao encontrado");
		}

	}

}

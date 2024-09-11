package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeituraArquivo {

	public static void main(String[] args) {
		
		try {
			FileReader fr = new FileReader("c://aula//teste.txt");
			System.out.println("achei");
		} catch (FileNotFoundException e) {
		System.err.println("Nao encontrei");	
			e.printStackTrace();
		}

	}

}

package aula;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {

	public static void main(String[] args) {
		
		Set<String> lista = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		String time = sc.next().toUpperCase();
		
		lista.add("Flamengo");
		lista.add("Vasco");
		lista.add("botafogo");
		lista.add("botafogo");
		
		System.out.println(lista);
		
		
		
	}

}

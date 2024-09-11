package revisao;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Exemplo {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		lista.add("Branco");
		lista.add("Preto");
		lista.add("Amarelo");
		lista.add("roxo");
		System.out.println(lista);
		
		
		Set <Integer> numeros = new LinkedHashSet<>();
		numeros.add(10);
		numeros.add(30);
		numeros.add(20);
		numeros.add(10);
		System.out.println(numeros);
		
	}
}

package aula;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List nomes = new ArrayList<>();
		nomes.add("Carlos");
		nomes.add("Marisa");
		nomes.add(5);
		nomes.add(true);

		if (nomes.contains("ola")) {
			nomes.remove(nomes.indexOf("ola"));
			
		}

		for (Object s : nomes) {
			System.out.println(s);
		}
	}
}

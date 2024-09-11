package aula;

import java.util.List;

public class IndexLista {

	public static void main(String[] args) {
		
		List<String> carros = List.of("Gol", "Hb20", "Sandero", "Fusca");
		
		carros.set(0, "Gol 1000");
	}
}

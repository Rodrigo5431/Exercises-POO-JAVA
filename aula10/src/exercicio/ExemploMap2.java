package exercicio; 

import java.util.Map;
import java.util.TreeMap;

public class ExemploMap2 {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> mapas = new TreeMap<>();
		mapas.put(16, "Rodrigo");
		mapas.put(5, "Lais");
		mapas.put(30, "Igor");
		
		for (Map.Entry<Integer, String>dados :
			mapas.entrySet()) {
			System.out.println(dados.getKey() +
					"-" + dados.getValue());
		}
	}
}

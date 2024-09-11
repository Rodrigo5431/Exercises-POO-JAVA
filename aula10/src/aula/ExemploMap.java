package aula;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {

	public static void main(String[] args) {
		HashMap<String, String> estados = new HashMap<>();
		estados.put("Rj", "rio DE janeiro");
		estados.put("Sp", "sao paulo");
		estados.put("mg", "Minas");
		
		//System.out.println(estados.keySet());
		
//		for (String s : estados.values()) {
//			System.out.println(s);
//		}
		for (Map.Entry<String, String> dados: estados.entrySet()) {
			System.out.println(dados.getKey() +
					"-" + dados.getValue());
		}
	
	}
}

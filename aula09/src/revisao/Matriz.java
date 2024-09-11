package revisao;

import java.util.Iterator;

public class Matriz {

	
	public static void main(String[] args) {
		
	String[][] pessoas = {{"Jose", "jose@gmail"},
						  {"Ana", "ana@gmail"},
						  {"Igor", "igor@gmail"}};
	
	
	for (int i = 0; i < pessoas.length; i++) {
		
		for (int j = 0; j < pessoas[i].length; j++) {
			
			System.out.println(pessoas[i][j] );
		}
	}
	
	
	}
	
	
}

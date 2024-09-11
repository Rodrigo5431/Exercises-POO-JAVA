package aula;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class VarArgs {

	public static void main(String[] args) {
		int total = 0;
		
		total = calcularsoma(10, 4 , 5, 4, 9, 7, 8, 5);
		
		System.out.println("Total: " + total );
	}

	public static int calcularsoma(int... numeros) {
		int soma = 0;
		for (int i  : numeros) {
			
			soma += i;
		}
		return soma;
	}
	
}

package revisao;

public class Exemplos {

	public static void main(String[] args) {
		
		int pares = 0, impares =0;
	for (int i = 1; i<=20; i++) {
		if(i % 2 == 0) {
			System.out.println(i + " é Par");
			pares ++;
		}
		else {
			System.out.println(i+ " é Impar");
			impares++;
		
		}
		}
		System.out.println("Tem "+ pares+" numeros pares");
		System.out.println("Tem "+ impares+" numeros impares");
	
	}
	
}

package exception;

public class Exemplo2 {

	public static void main(String[] args) {

		int vetor[] = { 5, 10, 20 };
		int i = 10, j = 0, resultado = 0;
		String texto = null;

		try {
			resultado = i / j;
			System.out.println(vetor[3]);
			System.out.println(texto.toLowerCase());
		}

		catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Erro");
		} catch (ArithmeticException e) {
			System.err.println("divisao por 0");

		} catch (NullPointerException e) {
			System.out.println("valores nulos");
		}
	}
}

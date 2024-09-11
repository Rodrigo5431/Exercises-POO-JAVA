package exception;

public class Exemplo {

	public static double calcular(int a, int b) throws ArithmeticException {
	//	if(b ==0) {
		//	throw new ArithmeticException("Erro de divisão por 0");
		//}
	return a / b;
	}
	public static void main(String[] args) {
		try {
			System.out.println("Resultado: "+ calcular(10, 0));
			
		} catch (ArithmeticException e) {
			//e.printStackTrace();
			System.out.println("Erro de divisão por 0");
		}finally {
			
		}

	}

}

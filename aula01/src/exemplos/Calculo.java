package exemplos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Calculo {

	public static void main(String[] args) {
		
		double result = 0, n1, n2;
		
		Scanner leiaInt = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		n1 = leiaInt.nextDouble();
		
		System.out.println("Digite outro numero");
		n2 = leiaInt.nextDouble();
		
		calcular( n1, n2, result);
		//result = (n1 + n2)/2;
		
		//System.out.println(result);
	}

		public static void calcular(double n1, double n2, double result) {
			result = (n1 + n2)/2;
			System.out.println(result);
		}

/*import javax.swing.JOptionPane;

public class Calculo {
	public static void main(String[] args) {
		// Criar duas variáveis atribuir valores e retorna a média
		double valor1, valor2;
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro nº"));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo nº"));
		calcular(valor1, valor2);
	}
	
	public static void calcular(double valor1, double valor2) {
		JOptionPane.showMessageDialog(null, (valor1 + valor2) / 2);
	}*/
}



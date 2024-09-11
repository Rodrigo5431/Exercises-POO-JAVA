package banco;

public class Conta {
	public Integer numero;
	public String titular;
	public Double saldo;
	
	public void deposito(Double valor) {
		if (valor <= 0) {
			System.out.println("Valor invalido!");
		}
		else {
			saldo = saldo + valor;
			//saldo += valor;
		}
	}
	
	public boolean saque (Double valor) {
		if (saldo < valor) {
			//System.out.println("Saldo insuficiente");
			return false;
		}
		else {
			saldo-= valor;
			return true;
		}
		
	}
	public static void imprimir() {
		System.out.println("Static");
	}
}

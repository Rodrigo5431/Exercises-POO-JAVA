package testes;

import banco.Conta;

public class TesteConta {

	public static void main(String[] args) {
		Conta conta1 = new Conta();
		conta1.numero = 123;
		conta1.titular = "Rodrigo";
		conta1.saldo = 1000.;
		
		Conta conta2 = new Conta();
		conta2.numero = 321;
		conta2.titular = "Lucas";
		conta2.saldo = 2000.;
		conta2.deposito(100.);
		Conta.imprimir();
		
		conta1.deposito(500.);
		
		if(conta1.saque(200.)) {
			System.out.println("Saque efetuado");
			
		}else {
			System.out.println("Saldo insuficiente");
		}
		
		System.out.println(conta1.saldo);
	}

}

package interfaces;

public interface Conta {
	Double IMPOSTO = 10.;
	
	void saque(Double valor);
	void deposito(Double valor);
}

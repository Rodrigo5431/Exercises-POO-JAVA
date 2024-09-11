package aula;

public class Calculo<T> {
	private T numero;

	public Calculo(T numero) {
		super();
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Calculo [numero=" + numero + "]";
	}

	public T getNumero() {
		return numero;
	}

	public void setNumero(T numero) {
		this.numero = numero;
	}

	public static void main(String[] args) {
		Calculo <Integer> cl= new Calculo<Integer>(100);
	}
}

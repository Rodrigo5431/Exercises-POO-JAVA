package exercicio;

import java.time.LocalDate;

public class Moto extends Veiculo {
	private Integer cilindradas;

	public Moto(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			Integer cilindradas) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.cilindradas = cilindradas;
	}

	public Double lavarVeiculo() {

	}

	public Double trocarOleo() {
		
	}

	public Double revisao() {
		
	}
}
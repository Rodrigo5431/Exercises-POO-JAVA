package exercicio;

import java.time.LocalDate;

public class Carro extends Veiculo {
	
	private String categoria;

	public Carro(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario,
			String categoria) {
		super(modelo, valorCobrado, dataConserto, proprietario);
		this.categoria = categoria;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public Double lavarVeiculo() {
		valorCobrado = TipoServico.LAVAGEM.getValorServico();
		return valorCobrado;
	}
	public Double trocarOleo() {
		valorCobrado = TipoServico.OLEO.getValorServico();
		return valorCobrado;
		
	}
	public Double revisao() {
		LocalDate dataInicio = LocalDate.of(2024, 8, 1);
        LocalDate dataFim = LocalDate.of(2024, 8, 31);    
		valorCobrado = TipoServico.REVISAO.getValorServico();
		
		if(dataConserto.isAfter(dataInicio) && dataConserto.isBefore(dataFim)) {
		valorCobrado = valorCobrado / 1.10;
		return valorCobrado;
	}	
		else {
			return valorCobrado;
		}
		
		
	}

}
package exercicio;

import java.time.LocalDate;

public class Veiculo implements Oficina {
	
	protected String modelo;
	protected Double valorCobrado;
	protected LocalDate dataConserto;
	protected Proprietario proprietario;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(Double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public LocalDate getDataConserto() {
		return dataConserto;
	}

	public void setDataConserto(LocalDate dataConserto) {
		this.dataConserto = dataConserto;
	}

	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	@Override
	public String toString() {
		return "Veiculo [modelo=" + modelo + ", valorCobrado=" + valorCobrado + ", dataConserto=" + dataConserto
				+ ", proprietario=" + proprietario + "]";
	}

	public Veiculo(String modelo, Double valorCobrado, LocalDate dataConserto, Proprietario proprietario) {
		super();
		this.modelo = modelo;
		this.valorCobrado = valorCobrado;
		this.dataConserto = dataConserto;
		this.proprietario = proprietario;
	}

	@Override
	public Double lavarVeiculo() {
		
		return null;
	}

	@Override
	public Double trocarOleo() {
		return null;
	}

	@Override
	public Double revisao() {
		return null;
	}

}
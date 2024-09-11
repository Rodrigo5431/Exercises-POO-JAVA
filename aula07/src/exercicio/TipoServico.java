package exercicio;

public enum TipoServico {
	OLEO(100.),LAVAGEM(50.),REVISAO(200.);
	
	private Double valorServico;

	private TipoServico(Double valorServico) {
		this.valorServico = valorServico;
	}

	public Double getValorServico() {
		return valorServico;
	}

	public void setValorServico(Double valorServico) {
		this.valorServico = valorServico;
	}
	

}
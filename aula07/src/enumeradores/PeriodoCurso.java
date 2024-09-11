package enumeradores;

public enum PeriodoCurso {

	NOTURNO("ter e quar", 2500., 40), INTEGRAL("seg e sext", 1800., 20), TARDE("qui e sex", 3200., 80);

	private String dias;
	private Double valor;
	private Integer cargaHoraria;

	private PeriodoCurso(String dias, Double valor, Integer cargaHoraria) {
		this.dias = dias;
		this.valor = valor;
		this.cargaHoraria = cargaHoraria;
	}

	public String getDias() {
		return dias;
	}

	public Double getValor() {
		return valor;
	}

	public Integer getCargaHoraria() {
		return cargaHoraria;
	}

}

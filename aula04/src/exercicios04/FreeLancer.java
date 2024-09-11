package exercicios04;

public class FreeLancer extends Vendedor {

	private Integer diasTrabalhados;
	private Double valorDia;

	public FreeLancer(String nome, String cpf, Integer diasTrabalhados, Double valorDia) {
		super(nome, cpf);
		this.diasTrabalhados = diasTrabalhados;
		this.valorDia = valorDia;
	}

	@Override
	public String toString() {
		return "FreeLancer [diasTrabalhados=" + diasTrabalhados + ", valorDia=" + valorDia + "]";
	}

	public Integer getDiasTrabalhados() {
		return diasTrabalhados;
	}

	public void setDiasTrabalhados(Integer diasTrabalhados) {
		this.diasTrabalhados = diasTrabalhados;
	}

	public Double getValorDia() {
		return valorDia;
	}

	public void setValorDia(Double valorDia) {
		this.valorDia = valorDia;
	}

}

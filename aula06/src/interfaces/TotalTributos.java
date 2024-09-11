package interfaces;

public class TotalTributos {
	private Double totalGeral = 0.;

	public Double getTotalGeral() {
		return totalGeral;
	}

	public void setTotalGeral(Double totalGeral) {
		this.totalGeral = totalGeral;
	}

	public void totalizaAtributos(Tributos tributos) {
		totalGeral = 0.;
		totalGeral = totalGeral + tributos.calcularIR();
		totalGeral = totalGeral + tributos.calcularICMS();
		
	}
}

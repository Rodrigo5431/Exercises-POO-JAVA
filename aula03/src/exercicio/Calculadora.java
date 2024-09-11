package exercicio;

public class Calculadora {
	
	
	private Double resultado = 0.;
	private Double numero1;
	private Double numero2;
	private Integer escolha;
	private Integer novamente;

	public Double opcoes() {
		switch (escolha) {

		case 1:
			resultado = numero1 + numero2;
			return resultado;
		case 2:
			resultado = numero1 - numero2;
			return resultado;
		case 3:
			resultado = numero1 / numero2;
			return resultado;
		case 4:
			resultado = numero1 * numero2;
			return resultado;

		default:
			System.out.println("Invalido");
			return resultado;

		}
	}
	
	
	public Integer getNovamente() {
		return novamente;
	}

	public void setNovamente(Integer novamente) {
		this.novamente = novamente;
	}

	public Integer getEscolha() {
		return escolha;
	}

	public void setEscolha(Integer escolha) {
		this.escolha = escolha;

	}

	public Double getNumero1() {
		return numero1;
	}

	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}

	public Double getNumero2() {
		return numero2;
	}

	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}


	public Double getResultado() {
		return resultado;
	}

	public void setResultado(Double resultado) {
		this.resultado = resultado;
	}

}


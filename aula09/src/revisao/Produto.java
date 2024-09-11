package revisao;

public class Produto {

	private String descricao;
	private Double valor;

	public Produto(String descricao, Double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getProduto() {
		return descricao;
	}

	public void setProduto(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

}

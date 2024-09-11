package exercicios04;

public class Fixo extends Vendedor {

	private Double salarioBase;
	private Double comissao;
	private Double salarioBruto;
	private Integer opcaoVendedor, encerraPrograma;
	private Double valor = 0.;
	private Double valorFinal = 0.;

	public Integer getEncerraPrograma() {
		return encerraPrograma;
	}
	

	public void setEncerraPrograma(Integer encerraPrograma) {
		this.encerraPrograma = encerraPrograma;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Fixo(String nome, String cpf, Double salarioBase, Double comissao, Double salarioBruto) {
		super(nome, cpf);
		this.salarioBase = salarioBase;
		this.comissao = comissao;
		this.salarioBruto = salarioBruto;
	}

	public Double somaDasVendas() {
		valorFinal = valorFinal + valor;
		return valorFinal;
	}

	public String escolhaVendedor() {
		switch (opcaoVendedor) {
		case 1:
			return nome;
		case 2:
			return nome;
		default:
			System.out.println("Opção invalida!");
			return nome;
		}
	}

	@Override
	public String toString() {
		return "Nome: "+ nome +"\nsalario Base = " + salarioBase + "\nTotal vendido: " + valorFinal + "\n";
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public Double getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(Double valorFinal) {
		this.valorFinal = valorFinal;
	}

	public Double getComissao() {
		return comissao;
	}

	public void setComissao(Double comissao) {
		this.comissao = comissao;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public Integer getOpcaoVendedor() {
		return opcaoVendedor;
	}

	public void setOpcaoVendedor(Integer opcaoVendedor) {
		this.opcaoVendedor = opcaoVendedor;
	}

}

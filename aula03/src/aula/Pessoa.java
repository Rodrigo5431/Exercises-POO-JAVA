package aula;

public class Pessoa {

	private Integer codigo;
	private String nome;
	private Double peso;
	private Double altura;
	
	
	private double calcularImc() {
		return peso/(altura * altura);
	}
	public String resposta() {
		if (calcularImc()<18.5) {
			return "Abaixo do peso";
		}
		else if (calcularImc() <= 24.0) {	
		return "Peso normal";
		}
		else {
			return "Acima do Peso";
		}
		
	}
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getaltura() {
		return altura;
	}

	public void setaltura(Double altura) {
		this.altura = altura;
	}

}

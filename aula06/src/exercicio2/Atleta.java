package exercicio2;

public class Atleta implements Olimpiadas {
	private String nome, modalidade;
	private Double peso;
	private String resultado;
	public static Integer contador = 0;

	public Atleta(String nome, Double peso) {
		super();
		this.nome = nome;
		this.peso = peso;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String verificaSituacao() {

		if (peso >= 90.) {
			modalidade = "Peso pesado";
			resultado = "Participara";
			contador = contador +1;
		} else if (peso >= 60 && peso < 90) {
			modalidade = "Peso medio";
			resultado = "Participara";
			contador = contador +1;
		} else {
			resultado = "Não participara";
			modalidade = "Peso insuficiente";
		}
		return resultado;
	}

}
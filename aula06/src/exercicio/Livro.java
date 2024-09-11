package exercicio;

public class Livro {

	private String autor;
	private String titulo;
	private Double valor;

	public Livro(String autor, String titulo, Double valor) {
		super();
		this.autor = autor;
		this.titulo = titulo;
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Autor: " + autor + "\nTitulo: " + titulo + "\nValor: " + valor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public void reajuste() {
        valor = valor * 1.06;
    }
}
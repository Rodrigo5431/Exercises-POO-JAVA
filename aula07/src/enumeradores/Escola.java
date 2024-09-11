package enumeradores;

public class Escola {

	private String cnpj;
	private String razaoSocial;

	public Escola(String cnpj, String razaoSocial) {
		super();
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public void gerarRelatorio() {
		System.out.println("Relatorio");
	}

}

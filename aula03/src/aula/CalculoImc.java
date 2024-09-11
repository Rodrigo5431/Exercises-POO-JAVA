package aula;

public class CalculoImc {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setCodigo(123);
		pessoa.setNome("Rodrigo");
		pessoa.setaltura(1.78);
		pessoa.setPeso(68.);
		
		System.out.println("Resultado: " + pessoa.resposta());
	}
}

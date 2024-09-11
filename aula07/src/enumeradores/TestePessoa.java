package enumeradores;

public class TestePessoa {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa("Sergio", EstadoCivil.DIVORCIADO);
		p.setEstadocivil(EstadoCivil.CASADO);
		System.out.println(p.getNome() + " - " + p.getEstadocivil());
		
		System.out.println("------------");
		
		for (EstadoCivil ec : EstadoCivil.values()) {
			System.out.println(ec);
		}
	}
}

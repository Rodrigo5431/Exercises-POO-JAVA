package heranca;

public class TesteEmpregado {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Joana");
		g1.setSalario(5000.);
		g1.setCategoria("Adm");
		g1.setNumeroEmpregados(10);
		g1.setCpf("152.270");

		g1.aumentarSalario();

		System.out.println(g1);
	}

}

package heranca;

public class TesteVeiculo {

	public static void main(String[] args) {

		Moto v1 = new Moto("abc123", "Cinza", 39000., true);
		Caminhao v2 = new Caminhao("dce324", "Branco", 39000., 1000);
			
		System.out.println(v1);
		System.out.println("Valor do ipva: " + v1.calcularIpva());
		System.out.println(v2);
		System.out.println("Valor do ipva: " + v2.calcularIpva());
	}

}

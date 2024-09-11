package revisao;

public class TestePlano {

	public static void main(String[] args) {
		Clinica c = new Clinica("Amil","checkup", "123456");
		Medico m = new Medico("Unimed", "Jose", "456");
		Anestesista a = new Anestesista("Amil", "Carlos", "123", "geral");
		ControlePgto cp = new ControlePgto();
		
		c.calcularPagamento();
		cp.calcularTotal(c);
		
		m.calcularPagamento();
		cp.calcularTotal(m);
		
		a.calcularPagamento();
		cp.calcularTotal(a);
		
		System.out.println("Clinica \n"+c+ "\n");
		System.out.println("Medico\n " + m);
		System.out.println("\nanestesista\n  "+ a);
		System.out.println("\nTOTAL GERAL: "+ cp.getTotalPago());
		
		//System.out.println("\n\nvalor total: " + (c.getValorPago() + m.getValorPago() + a.getValorPago()));
	}

}

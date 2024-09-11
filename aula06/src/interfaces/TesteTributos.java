package interfaces;

public class TesteTributos {

	public static void main(String[] args) {
		
		Pessoa p = new  Pessoa("Rodrigo", 98000.);
		Empresa e = new Empresa("Abc ltda", 288500.);
		TotalTributos tt= new TotalTributos();
		
		System.out.println(p.getNome() + " - " + p.calcularIR());
		System.out.println(p.getNome() + "-" + p.calcularICMS());
		tt.totalizaAtributos(p);
		System.out.println(tt.getTotalGeral());
		
		System.out.println(e.getRazaoSocial() + " - " + e.calcularIR());
		System.out.println(e.getRazaoSocial() + " - " + e.calcularICMS());
		tt.totalizaAtributos(e);
		System.out.println(tt.getTotalGeral());
		
	}
}

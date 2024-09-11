package revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Assistente a = new Assistente("Roni", 1420., "noite", "1");
		Diretor d = new Diretor("Rodrigo", 5000., "Noite", "3");
		
		a.reajusteSalario();
		d.reajusteSalario();
		
		System.out.println(a);
		System.out.println(d);

	}

}

package exercicio2;

public class TesteAtleta {

	public static void main(String[] args) {
		Atleta atleta = new Atleta("Gabriel", 80.);
		Atleta atleta2 = new Atleta("Gabriel", 55.);
		atleta.verificaSituacao();
		atleta2.verificaSituacao();
		Pais pais = new Pais("Brasil", atleta);
		System.out.println(atleta.getNome() +" "+ atleta.getModalidade() + "\n"+atleta2.getNome() +
				" "+atleta2.getModalidade() +"\nTotal: "+ atleta.contador);
		
	}
}
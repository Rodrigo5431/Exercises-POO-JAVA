package exercicio;

public class TesteMain {

	public static void main(String[] args) {
		
		Estado e = new Estado("RIo", "RJ");
		Cidade c = new Cidade("petro", e);
		Endereco en = new Endereco("Cristovao", "castelanea", c);
		Contato c1 = new Contato("Rodrigo", en);

		//System.out.println(c1.getNome()+"\n" + c1.getEndereco().getRua() +"\n"+
				//c1.getEndereco().getCidade().getNome() +"\n"+
				//c1.getEndereco().getCidade().getEstado().getSigla());
		System.out.println(c1);
	}

}

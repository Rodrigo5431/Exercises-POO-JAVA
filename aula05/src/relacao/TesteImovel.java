package relacao;

public class TesteImovel {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Rodrigo", "rod@gmail");
		Pessoa p2 = new Pessoa("Roni", "roni@gmail");
		Imovel i1 = new Imovel("Casa", 1000., p2);
		
		System.out.println(i1);
	}
}

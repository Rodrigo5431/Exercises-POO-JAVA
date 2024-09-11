package exercicio;

import java.util.Arrays;
import java.util.List;

public class TesteContato {

	public static void main(String[] args) {
		Estado es1 = new Estado("Rio", "RJ");
		Cidade ci1 = new Cidade("petropolis", es1);
		Endereco e1 = new Endereco("cristovao colombo", "castelanea", "25640", ci1);
		//Telefone t1 = new Telefone("249927982892");
		//Telefone t2 = new Telefone("40028922");
		List<Telefone> telefones = Arrays.asList(new Telefone ("254562"));
		Contato c1 = new Contato("Rodrigo");
		c1.adicionatelefone(telefones);
		//c1.adicionatelefone(t2);
		c1.setEndereco(e1);
		
		System.out.println(c1);
		
	}
}

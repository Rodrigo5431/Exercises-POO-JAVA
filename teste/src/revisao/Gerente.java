package revisao;

public class Gerente extends Funcionario {

	private Integer id;

	public Gerente(String nome, String cpf, Integer id) {
		super(nome, cpf);
		this.id = id;
	}

	@Override
	public String toString() {
		return  super.toString()+ "\nId: " + id ;
	}
	
	

	

	
	
	
	
	
}

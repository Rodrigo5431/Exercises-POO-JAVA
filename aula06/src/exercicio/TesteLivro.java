package exercicio;

public class TesteLivro {

	public static void main(String[] args) {
		Livro livro = new Livro("Rodrigo", "Java", 85.0) ;
		Livro livro2 = new Livro ("Gabriel" , "O pequeno príncipe" , 98. ) ;
		livro.reajuste();
		
		Operacao operacao = new Operacao("Venda", livro);
		operacao.venderLivro();
		Operacao operacao2 = new Operacao("Emprestimo", livro);
		operacao2.emprestarLivro();
		
		
		
		
		System.out.println(operacao);
		System.out.println(operacao2);
		
	}

	
}
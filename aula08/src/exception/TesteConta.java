package exception;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("2304", 2000.);
		
		try {
			cc.deposito(0.);
			cc.saque(200.);
			System.out.println(cc);	
			
		} catch (ContaException e) {
			System.err.println(e.getMessage());
		}
		finally {
			System.out.println(cc);
		}
	
	}
}

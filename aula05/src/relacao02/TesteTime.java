package relacao02;

public class TesteTime {
	public static void main(String[] args) {

		Atleta a1 = new Atleta("Rodrigo", 19);
		Atleta a2 = new Atleta("Lucas", 20);
		Atleta a3 = new Atleta("Roni", 21);		
				
		Time time1 = new Time("Flamengo", new Atleta[3]);

		time1.adiconarAtleta(a1);
		time1.adiconarAtleta(a2);
		time1.adiconarAtleta(a3);
		
		time1.mostrarTime();
		
	}
}

package exercicio2;

public class Time {

	private String nomeTime;
	private String diretor;
	private String tecnico;
	private Atleta atleta;

	public Time(String nomeTime, String diretor, String tecnico, Atleta atleta) {
		super();
		this.nomeTime = nomeTime;
		this.diretor = diretor;
		this.tecnico = tecnico;
		this.atleta = atleta;
	}

	@Override
	public String toString() {
		return "Time: " + nomeTime + "\ndiretor=" + diretor +
				"\ntecnico=" + tecnico + atleta;
	}
	

}

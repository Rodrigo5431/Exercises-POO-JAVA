package enumeradores;

public class Turma {

	private Integer numero;
	private PeriodoCurso periodoCurso;

	public Turma(Integer numero, PeriodoCurso periodoCurso) {
		super();
		this.numero = numero;
		this.periodoCurso = periodoCurso;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public PeriodoCurso getPeriodoCurso() {
		return periodoCurso;
	}

	public void setPeriodoCurso(PeriodoCurso periodoCurso) {
		this.periodoCurso = periodoCurso;
	}

}

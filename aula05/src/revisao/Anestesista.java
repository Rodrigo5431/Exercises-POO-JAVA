package revisao;

public class Anestesista extends Medico {
	private String TipoAnestesia;

	public Anestesista(String nome, String nomeMedico, String crm, String tipoAnestesia) {
		super(nome, nomeMedico, crm);
		TipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {
		return "Anestesia: " + TipoAnestesia + ", Medico: " + super.toString();
	}

	public String getTipoAnestesia() {
		return TipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		TipoAnestesia = tipoAnestesia;
	}
	@Override
	public Double calcularPagamento() {
		
		return valorPago = super.calcularPagamento() + 2000;
	}
	
}

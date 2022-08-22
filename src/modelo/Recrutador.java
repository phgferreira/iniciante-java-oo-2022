package modelo;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Recrutador extends Pessoa {

	List<Date> diasEHorariosDisponiveis;
	
	public Recrutador(String nome) {
		super(nome);
	}
	
	public Recrutador(String nome, List<Date> diasEHorariosDisponiveis) {
		this(nome);
	}
	
	public Entrevista agendaEntrevista(Candidato candidato) {
		Entrevista entrevistaMarcada = new Entrevista(marcaNoDiaDisponivel(), this, candidato);
		return entrevistaMarcada;
	}
	
	private Date marcaNoDiaDisponivel() {
		Date diaSelecionado = this.diasEHorariosDisponiveis.get(0);
		this.diasEHorariosDisponiveis.remove(0);
		return diaSelecionado;
	}

	public boolean avaliaCandidato(Candidato candidato) {
		boolean avaliacao = new Random().nextBoolean();
		System.out.println("Avaliação do candidato " + candidato.getNome() + " = " + avaliacao);
		return avaliacao;
	}
	
	public List<Date> getDiasEHorariosDisponiveis() {
		return diasEHorariosDisponiveis;
	}

	public void setDiasEHorariosDisponiveis(List<Date> diasEHorariosDisponiveis) {
		this.diasEHorariosDisponiveis = diasEHorariosDisponiveis;
	}

}

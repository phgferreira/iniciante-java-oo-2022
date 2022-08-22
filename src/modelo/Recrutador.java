package modelo;
import java.util.Date;
import java.util.List;
import java.util.Random;

import excessao.SemDiaDisponivelException;

public class Recrutador extends Pessoa {

	List<Date> diasEHorariosDisponiveis;
	
	public Recrutador(String nome) {
		super(nome);
	}
	
	public Recrutador(String nome, List<Date> diasEHorariosDisponiveis) {
		this(nome);
		this.diasEHorariosDisponiveis = diasEHorariosDisponiveis;
	}
	
	public Entrevista agendaEntrevista(Candidato candidato) throws SemDiaDisponivelException {
		Entrevista entrevistaMarcada = new Entrevista(marcaNoDiaDisponivel(), this, candidato);
		return entrevistaMarcada;
	}
	
	private Date marcaNoDiaDisponivel() throws SemDiaDisponivelException {
		// Se não tiver dia disponível lança excessão
		if (this.diasEHorariosDisponiveis.size() == 0) {
			throw new SemDiaDisponivelException();
		}
		// Se tiver dia disponível retorna o próximo dia e remove da lista de dias disponíveis
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

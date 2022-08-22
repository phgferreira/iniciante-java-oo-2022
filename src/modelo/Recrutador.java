package modelo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import excessao.SemDiaDisponivelException;

public class Recrutador extends Pessoa {

	// Caso não receba dias disponíveis no construtor, então começa instanciado porém vazio
	List<Date> diasEHorariosDisponiveis = new ArrayList<Date>();
	
	List<Entrevista> entrevistas = new ArrayList<Entrevista>();
	
	List<Aprendiz> aprendizes = new ArrayList<Aprendiz>();
	
	public Recrutador(String nome) {
		super(nome);
	}
	
	public Recrutador(String nome, List<Date> diasEHorariosDisponiveis) {
		this(nome);
		this.diasEHorariosDisponiveis = diasEHorariosDisponiveis;
	}
	
	// ############# CÓDIGO DA REGRA DE NEGÓCIO #############
	public void agendaEntrevista(Candidato candidato) throws SemDiaDisponivelException {
		Entrevista entrevistaMarcada = new Entrevista(marcaNoDiaDisponivel(), this, candidato);
		System.out.println(entrevistaMarcada.toString());
		this.entrevistas.add(entrevistaMarcada);
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
	
	public List<Aprendiz> realizaEntrevistasAgendadas() {
		for (Entrevista entrevista : entrevistas) {
			// Realiza cada entrevista agendada
			System.out.println("INICIADA " + entrevista.toString());
			boolean aprovado = avaliaCandidato(entrevista.getCandidato());
			System.out.println("TERMINADA " + entrevista.toString());
			
			// Se candidato foi aprovado insere como aprendiz na lista de aprendizes aprovados pelo recrutador
			if (aprovado) {
				this.aprendizes.add( new Aprendiz(entrevista.getCandidato()) );
				System.out.println("Candidato " + entrevista.getCandidato().getNome() + " APROVADO por " + this.getNome());
			} else
				System.out.println("Candidato " + entrevista.getCandidato().getNome() + " REPROVADO por " + this.getNome());
				
		}
		return this.aprendizes;
	}
	
	public boolean avaliaCandidato(Candidato candidato) {
		// Retorna um dado aletório e fictício
		return new Random().nextBoolean();
	}
	// ######################################################
	
	public List<Date> getDiasEHorariosDisponiveis() {
		return diasEHorariosDisponiveis;
	}

	public void setDiasEHorariosDisponiveis(List<Date> diasEHorariosDisponiveis) {
		this.diasEHorariosDisponiveis = diasEHorariosDisponiveis;
	}

}

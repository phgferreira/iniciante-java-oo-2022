package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import excessao.ProcessoSeletivoException;
import excessao.SemDiaDisponivelException;

public class ProcessoSeletivo {

	private List<Candidato> candidatos;
	private List<Recrutador> recrutadores;
	private List<Aprendiz> aprendizes = new ArrayList<Aprendiz>();
	
	private boolean concluido = false;

	public ProcessoSeletivo(List<Candidato> candidatos, List<Recrutador> recrutadores) {
		this.candidatos = candidatos;
		this.recrutadores = recrutadores;
	}

	public void executa() {
		
		// AGENDAMENTO DE ENTREVISTAS
		for (int i = 0; i < candidatos.size(); i++) {

			// Escolhe um recrutador ... 
			int indiceDoRecrutadorEscolhido = new Random().nextInt( this.recrutadores.size() );
			Recrutador recrutadorEscolhido = this.recrutadores.get( indiceDoRecrutadorEscolhido );

			// ... e tenta fazer o agendamento
			try {
				recrutadorEscolhido.agendaEntrevista(this.candidatos.get(i));

				// ... se não tiver dia disponível então remove recrutador da lista e continua o agendamento
			} catch (SemDiaDisponivelException e) {
				this.recrutadores.remove(indiceDoRecrutadorEscolhido);

				// Volta o indice para o candidato que não conseguiu marcar tentar novamente
				i--;
			}
		}
		
		// REALIZACAO DAS ENTREVISTAS COM A LISTA DE APRENDIZES PRONTA NO FINAL
		for (Recrutador recrutador : recrutadores) {
			this.aprendizes.addAll( recrutador.realizaEntrevistasAgendadas() );
		}
		
		// Depois de executado muda o status para concluído
		concluido = true;
		
	}

	public List<Candidato> getCandidatos() {
		return candidatos;
	}

	public void setCandidatos(List<Candidato> candidatos) {
		if (concluido)
			throw new ProcessoSeletivoException("Processo seletivo já realizado: não pode mais alterar a lista de candidatos");
		this.candidatos = candidatos;
	}

	public List<Recrutador> getRecrutadores() {
		return recrutadores;
	}

	public void setRecrutadores(List<Recrutador> recrutadores) {
		if (concluido)
			throw new ProcessoSeletivoException("Processo seletivo já realizado: não pode mais alterar a lista de recrutadores");
		this.recrutadores = recrutadores;
	}

	public List<Aprendiz> getAprendizes() {
		if (!concluido)
			throw new ProcessoSeletivoException("Processo seletivo ainda não foi executado: lista de aprendizes vazia");
		return aprendizes;
	}

	// Não faz sentido mudar a lista de aprendizes porque no início ela está vazia e depois ela já foi definida pelos recrutadores

	public boolean isConcluido() {
		return concluido;
	}
	
	// Variável concluído não pode ser alterado externamente
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import excessao.SemDiaDisponivelException;
import modelo.Aprendiz;
import modelo.Candidato;
import modelo.Recrutador;

public class IniciaMovimentoCodar {

	public static void main(String[] args) {

		// CANDIDATOS E RECRUTADORES
		List<Candidato> candidatos = DadosAleatorios.geraListaDeCandidatos();
		List<Recrutador> recrutadores = DadosAleatorios.geraListaDeRecrutador();

		// AGENDAMENTO DE ENTREVISTAS
		for (int i = 0; i < candidatos.size(); i++) {

			// Escolhe um recrutador ... 
			int indiceDoRecrutadorEscolhido = new Random().nextInt( recrutadores.size() );
			Recrutador recrutadorEscolhido = recrutadores.get( indiceDoRecrutadorEscolhido );

			// ... e tenta fazer o agendamento
			try {
				recrutadorEscolhido.agendaEntrevista(candidatos.get(i));

				// ... se não tiver dia disponível então remove recrutador da lista e continua o agendamento
			} catch (SemDiaDisponivelException e) {
				recrutadores.remove(indiceDoRecrutadorEscolhido);

				// Volta o indice para o candidato que não conseguiu marcar tentar novamente
				i--;
			}
		}
		
		// REALIZACAO DAS ENTREVISTAS COM A LISTA DE APRENDIZES PRONTA NO FINAL
		List<Aprendiz> aprendizes = new ArrayList<Aprendiz>();
		for (Recrutador recrutador : recrutadores) {
			aprendizes.addAll( recrutador.realizaEntrevistasAgendadas() );
		}
		
		
		// Abertura da turma
		
		// Andamento da turma (loop de modulos)
		
		// Termina a turma
	}
}

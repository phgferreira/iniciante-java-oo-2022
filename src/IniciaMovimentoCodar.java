import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import excessao.SemDiaDisponivelException;
import modelo.Candidato;
import modelo.Entrevista;
import modelo.Recrutador;

public class IniciaMovimentoCodar {

	public static void main(String[] args) {

		// Candidatos e Recrutadores
		List<Candidato> candidatos = DadosAleatorios.geraListaDeCandidatos();
		List<Recrutador> recrutadores = DadosAleatorios.geraListaDeRecrutador();

		// Agendamento de entrevistas
		List<Entrevista> entrevistas = new ArrayList<Entrevista>();
		for (int i = 0; i < candidatos.size(); i++) {

			// Escolhe um recrutador ...
			int indiceDoRecrutadorEscolhido = new Random().nextInt( recrutadores.size() );
			Recrutador recrutadorEscolhido = recrutadores.get( indiceDoRecrutadorEscolhido );

			// ... e tenta fazer o agendamento ...
			try {
				Entrevista entrevistaMarcada = recrutadorEscolhido.agendaEntrevista(candidatos.get(i));
				entrevistas.add(entrevistaMarcada);
				System.out.println(entrevistaMarcada.toString());

				// ... se não tiver dia disponível então remove recrutador da lista e continua o agendamento
			} catch (SemDiaDisponivelException e) {
				recrutadores.remove(indiceDoRecrutadorEscolhido);

				// Volta o indice para o candidato que não conseguiu marcar tentar novamente
				i--;
			}
		}
		
		// Abertura da turma
		
		// Andamento da turma (loop de modulos)
		
		// Termina a turma
	}
}

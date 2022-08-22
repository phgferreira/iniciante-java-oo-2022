import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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
		for (Candidato candidato : candidatos) {
			Recrutador recrutadorEscolhido = recrutadores.get( new Random().nextInt( recrutadores.size()-1 ) );
			Entrevista entrevistaMarcada = recrutadorEscolhido.agendaEntrevista(candidato);
			entrevistas.add(entrevistaMarcada);
			System.out.println(entrevistaMarcada.toString());
		}
		
		// Abertura da turma
		
		// Andamento da turma (loop de modulos)
		
		// Termina a turma
	}
}

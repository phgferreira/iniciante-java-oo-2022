import java.util.List;

import modelo.Aprendiz;
import modelo.Candidato;
import modelo.ProcessoSeletivo;
import modelo.Recrutador;

public class IniciaMovimentoCodar {

	public static void main(String[] args) {

		// CANDIDATOS E RECRUTADORES
		List<Candidato> candidatos = DadosAleatorios.geraListaDeCandidatos();
		List<Recrutador> recrutadores = DadosAleatorios.geraListaDeRecrutador();
		
		ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(candidatos, recrutadores);
		processoSeletivo.executa();
		List<Aprendiz> aprendizes = processoSeletivo.getAprendizes();
		System.out.println("Lista de aprendizes com " + aprendizes.size() + " participantes");
		
		// Abertura da turma
		
		// Andamento da turma (loop de modulos)
		
		// Termina a turma
	}
}

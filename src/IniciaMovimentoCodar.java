import java.util.List;

import modelo.Aprendiz;
import modelo.Candidato;
import modelo.ProcessoSeletivo;
import modelo.Recrutador;
import modelo.Turma;

public class IniciaMovimentoCodar {

	public static void main(String[] args) {

		// Etapa inicial => Processo seletivo
		List<Candidato> candidatos = DadosAleatorios.geraListaDeCandidatos();
		List<Recrutador> recrutadores = DadosAleatorios.geraListaDeRecrutador();
		
		ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(candidatos, recrutadores);
		processoSeletivo.executa();
		List<Aprendiz> aprendizes = processoSeletivo.getAprendizes();
		System.out.println("Lista de aprendizes com " + aprendizes.size() + " participantes");
		
		// Constroi a turma
		Turma turma = new Turma(DadosAleatorios.geraMentorLider(), aprendizes);
		turma.setMentores(DadosAleatorios.geraListaDeMentores());
		turma.setRecrutadores(recrutadores);
		
		turma.inicia();
		
		System.out.println("MOVIMENTO CODAR CONCLUÍDO");
		
		// Andamento da turma (loop de modulos)
		
		// Termina a turma
	}
}

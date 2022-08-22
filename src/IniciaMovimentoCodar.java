import java.text.ParseException;

import modelo.Aprendiz;
import modelo.DadosAleatorios;
import modelo.MentorLider;
import modelo.Modulo;
import modelo.ProcessoSeletivo;
import modelo.Recrutador;
import modelo.Turma;

public class IniciaMovimentoCodar {

	public static void main(String[] args) throws ParseException {

		Recrutador recrutadoraHelena = new Recrutador("Helena");
		MentorLider lider = new MentorLider("Vinicius Ueda");
		
		ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(recrutadoraHelena, DadosAleatorios.geraListaCandidatos());
		processoSeletivo.agendamentoDasEntrevistas();
		processoSeletivo.realizaAsEntrevistas();

		Turma turma = new Turma(lider, processoSeletivo.getRecrutador().getAprendizes());
		turma.setRecrutadores(recrutadoraHelena);
		
		for (Modulo modulo : lider.getModulos()) {
			lider.passaOProximoModulo(turma);
			for (Aprendiz aprendiz : turma.getAprendizes()) {
				for (String conhecimento : modulo.getConhecimento()) {
					aprendiz.absorveConhecimento(conhecimento);
				}
			}
		}
		
	}
}

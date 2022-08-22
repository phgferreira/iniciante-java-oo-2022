import java.text.ParseException;

import modelo.DadosAleatorios;
import modelo.MentorLider;
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
		lider.passaOProximoModulo(turma);
		
	}
}

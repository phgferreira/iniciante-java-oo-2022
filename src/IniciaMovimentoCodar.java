import java.text.ParseException;

import modelo.DadosAleatorios;
import modelo.ProcessoSeletivo;
import modelo.Recrutador;

public class IniciaMovimentoCodar {

	public static void main(String[] args) throws ParseException {

		Recrutador recrutadoraHelena = new Recrutador("Helena");
		ProcessoSeletivo processoSeletivo = new ProcessoSeletivo(recrutadoraHelena, DadosAleatorios.geraListaCandidatos());
		processoSeletivo.agendamentoDasEntrevistas();
		processoSeletivo.realizaAsEntrevistas();
		processoSeletivo.criaTurma();
		
	}
}

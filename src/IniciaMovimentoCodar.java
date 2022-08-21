import java.text.ParseException;
import java.util.List;

import modelo.Aprendiz;
import modelo.DadosAleatorios;
import modelo.Recrutador;

public class IniciaMovimentoCodar {

	public static void main(String[] args) throws ParseException {
		Recrutador helena = new Recrutador("Helena");
		helena.procuraCandidatos(DadosAleatorios.pessoasParaCandidatura());
		helena.agendaEntrevistas();
		List<Aprendiz> aprendizes = helena.realizaEntrevistas();
		System.out.println("Recrutamento concluido com " + aprendizes.size() + " selecionados");
	}
}

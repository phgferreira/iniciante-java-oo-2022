import java.util.ArrayList;
import java.util.List;

import modelo.Candidato;

public class DadosAleatorios {

	public static List<Candidato> geraListaDeCandidatos() {
		List<Candidato> candidados = new ArrayList<Candidato>();
		candidados.add(new Candidato("Miguel"));
		candidados.add(new Candidato("Arthur"));
		candidados.add(new Candidato("Gael"));
		candidados.add(new Candidato("Heitor"));
		candidados.add(new Candidato("Theo"));
		candidados.add(new Candidato("Davi"));
		candidados.add(new Candidato("Gabriel"));
		candidados.add(new Candidato("Bernardo"));
		candidados.add(new Candidato("Sanuel"));
		candidados.add(new Candidato("João Miguel"));
		return candidados;
	}
	
	public static List<Recrutador> geraListaDeRecrutador() {
		List<Recrutador> recrutadores = new ArrayList<Recrutador>();
		recrutadores.add(new Recrutador("Amanda Martinez"));
		recrutadores.add(new Recrutador("Jessica Cestaro"));
		return recrutadores;
	}
}

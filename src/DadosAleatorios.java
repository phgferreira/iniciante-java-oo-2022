import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.Candidato;
import modelo.Mentor;
import modelo.MentorLider;
import modelo.Recrutador;

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
		try {
			recrutadores.add(new Recrutador("Amanda Martinez", geraListaDeDiasEHorariosDisponiveis("01/07/2022")));
			recrutadores.add(new Recrutador("Jessica Cestaro", geraListaDeDiasEHorariosDisponiveis("02/07/2022")));
		} catch (ParseException e) {
			recrutadores.add(new Recrutador("Amanda Martinez"));
			recrutadores.add(new Recrutador("Jessica Cestaro"));
			e.printStackTrace();
		}
		return recrutadores;
	}
	
	public static List<Date> geraListaDeDiasEHorariosDisponiveis(String dia) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		List<Date> dias = new ArrayList<Date>();
		dias.add(format.parse(dia + " 08:00"));
		dias.add(format.parse(dia + " 08:30"));
		dias.add(format.parse(dia + " 09:00"));
		dias.add(format.parse(dia + " 09:30"));
		dias.add(format.parse(dia + " 10:00"));
		dias.add(format.parse(dia + " 10:30"));
		dias.add(format.parse(dia + " 11:00"));
		dias.add(format.parse(dia + " 11:30"));
		return dias;
	}
	
	public static MentorLider geraMentorLider() {
		MentorLider lider = new MentorLider("Vinicius Ueda");
		return lider;
	}
	
	public static List<Mentor> geraListaDeMentores() {
		List<Mentor> mentores = new ArrayList<Mentor>();
		mentores.add(new Mentor("Gabriel"));
		mentores.add(new Mentor("Camila"));
		mentores.add(new Mentor("Portiolli"));
		return mentores;
	}
}

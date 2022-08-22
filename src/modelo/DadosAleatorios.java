package modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DadosAleatorios {

	public static List<Candidato> geraListaCandidatos() {
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

	// Usado na classe Recrutador
	public static List<Date> geraDiasEHorariosAleatorios() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		List<Date> dias = new ArrayList<Date>();
		dias.add(format.parse("01/08/2022 09:00"));
		dias.add(format.parse("01/08/2022 09:30"));
		dias.add(format.parse("01/08/2022 10:00"));
		dias.add(format.parse("01/08/2022 10:30"));
		dias.add(format.parse("01/08/2022 11:00"));
		dias.add(format.parse("01/08/2022 11:30"));
		dias.add(format.parse("02/08/2022 12:30"));
		dias.add(format.parse("02/08/2022 13:00"));
		dias.add(format.parse("02/08/2022 13:30"));
		dias.add(format.parse("02/08/2022 14:00"));
		dias.add(format.parse("02/08/2022 14:30"));
		return dias;
	}

}

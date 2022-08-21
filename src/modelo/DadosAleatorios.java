package modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DadosAleatorios {

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

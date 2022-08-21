package modelo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DadosAleatorios {

	private static List<Interesse> geraInteressesAleatorios1() {
		List<Interesse> interesses = new ArrayList<Interesse>();
		interesses.add(Interesse.APRENDER);
		interesses.add(Interesse.INGRESSAR_NA_BLUESOFT);
		interesses.add(Interesse.REDE);
		return interesses;
	}
	private static List<Interesse> geraInteressesAleatorios2() {
		List<Interesse> interesses = new ArrayList<Interesse>();
		interesses.add(Interesse.APRENDER);
		interesses.add(Interesse.DESENVOLVER_SISTEMA);
		interesses.add(Interesse.INTERNET);
		return interesses;
	}
	private static List<Interesse> geraInteressesAleatorios3() {
		List<Interesse> interesses = new ArrayList<Interesse>();
		interesses.add(Interesse.INTERNET);
		interesses.add(Interesse.REDE);
		interesses.add(Interesse.SUPORTE_MAQUINA);
		return interesses;
	}
	public static List<Interesse> geraInteressesRecrutadorProcura() {
		List<Interesse> interesses = new ArrayList<Interesse>();
		interesses.add(Interesse.APRENDER);
		interesses.add(Interesse.DESENVOLVER_SISTEMA);
		interesses.add(Interesse.INGRESSAR_NA_BLUESOFT);
		return interesses;
	}
	
	public static List<Pessoa> pessoasParaCandidatura() {
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		pessoas.add(new Pessoa("Miguel", geraInteressesAleatorios1()));
		pessoas.add(new Pessoa("Arthur", geraInteressesAleatorios2()));
		pessoas.add(new Pessoa("Gael", geraInteressesAleatorios3()));
		pessoas.add(new Pessoa("Heitor", geraInteressesAleatorios1()));
		pessoas.add(new Pessoa("Theo", geraInteressesAleatorios2()));
		pessoas.add(new Pessoa("Davi", geraInteressesAleatorios3()));
		pessoas.add(new Pessoa("Gabriel", geraInteressesAleatorios1()));
		pessoas.add(new Pessoa("Bernardo", geraInteressesAleatorios2()));
		pessoas.add(new Pessoa("Sanuel", geraInteressesAleatorios3()));
		pessoas.add(new Pessoa("João Miguel", geraInteressesAleatorios1()));
		return pessoas;
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

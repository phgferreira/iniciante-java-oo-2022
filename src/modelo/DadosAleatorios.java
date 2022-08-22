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
	
	public static List<Modulo> geraModulos() {
		List<Modulo> modulos = new ArrayList<Modulo>();
		
		Modulo modulo1 = new Modulo("Introdução a programação");
		modulo1.getConhecimento().add("5 dúvidas de quem quer iniciar na carreira de programação");
		modulo1.getConhecimento().add("Como começar a sua carreira como desenvolvedor de software");
		modulo1.getConhecimento().add("Arquitetura de computadores");
		modulo1.getConhecimento().add("Lógica de programação");
		modulo1.getConhecimento().add("Git e Github");
		modulos.add(modulo1);

//		Modulo modulo2 = new Modulo("Front-end");
//		modulo2.getConhecimento().add("HTML5 e CSS3 parte 1");
//		modulo2.getConhecimento().add("HTML5 e CSS3 parte 2");
//		modulo2.getConhecimento().add("HTML5 e CSS3 parte 3");
//		modulo2.getConhecimento().add("HTML5 e CSS3 parte 4");
//		modulo2.getConhecimento().add("Javascript para Web");
//		modulos.add(modulo2);
//		
//		Modulo modulo3 = new Modulo("Back-end - Java e OO");
//		modulo3.getConhecimento().add("Java JRE e JDK");
//		modulo3.getConhecimento().add("Java OO");
//		modulo3.getConhecimento().add("Java Polimorfismo");
//		modulo3.getConhecimento().add("Java Exceções");
//		modulo3.getConhecimento().add("Clean Code");
//		modulos.add(modulo3);
		
		return modulos;
	}

}

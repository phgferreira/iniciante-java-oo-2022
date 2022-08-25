import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import modelo.Candidato;
import modelo.Mentor;
import modelo.MentorLider;
import modelo.Modulo;
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
		MentorLider lider = new MentorLider("Vinicius Ueda", geraListaDeModulos());
		return lider;
	}
	
	private static List<Modulo> geraListaDeModulos() {
		List<Modulo> modulos = new ArrayList<Modulo>();

		List<String> conteudoDoModulo1 = new ArrayList<String>();
		conteudoDoModulo1.add("5 dúvidas de quem quer iniciar na carreira de programação");
		conteudoDoModulo1.add("Como começar a sua carreira como desenvolvedor de software");
		conteudoDoModulo1.add("Arquitetura de computadores: por trás de como seu programa funciona");
		conteudoDoModulo1.add("Jogos clássicos parte 1: Iniciando no Javascript com Pong");
		conteudoDoModulo1.add("Jogos clássicos parte 2: laços e listas com Javascript");
		conteudoDoModulo1.add("Praticando lógica de programação com URI e HackerRank");
		conteudoDoModulo1.add("Git e Github: repositório, commit e versões");
		modulos.add(new Modulo("Iniciante em Programação", conteudoDoModulo1));

		List<String> conteudoDoModulo2 = new ArrayList<String>();
		conteudoDoModulo2.add("O que é front-end e back-end?");
		conteudoDoModulo2.add("HTML, CSS e Javascript, quais são as diferenças?");
		conteudoDoModulo2.add("HTML5 e CSS3 parte 1: A primeira página da web");
		conteudoDoModulo2.add("HTML 5 e CSS3 parte 2: Posicionamento, listas e navegação");
		conteudoDoModulo2.add("HTML5 e CSS3 parte 3: Trabalhando com formulários e tabelas");
		conteudoDoModulo2.add("HTML5 e CSS3 parte 4: Avançando no CSS");
		conteudoDoModulo2.add("Javascript para Web: Crie páginas dinâmicas");
		conteudoDoModulo2.add("Acessibilidade web: crie designs inclusivos");
		modulos.add(new Modulo("Front-End - Criando suas primeiras páginas web", conteudoDoModulo2));

		List<String> conteudoDoModulo3 = new ArrayList<String>();
		conteudoDoModulo3.add("Java JRE e JDK: compile e execute seu programa");
		conteudoDoModulo3.add("Java OO: Entendendo a Orientação a Objetos");
		conteudoDoModulo3.add("Java Polimorfismo: Entenda herança e interfaces");
		conteudoDoModulo3.add("O que são Enums no Java?");
		conteudoDoModulo3.add("O que são Anotações no Java?");
		conteudoDoModulo3.add("Java Exceções: Aprenda a criar, lançar e controlar exceções");
		conteudoDoModulo3.add("O que é Clean Code?");
		conteudoDoModulo3.add("Como não aprender Java e Orientação a Objetos: getters e setters");
		conteudoDoModulo3.add("Como não aprender orientação a objetos: o excesso de ifs");
		conteudoDoModulo3.add("Como não aprender orientação a objetos: Herança");
		modulos.add(new Modulo("Back-End - Java e orientação a objetos básico", conteudoDoModulo3));
		
		return modulos;
	}
	
	public static List<Mentor> geraListaDeMentores() {
		List<Mentor> mentores = new ArrayList<Mentor>();
		mentores.add(new Mentor("Gabriel"));
		mentores.add(new Mentor("Camila"));
		mentores.add(new Mentor("Portiolli"));
		return mentores;
	}
}

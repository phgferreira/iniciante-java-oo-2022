package modelo;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

public class Recrutador extends Pessoa implements Organizador {
	
	private List<Candidato> candidatos;
	
	private List<Entrevista> entrevistas;
	
	private List<Date> diasDisponiveis;

	public Recrutador(String nome) throws ParseException {
		super(nome);
		this.diasDisponiveis = DadosAleatorios.geraDiasEHorariosAleatorios();
	}
	
	public void procuraCandidatos(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			// Transforma uma pessoa em um candiadato
			Candidato candidato = new Candidato(pessoa);
			candidatos.add(candidato);
		}
	}
	
	public int verificaInteresseDaPessoa(Pessoa pessoa) {
		int nivelInteresse = 0;
		for (Interesse interesse : pessoa.getInteresses() ) {
			if (interesse == Interesse.APRENDER || interesse == Interesse.DESENVOLVER_SISTEMA) {
				nivelInteresse++;
			}
			if (interesse == Interesse.INTERESSES_RUINS)
				return 0;
		}
		return nivelInteresse;
	}
	
	public void agendaEntrevistas() {
		for (Candidato candidato : this.candidatos) {
			Entrevista entrevista = new Entrevista(getProximoDiaDisponivel(), this, candidato);
			this.entrevistas.add(entrevista);
		}
	}

	@Override
	public void iniciaConferencia(Conferencia conferencia) {
		conferencia.iniciaConferencia();
	}

	@Override
	public void coordenaConferencia(Conferencia conferencia) {
		
	}

	@Override
	public void terminaConfererencia(Conferencia conferencia) {
		conferencia.terminaConferencia();
	}
	
	private Date getProximoDiaDisponivel() {
		Date diaSelecionado = this.diasDisponiveis.get(0);
		this.diasDisponiveis.remove(0);
		return diaSelecionado;
		
	}

}

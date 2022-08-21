package modelo;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Recrutador extends Pessoa implements Organizador {
	
	private List<Candidato> candidatos = new ArrayList<Candidato>();
	
	private List<Entrevista> entrevistas = new ArrayList<Entrevista>();
	
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

	public void agendaEntrevistas() {
		for (Candidato candidato : this.candidatos) {
			Entrevista entrevista = new Entrevista(getProximoDiaDisponivel(), this, candidato);
			this.entrevistas.add(entrevista);
		}
	}
	
	public List<Aprendiz> realizaEntrevistas() {
		List<Aprendiz> aprendizes = new ArrayList<Aprendiz>();
		for (Candidato candidato : this.candidatos) {
			int nivelInteresseNecessario = DadosAleatorios.geraInteressesRecrutadorProcura().size() / 2;
			if (verificaNivelDeInteresseDaPessoa(candidato) > nivelInteresseNecessario) {
				Aprendiz aprendiz = new Aprendiz(candidato);
				aprendizes.add(aprendiz);
			}
		}
		return aprendizes;
	}
	
	private int verificaNivelDeInteresseDaPessoa(Pessoa pessoa) {
		int nivelInteresse = 0;
		for (Interesse interessePessoa : pessoa.getInteresses() ) {
			for (Interesse interesseRecrutadorProcura : DadosAleatorios.geraInteressesRecrutadorProcura() )
				if (interessePessoa == interesseRecrutadorProcura) {
					nivelInteresse++;
				}
		}
		return nivelInteresse;
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

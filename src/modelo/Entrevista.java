package modelo;

import java.util.Date;

public class Entrevista {

	private Date dataEHora;
	
	private Recrutador recrutador;
	
	private Candidato candidato;
	
	public Entrevista(Date dataEHora, Recrutador recrutador, Candidato candidato) {
		this.dataEHora = dataEHora;
		this.recrutador = recrutador;
		this.candidato = candidato;
	}
	
	@Override
	public String toString() {
		return "Entrevista do " + recrutador.getNome() + " com o candidato " + candidato.getNome() + " marcado para " + dataEHora;
	}

	public Date getDataEHora() {
		return dataEHora;
	}

	public void setDataEHora(Date dataEHora) {
		this.dataEHora = dataEHora;
	}

	public Recrutador getRecrutador() {
		return recrutador;
	}

	public void setRecrutador(Recrutador recrutador) {
		this.recrutador = recrutador;
	}

	public Candidato getCandidato() {
		return candidato;
	}

	public void setCandidato(Candidato candidato) {
		this.candidato = candidato;
	}
	
}

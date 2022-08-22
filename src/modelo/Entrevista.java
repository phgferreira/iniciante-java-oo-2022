package modelo;

import javax.xml.crypto.Data;

public class Entrevista {

	private Data dataEHora;
	
	private Recrutador recrutador;
	
	private Candidato candidato;

	public Entrevista(Data dataEHora, Recrutador recrutador, Candidato candidato) {
		this.dataEHora = dataEHora;
		this.recrutador = recrutador;
		this.candidato = candidato;
	}

	public Data getDataEHora() {
		return dataEHora;
	}

	public void setDataEHora(Data dataEHora) {
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

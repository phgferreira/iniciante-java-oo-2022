package modelo;

import java.util.Date;

public class Entrevista extends Conferencia {

	public Entrevista(Date dataEHoraMarcada, Recrutador recrutador, Candidato candidato) {
		super(dataEHoraMarcada, recrutador);
		super.adicionaParticipante(candidato);
	}

}

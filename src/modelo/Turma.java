package modelo;

import java.util.List;

public class Turma {

	private MentorLider lider;
	
	private List<Mentor> mentores;
	
	private List<Aprendiz> aprendizes;
	
	private Recrutador recrutador;
	
	public Turma(MentorLider lider, List<Aprendiz> aprendizes) {
		this.lider = lider;
		this.aprendizes = aprendizes;
	}

	public MentorLider getLider() {
		return lider;
	}

	public void setLider(MentorLider lider) {
		this.lider = lider;
	}

	public List<Mentor> getMentores() {
		return mentores;
	}

	public void setMentores(List<Mentor> mentores) {
		this.mentores = mentores;
	}

	public List<Aprendiz> getAprendizes() {
		return aprendizes;
	}

	public void setAprendizes(List<Aprendiz> aprendizes) {
		this.aprendizes = aprendizes;
	}

	public Recrutador getRecrutadores() {
		return recrutador;
	}

	public void setRecrutadores(Recrutador recrutador) {
		this.recrutador = recrutador;
	}
	
	
}

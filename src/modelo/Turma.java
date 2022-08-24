package modelo;

import java.util.List;

public class Turma {

	MentorLider lider;
	List<Mentor> mentores;
	List<Aprendiz> aprendizes;
	List<Recrutador> recrutadores;
	
	public Turma(MentorLider lider, List<Aprendiz> aprendizes) {
		this.lider = lider;
		this.aprendizes = aprendizes;
	}
	
	public void inicia() {
		System.out.println("Turma iniciada com mentor líder " + lider.getNome() + " e " + aprendizes.size() + " aprendizes");
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

	public List<Recrutador> getRecrutadores() {
		return recrutadores;
	}

	public void setRecrutadores(List<Recrutador> recrutadores) {
		this.recrutadores = recrutadores;
	}
	
	
}

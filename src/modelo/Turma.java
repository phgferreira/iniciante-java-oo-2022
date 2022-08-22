package modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private MentorLider lider;
	
	private List<Modulo> modulos = new ArrayList<Modulo>();
	
	private List<Mentor> mentores;
	
	private List<Aprendiz> aprendizes;
	
	private Recrutador recrutador;
	
	public Turma(MentorLider lider, List<Aprendiz> aprendizes) {
		this.lider = lider;
		this.aprendizes = aprendizes;
	}
	
	public void liberaModulo(Modulo modulo) {
		this.modulos.add(modulo);
	}
	
	public int numeroUltimoModulo() {
		return this.modulos.size();
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

	public Recrutador getRecrutador() {
		return recrutador;
	}

	public void setRecrutador(Recrutador recrutador) {
		this.recrutador = recrutador;
	}
	
	
}

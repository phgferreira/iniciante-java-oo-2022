package modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	MentorLider lider;
	List<Mentor> mentores;
	List<Aprendiz> aprendizes;
	List<Recrutador> recrutadores;
	// Lista de módulos começa instanciado porém vazio porque com o passar do tempo serão adicionados módulos nessa lista
	List<Modulo> modulos = new ArrayList<Modulo>();
	
	public Turma(MentorLider lider, List<Aprendiz> aprendizes) {
		this.lider = lider;
		this.aprendizes = aprendizes;
	}
	
	public void inicia() {
		System.out.println("Turma iniciada com mentor líder " + lider.getNome() + " e " + aprendizes.size() + " aprendizes");
		
		Modulo modulo = lider.liberaProximoModulo(this);
		
		// Momento em que os aprendizes absorvem o conteúdo do modulo e transformam esse conteúdo em conhecimento próprio
		for (Aprendiz aprendiz : this.aprendizes) {
			aprendiz.absorveConhecimento(modulo.getConteudo());
			System.out.println(aprendiz.getNome() + " adquiriu " + aprendiz.getConhecimento().size() + " de conhecimento e " + aprendiz.getDuvidas().size() + " de dúvidas");
		}
		
		// Momento em que os aprendizes tiram as dúvidas
		
		
	}

	public MentorLider getLider() {
		return lider;
	}

	public void setLider(MentorLider lider) {
		this.lider = lider;
		// Como o lider também é um mentor, ele é adicionado nessa lista
		this.mentores.add(lider);
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

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
}

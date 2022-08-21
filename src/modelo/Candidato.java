package modelo;

import java.util.List;

public class Candidato extends Pessoa {

	public Candidato(String nome) {
		super(nome);
	}
	
	public List<Interesse> apresentaCandidatura() {
		return super.getInteresses();
	}

}

package modelo;

import java.util.List;

public class Candidato extends Pessoa {

	public Candidato(Pessoa pessoa) {
		super(pessoa.getNome());
		super.setConhecimento(pessoa.getConhecimento());
		super.setInteresses(pessoa.getInteresses());
	}
	
	public List<Interesse> apresentaCandidatura() {
		return super.getInteresses();
	}

}

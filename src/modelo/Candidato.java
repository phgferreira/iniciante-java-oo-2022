package modelo;

import java.util.List;

public class Candidato extends Pessoa {

	public Candidato(Pessoa pessoa) {
		super(pessoa.getNome(), pessoa.getInteresses());
		super.setConhecimento(pessoa.getConhecimento());
	}
	
	public List<Interesse> apresentaCandidatura() {
		return super.getInteresses();
	}

}

package modelo;

public class Aprendiz extends Pessoa {

	public Aprendiz(Candidato candidato) {
		super(candidato.getNome());
		super.setConhecimento(candidato.getConhecimento());
		super.setInteresses(candidato.getInteresses());
	}

}

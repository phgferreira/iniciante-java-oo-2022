package modelo;

public class Aprendiz extends Pessoa {

	public Aprendiz(Candidato candidato) {
		super(candidato.getNome());
	}
	
	public void absorveConhecimento(String conhecimento) {
		super.getConhecimento().add(conhecimento);
		System.out.println("Aprendiz " + this.getNome() + " aprendeu " + conhecimento);
	}
}

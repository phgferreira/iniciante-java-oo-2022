package modelo;
import java.util.Random;

public class Recrutador extends Pessoa {

	public Recrutador(String nome) {
		super(nome);
	}
	
	public boolean avaliaCandidato(Candidato candidato) {
		boolean avaliacao = new Random().nextBoolean();
		System.out.println("Avaliação do candidato " + candidato.getNome() + " = " + avaliacao);
		return avaliacao;
	}

}

package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aprendiz extends Pessoa {

	List<String> conhecimento = new ArrayList<String>();
	List<String> duvidas = new ArrayList<String>();
	
	public Aprendiz(Candidato candidato) {
		super(candidato.getNome());
	}
	
	public void absorveConhecimento(List<String> conteudo) {
		for (String item : conteudo) {
			// Se o conteudo for absorvido corretamente então se transforma em conhecimento
			boolean conteudoAbsorvido = new Random().nextBoolean();
			if(conteudoAbsorvido)
				this.conhecimento.add(item);
			// Senão transforma-se em conhecimento então transforma-se em dúvida
			else
				this.duvidas.add(item);
		}
	}
	
	public void resolveDesafio(String desafio) {
		// O desafio aprimora o seu conhecimento
		this.conhecimento.add(desafio);
		System.out.println("Desafio " + desafio + " resolvido pelo " + this.getNome());
	}
	
	public List<String> getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(List<String> conhecimento) {
		this.conhecimento = conhecimento;
	}

	public List<String> getDuvidas() {
		return duvidas;
	}

	public void setDuvidas(List<String> duvidas) {
		this.duvidas = duvidas;
	}

}

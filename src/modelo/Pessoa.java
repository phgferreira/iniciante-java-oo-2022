package modelo;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	
	private List<String> conhecimento = new ArrayList<>();
	
	public Pessoa (String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<String> getConhecimento() {
		return conhecimento;
	}

	public void setConhecimento(List<String> conhecimento) {
		this.conhecimento = conhecimento;
	}

}

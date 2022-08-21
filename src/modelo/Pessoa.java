package modelo;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

	private String nome;
	
	private List<String> conhecimento = new ArrayList<>();
	
	private List<Interesse> interesses;
	
	public Pessoa (String nome) {
		this.nome = nome;
	}
	
	public Pessoa(String nome, List<Interesse> interesses) {
		this(nome);
		this.interesses = interesses;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<String> getConhecimento() {
		return conhecimento;
	}
	
	public void setConhecimento(List<String> conhecimento) {
		this.conhecimento = conhecimento;
	}
	
	public List<Interesse> getInteresses() {
		return interesses;
	}
	
	public void setInteresses(List<Interesse> interesses) {
		this.interesses = interesses;
	}
}

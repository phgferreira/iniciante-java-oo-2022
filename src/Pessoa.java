import java.util.List;

public class Pessoa {

	private String nome;
	
	private List<String> conhecimento;
	
	private List<Interesse> interesses;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public List<String> getConhecimento() {
		return conhecimento;
	}
	
	public List<Interesse> getInteresses() {
		return interesses;
	}
}

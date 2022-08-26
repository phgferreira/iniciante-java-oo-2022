package modelo;

import java.util.List;

public class Modulo {
	
	private String titulo;
	
	private List<String> conteudo;
	private String desafio;
	
	public Modulo(String titulo, List<String> conteudo) {
		this.titulo = titulo;
		this.conteudo = conteudo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getConteudo() {
		return conteudo;
	}

	public void setConteudo(List<String> conteudo) {
		this.conteudo = conteudo;
	}

	public String getDesafio(MentorLider lider) {
		// Eu sei que a lógica ficou meio redundânte mas o objetivo era mostrar que somente um líder pode pegar o desafio de um módulo
		if (lider instanceof MentorLider)
			return desafio;
		return null;
	}

	public void setDesafio(String desafio, MentorLider lider) {
		if (lider instanceof MentorLider)
			this.desafio = desafio;
	}

}

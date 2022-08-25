package modelo;

import java.util.List;

public class Modulo {
	
	private String titulo;
	
	private List<String> conteudo;
	
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

}

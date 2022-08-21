package modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conferencia {

	private Date dataEHoraMarcada;
	
	private Organizador organizador;
	
	private List<Pessoa> participantes = new ArrayList<Pessoa>();
	
	private boolean conferenciaAberta = false;
	
	// ########### CONSTRUTORES ###########
	
	public Conferencia(Date dataEHoraMarcada, Organizador organizador) {
		this.dataEHoraMarcada = dataEHoraMarcada;
		this.organizador = organizador;
	}
	
	public Conferencia(Date dataEHoraMarcada, Organizador organizador, List<Pessoa> participantes) {
		this(dataEHoraMarcada, organizador);
		this.participantes = participantes;
	}
	
	// ########### PARTICIPANTES ###########
	
	public void adicionaParticipante(Pessoa pessoa) {
		this.participantes.add(pessoa);
	}
	
	public void removeParticipante(Pessoa pessoa) {
		this.participantes.remove(pessoa);
	}
	
	// ########### INICIA E TERMINA CONFERENCIA ########### 
	
	public void iniciaConferencia() {
		System.out.println("Conferencia iniciada");
		this.conferenciaAberta = true;
	}
	
	public void terminaConferencia() {
		System.out.println("Termina conferencia");
		this.conferenciaAberta = false;
	}
	
	// ########### GETTERS E SETTERS ###########
	
	public Date getDataEHoraMarcada() {
		return dataEHoraMarcada;
	}
	
	public void setDataEHoraMarcada(Date dataEHoraMarcada) {
		this.dataEHoraMarcada = dataEHoraMarcada;
	}
	
	public Organizador getOrganizador() {
		return organizador;
	}
	
	public void setOrganizador(Organizador organizador) {
		this.organizador = organizador;
	}

	public boolean isConferenciaAberta() {
		return conferenciaAberta;
	}

}

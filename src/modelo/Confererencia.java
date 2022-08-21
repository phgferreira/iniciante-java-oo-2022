package modelo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Confererencia {

	private Calendar dataEHoraMarcada;
	
	private Organizador organizador;
	
	private List<Pessoa> participantes = new ArrayList<Pessoa>();
	
	private boolean conferenciaAberta = false;
	
	// ########### CONSTRUTORES ###########
	
	public Confererencia(Calendar dataEHoraMarcada, Organizador organizador) {
		this.dataEHoraMarcada = dataEHoraMarcada;
		this.organizador = organizador;
	}
	
	public Confererencia(Calendar dataEHoraMarcada, Organizador organizador, Pessoa participante) {
		this(dataEHoraMarcada, organizador);
		this.participantes.add(participante);
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
	
	public Calendar getDataEHoraMarcada() {
		return dataEHoraMarcada;
	}
	
	public void setDataEHoraMarcada(Calendar dataEHoraMarcada) {
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

package modelo;

import java.util.List;

public class Recrutador extends Pessoa {
	
	private List<Candidato> candidatos;
	
	//private List<Entrevista> entrevistas;

	public Recrutador(String nome) {
		super(nome);
	}
	
	public void procuraCandidatos(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			// Transforma uma pessoa em um candiadato
			Candidato candidato = new Candidato(pessoa);
			candidatos.add(candidato);
		}
	}
	
	public int verificaInteresseDaPessoa(Pessoa pessoa) {
		int nivelInteresse = 0;
		for (Interesse interesse : pessoa.getInteresses() ) {
			if (interesse == Interesse.APRENDER || interesse == Interesse.DESENVOLVER_SISTEMA) {
				nivelInteresse++;
			}
			if (interesse == Interesse.INTERESSES_RUINS)
				return 0;
		}
		return nivelInteresse;
	}

}

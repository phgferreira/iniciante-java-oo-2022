package modelo;

import java.util.List;

/**
 * Todo o MentorLider precisa ter 
 * 
 * @param nome
 * @param conhecimento
 */
public class MentorLider extends Mentor {
	
	List<Modulo> modulos;
	
	public MentorLider(String nome, List<Modulo> modulos) {
		super(nome);
		this.modulos = modulos;
	}

	public List<Modulo> getModulos() {
		return modulos;
	}

	public void setModulos(List<Modulo> modulos) {
		this.modulos = modulos;
	}
	
	// Percorre a lista de módulos do mentor e verifica se na turma já não foi passado esse módulo, caso não seja retorna modulo
	public Modulo liberaProximoModulo(Turma turma) {
		for (Modulo modulo : this.modulos) {
			/* Eu sei que poderia ter resolvido tendo apenas um índice que acompanha a evolução dos módulos mas
			 * dessa forma é possível resolver problemas de conflitos de módulos na turma mesmo tendo alterado a lista de módulos
			 * no decorrer do movimento codar
			 */
			if (!turma.getModulos().contains(modulo))
				return modulo;
		}
		return null;
	}

}

package excessao;

public class PoucosCandidatosAprovadosException extends Exception {

	public PoucosCandidatosAprovadosException(int minimoNecessario) {
		super("O mínimo exigido para esse processo seletivo é " + minimoNecessario);
	}
}

package exception;

public class BiblioException extends Exception {

	public BiblioException() {
		this("Erreur générique sur applicatif Biblio");
	}

	public BiblioException(String msg) {
		super(msg);
	}
}

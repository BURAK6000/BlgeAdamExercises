package bilgeadamweek7.trycatch.ornek1;

public class EksiDegerException extends RuntimeException {

	String msj;

	public EksiDegerException(String message) {
		super();
		this.msj = message;
	}

	public String getMessage() {
		return msj;
	}

	public void setMessage(String message) {
		this.msj = message;
	}

	public String getMjs(String message) {

		return getMessage();

	}

}

package work10;

public class SpecificException extends RuntimeException {

	public SpecificException() {
	}

	public SpecificException(String message) {
		super(message);
	}

	public SpecificException(Throwable cause) {
		super(cause);
	}

	public SpecificException(String message, Throwable cause) {
		super(message, cause);
	}

	public SpecificException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

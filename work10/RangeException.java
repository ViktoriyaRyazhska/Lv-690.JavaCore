package work10;

public class RangeException extends RuntimeException {

	public RangeException() {
	}

	public RangeException(String message) {
		super(message);
	}

	public RangeException(Throwable cause) {
		super(cause);
	}

	public RangeException(String message, Throwable cause) {
		super(message, cause);
	}

	public RangeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}

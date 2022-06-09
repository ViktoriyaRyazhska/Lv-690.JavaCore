package ls11;

public class NegativeNumberException extends Exception {
	public NegativeNumberException() {
		super("Negative Number Exception!");
	}
	
	public NegativeNumberException (String massage) {
		super(massage);
	}

}

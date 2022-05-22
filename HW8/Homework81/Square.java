package Homework81;

public class Square implements Shape {
	private String squareName;
	
	public Square(String squareName) {
		this.squareName = squareName;
	}

	@Override
	public String get() {
		return squareName;
	}



}

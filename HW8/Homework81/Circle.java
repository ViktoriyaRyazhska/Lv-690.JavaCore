package Homework81;

public class Circle implements Shape {
	private String circleName;

	public Circle(String circleName) {
		this.circleName = circleName;
	}

	@Override
	public String get() {
		return circleName;
	}

}

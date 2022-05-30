package ls8.Wrapper;


public class Square implements Shape {
	private double a;

	public Square(double a) {		
		this.a = a;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	@Override
	public double getArea() {		
		return a * a;
	}

	@Override
	public String toString() {
		String template = "Sguare a = %.2f, Area = %.2f";
		return String.format(template, a, getArea());
	}
	
	
}

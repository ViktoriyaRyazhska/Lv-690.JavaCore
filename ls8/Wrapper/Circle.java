package ls8.Wrapper;

public class Circle implements Shape{
	private double r;

	public Circle(double r) {	
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {		
		return Math.PI * r * r;
	}

	@Override
	public String toString() {
		String template = "Circle r = %.2f, Area = %.2f";
		return String.format(template, getR(), getArea());
	}
	
	
}

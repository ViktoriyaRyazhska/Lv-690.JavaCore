package homework5_practical;

public class ColorLine extends Line{
	private String color;
	
	public ColorLine(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return null;
		
	}
	
	public void print() {
		System.out.println("ColorLine color= "+color);
	}
	
}

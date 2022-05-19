package ls6.Task6;

public class ColorLine extends Line {
	private String color;
		
	public ColorLine(Point point1, Point point2, String color) {
		super(point1, point2);
		this.setColor(color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	@Override
	public String toString() {
		return "ColorLine [color=" + color + ", getPoint1()=" + getPoint1() + ", getPoint2()=" + getPoint2() + "]";
	}


	
	
}

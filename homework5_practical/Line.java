package homework5_practical;

public class Line {
	private Point point1;
	private Point point2;
	
	protected Line() {
		
	}
	
	public Line(Point point1, Point point2) {
		super();
		this.point1 = point1;
		this.point2 = point2;
	}

	@Override
	public String toString() {
		return null;
		
	}
	
	public void print() {
		System.out.println("Line = point1- "+point1.toString()+" "+point2.toString());
	}
}

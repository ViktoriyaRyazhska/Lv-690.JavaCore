package homework5_practical;

public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point x= "+x+" y= "+y;
		
	}
	
	public void print() {
		System.out.println("Point = x"+x+", y = "+y);
	}
}

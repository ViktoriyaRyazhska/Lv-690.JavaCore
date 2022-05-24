package homework5_practical;

public class MainTask2 {
	public static void main(String[] args) {
		Point point1 = new Point(1,2);
		Point point2 = new Point(3,4);
		Line line1 = new Line(point1,point2);
		ColorLine colorLine1 = new ColorLine("Blue");
		Line line[] = new Line[] {line1,colorLine1};
		for(Line element:line) {
			element.print();
		}
	}
}

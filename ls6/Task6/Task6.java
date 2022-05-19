package ls6.Task6;

public class Task6 {

	public static void main(String[] args) {
				
		Car[] cars = new Car[4];
		cars[0] = new Sedan("Renault Megane", 160, 2015, 5);
		cars[1] = new Sedan("Mersedes Vito", 190, 2018, 9);
		cars[2] = new Truck("Volvo",150, 2015, 40000);
		cars[3] = new Truck("Scania", 160, 2018, 45000);
		
		for (Car car : cars) {
			System.out.println(car);
			System.out.println(car.run());
			System.out.println(car.stop());
		}
		
		System.out.println();		
		
		Line[] lines = new Line[4];
		lines[0] = new Line(new Point(5, 5),new Point(6, 6));
		lines[1] = new ColorLine(new Point(1, 1), new Point(3, 3), "Blue");
		lines[2] = new Line(new Point(1, 0), new Point(0, 5));
		lines[3] = new ColorLine(new Point(9, -5), new Point(-4, -6), "Red");

		for (Line line : lines) {
			System.out.println(line);
		}
	}

}

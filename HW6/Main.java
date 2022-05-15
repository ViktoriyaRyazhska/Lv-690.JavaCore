package Homework6;

public class Main {

	private static final boolean True = false;

	public static void main(String[] args) {
		Car[] cars = {
				new Sedan("Volvo", 240, 1995),
				new Truck("Mack", 160, 2010),
				new Sedan("VW", 220, 1999),
				new Sedan("Opel", 200, 2000),
				new Sedan("Renault", 210, 2018)
		};
		for (int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
		System.out.println();
		//
		Line[] lines = {
				new Line(new Point(1,2), new Point(7,9)),
				new ColorLine(new Point(1,2), new Point(7,9), "red"),
				new ColorLine(new Point(1,2), new Point(7,9), "green"),
				new Line(new Point(1,2), new Point(7,9))
		};
		for (int i=0; i<lines.length; i++) {
			lines[i].Print();
		}
		System.out.println();
		//
		Bird[] birds = {
				new Chicken(true, true),
				new Eagle(true, true),
				new Penguin(false, true),
				new Swallow(false, true)
		};
		for (int i=0; i<birds.length; i++) {
			birds[i].Print();
		}
		System.out.println();
		//
		Employee[] employees = {
				new Employee("John", 30, 1000),
				new Employee("Nick", 31, 1800),
				new Developer("Mary", 28, 1500),
				new Developer("Lisa", 19, 1200),
		};
		for (int i=0; i<employees.length; i++) {
			employees[i].Print();
		}
		
		
	}

}

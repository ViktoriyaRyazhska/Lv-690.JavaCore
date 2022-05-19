package ls6.Homework6;

public class Homework6 {

	public static void main(String[] args) {
		Bird[] birds = new Bird[4];
		birds[0] = new Eagle("Contur", 3, "Wild nature", false);
		birds[1] = new Swallow("Contur", 5, "Near people", true);
		birds[2] = new Penguin("Down", 2, false, true);
		birds[3] = new Chicken("Down and bristles", 10, true, false);
		
		for (int i = 0; i < birds.length; i++) {
			birds[i].fly();
		}

		
		Employee e = new Employee("Taras", 32, 33534.35);
		System.out.println(e.report());
		Employee d = new Developer("Andrii", 31, 35653.34, "Average Java developer");
		System.out.println(d.report());
	}
	
	

}

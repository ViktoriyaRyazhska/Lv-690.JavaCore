package work5.task2;

public class Demonstrating {

	public static void main(String[] args) {
		Employee first = new Employee("Tony", 26, 1268.3);
		Developer second = new Developer("Andry", 34, 2564.22, "java-developer");
		System.out.println(first.report());
		System.out.print(second.report());
	}

}

package HW5;

import java.util.ArrayList;
import java.util.List;

public class DevsMain {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		list.add(new Employee("OLeg", 22, 1250));
		list.add(new Employee("Andrew", 28, 1600));
		list.add(new Employee("Anna", 19, 1000));
		list.add(new Devs("Mark", 22, 2000, "C++ developer"));
		list.add(new Devs("Viktor", 36, 3500, "C# developer"));
		list.add(new Devs("Alex", 34, 2200, "HTML developer"));

		for (Employee i : list) {
			System.out.println(i.report());
		}
	}
}

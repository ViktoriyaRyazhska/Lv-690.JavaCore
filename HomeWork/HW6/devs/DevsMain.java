//2. Support we have a class Employee
//Create a Developer class that extends the Employee class. 
//Creates a String field and a constructor to initialize all fields in the Developer class.
//Also in the Developer class, override the method report() so that it returns a string with information about the developer, for example:
//Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
//If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance. Create an instance of the Employee and Developer class and print in the console information about them using report() method. 


package HW6.devs;

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


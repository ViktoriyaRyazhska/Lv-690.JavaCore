package Homework7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		Animal[] animals = {
				new Cat(),
				new Dog()
		};
		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i].feed());
			System.out.println(animals[i].voice());
		}
		System.out.println();
		//
		Person[] persons = {
				new Teacher("Mary",5000),
				new Student("John"),
				new Cleaner("Rachel",1000)
		};
		for (int i=0; i<persons.length; i++) {			
			persons[i].print();
		}
		System.out.println();
		//
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(new SalariedEmployee(1, "78", 5200));
		list.add(new SalariedEmployee(2, "56", 15000));
		list.add(new ContractEmployee(3, "34", 180, 10));
		list.add(new ContractEmployee(4, "12", 120, 8));
		Collections.sort(list);
		for (Employee employee : list) {
			System.out.println(employee.getInfo());
		}
	}

}

package ls3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// Practical task	
		Employee e1 = new Employee("Andrii", 100, 10);
		System.out.println(e1);
		System.out.println("salary= " + e1.getSalary());
		System.out.println("Total sum= " + Employee.totalSum);
		e1.changeRate(200);
		System.out.println(e1);
		System.out.println("salary= " + e1.getSalary());
		System.out.println("Total sum= " + Employee.totalSum);
		System.out.println();
		
		Employee e2 = new Employee("Anna", 300);
	    e2.setHours(5);
	    System.out.println("salary= " + e2.getSalary());
	    System.out.println(e2);
		System.out.println("Total sum= " + Employee.totalSum);
		e2.changeRate(400);
		System.out.println(e2);
		System.out.println("salary= " + e1.getSalary());
		System.out.println("Total sum= " + Employee.totalSum);
		System.out.println();
		
		Employee e3 = new Employee();
		e3.setName("Margaryta");
		e3.setRate(200);
		e3.setHours(2);;
		System.out.println(e3);
		System.out.println("salary= " + e3.getSalary());
		System.out.println("Total sum= " + Employee.totalSum);
		e3.changeRate(500);
		e3.setHours(6);
		System.out.println("salary= " + e3.getSalary());
		System.out.println("Total sum= " + Employee.totalSum);
		System.out.println();
		
	// Homework
		Person p1 = new Person("Volodymyr", "Ivanenko");
		p1.setBirthYear(1984);
		System.out.println("Person information= " + p1.output());
		System.out.println("Person age= " + p1.getAge());
		p1.changeName("Ivan", "Petrovych");
		p1.setBirthYear(1948);
		System.out.println("Person information= " + p1.output());
		System.out.println("Person age= " + p1.getAge());
		System.out.println();
		
		Person p2 = new Person("Oleksandr", "Venglowskiy");
		p2.setBirthYear(1991);
		System.out.println("Person information= " + p2.output());
		System.out.println("Person age= " + p2.getAge());
		System.out.println();
		
		Person p3 = new Person();
		p3.setFirsName("Oleksandr");
		p3.setLastName("Yagodynskiy");
		p3.setBirthYear(1966);
		System.out.println("Person information= " + p3.output());
		System.out.println("Person age= " + p3.getAge());
		System.out.println();
		
		Person p4 = new Person();
		p4.setFirsName("Anatoliy");
		p4.setLastName("Yuriyovych");
		p4.setBirthYear(1955);
		System.out.println("Person information= " + p4.output());
		System.out.println("Person age= " + p4.getAge());
		p4.input(br);
		System.out.println("Person information= " + p4.output());
		System.out.println("Person age= " + p4.getAge());
		System.out.println();
		
		Person p5 = new Person();
		p5.input(br);
		System.out.println("Person information= " + p5.output());
		System.out.println("Person age= " + p5.getAge());
	}

}

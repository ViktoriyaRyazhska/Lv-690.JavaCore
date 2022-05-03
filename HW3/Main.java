package Homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		int task = Integer.parseInt(Read("Task № (1,2): "));
		if (task == 1) {
			Employee e1 = new Employee("John", 1, 5);
			Employee e2 = new Employee("Sam",  2, 4);
			Employee e3 = new Employee("Mike", 3, 3);
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);		
			System.out.println("Total sum is: "+Employee.totalSum);
			e1.changeHours(1); //optional
			e2.changeRate(6);
			e3.changeRate(2);
			System.out.println(e1);
			System.out.println(e2);
			System.out.println(e3);		
			System.out.println("Total sum is: "+Employee.totalSum);
		}
		if (task == 2) {
			Person p1 = new Person("John", "Silver"); p1.setAge(1970);
			Person p2 = new Person("Mike", "Tyson"); p2.setAge(1980);
			Person p3 = new Person("Vasua", "Pupkin"); p3.setAge(1990);
			Person p4 = new Person("Will", "Smith"); p4.setAge(2000);
			Person p5 = new Person("Morgan", "Freeman"); p5.setAge(2010);
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);		
			System.out.println(p4);		
			System.out.println(p5);		
		}
	}
	
	public static String Read(String q) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(q);
		try {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
}


}

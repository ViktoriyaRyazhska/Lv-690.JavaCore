package homework8;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(4,"Bob"));
		students.add(new Student(2,"Jonh"));
		students.add(new Student(2,"Vova"));
		students.add(new Student(3,"Ivan"));
		students.add(new Student(1,"Petro"));
		
		Collections.sort(students,new CompCourse());
		
		for(Student element1 :students) {
			System.out.println(element1.getName() + " - " + element1.getCourse() + " course");
		}
		Collections.sort(students,new CompName());
		
		for(Student element1 :students) {
			System.out.println(element1.getName() + " - " + element1.getCourse() + " course");
		}
	}
	
}

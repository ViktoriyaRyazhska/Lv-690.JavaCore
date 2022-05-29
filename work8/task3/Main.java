package work8.task3;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Set<Student> students = new TreeSet<>(Student.nameComparator);
		
		students.add(new Student("Elsa",3));
		students.add(new Student("Tom",4));
		students.add(new Student("Jerry",1));
		students.add(new Student("Anna",2));
		students.add(new Student("John",2));
		
		for (Student s: students) {
            System.out.println(s);
        }
		
		System.out.println();
		
		Set<Student> s1 = new TreeSet<>(Student.courseComparator);
		s1.addAll(students);
		for (Student s: s1) {
            System.out.println(s);
        }
	}

}

package ls9.Homework_3;
/*
 * Write class Student that provides information about the name of the student and his course. 
 * Class Student should consist of
 * - properties for access to these fields
 * - constructor with parameters
 * - method printStudents (List students, Integer course), which receives 
 *   a list of students and the course number and prints to the console 
 *   the names of the students from the list, which are taught in this course (use an iterator)
 * - methods to compare students by name and by course
 * -In the main() method 
 *   declare List students and add to the list five different students
 *   display the list of students ordered by name
 *   display the list of students ordered by course.
 */


import java.util.LinkedList;
import java.util.List;
import ls8.Homework_Task_1.FullName;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new LinkedList<>();
		students.add(new Student(new FullName("Anatoliy", "Voitenco"), 4));		
		students.add(new Student(new FullName("Bogdan", "Kulyk"), 5));
		students.add(new Student(new FullName("Oleksiy", "Vasylenko"), 2));
		students.add(new Student(new FullName("Volodymyr", "Kravchuk"), 1));
		students.add(new Student(new FullName("Anatoliy", "Olishevskiy"), 3));
	
		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("Sorted by name");
		
		Student.sortName(students);

		for (Student student : students) {
			System.out.println(student);
		}
		System.out.println();
		System.out.println("Sorted by course");
		
		Student.sortCourse(students);
		for (Student student : students) {
			System.out.println(student);
		}
		
		System.out.println();
		Student.printStudent(students, 3);
		

	}
	

}

package ls9.Homework_3;



import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import ls8.Homework_Task_1.FullName;

public class Student {
	private FullName fullName;
	private int course;
	
	public Student(FullName fullName, int course) {		
		this.fullName = fullName;
		this.course = course;
	}

	public FullName getFullName() {
		return fullName;
	}

	public int getCourse() {
		return course;
	}

	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	public void setCourse(int course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [" + fullName.getFirstName() + " " + fullName.getSecondName() + ", course: " + course + "]";
	}
	
	public static void printStudent(List<Student> students, Integer course) {		
		Iterator<Student> iterator = students.iterator();
		while (iterator.hasNext()) {
			Student student = iterator.next();
			if (student.getCourse() == course) {
				System.out.println(student);
			}			
		}
		
		
		
	}
	
	// sorted by firstName
	public static List<Student> sortName(List<Student> students) {
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {				
				return s1.getFullName().getFirstName().compareTo(s2.getFullName().getFirstName());
			}			
		});
		return students;
	}
	
	// sorted by course
	public static List<Student> sortCourse(List<Student> students) {
		students.sort(new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getCourse() - s2.getCourse();
			}
			
		});
		return students;
	}
}

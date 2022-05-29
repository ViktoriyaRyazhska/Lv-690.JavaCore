package work8.task3;

import java.util.*;

public class Student {
	private String name;
    private int course;
    
    
	public Student(String name, int course) {
		super();
		this.name = name;
		this.course = course;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCourse() {
		return course;
	}
	public void setCourse(int course) {
		this.course = course;
	}
    
	
	public static void printStudents(TreeSet<Student> students, int course) {
        Iterator <Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCourse() == course)
                System.out.println("The student: " + iterator.next().getName() + ", the course " + students);
        }
    }
	
			
		static NameComparator nameComparator = new NameComparator( );
	    static CourseComparator courseComparator = new CourseComparator();

	public static class NameComparator implements Comparator <Student>{
		public int compare(Student o1, Student o2) {
		    return o1.getName().compareTo(o2.getName());
		  }

	}
	public static class CourseComparator implements Comparator <Student>{
		public int compare(Student o1, Student o2) {
		    return o1.getCourse()-o2.getCourse();
		  }
	}
	
	public String toString() {
        return "Student name is " + name + ", course is " + course;
    }
}

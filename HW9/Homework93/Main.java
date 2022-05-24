package Homework93;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("John", 2));
		studentList.add(new Student("John", 1));
		studentList.add(new Student("Mary", 2));
		studentList.add(new Student("Rick", 2));
		studentList.add(new Student("Sam", 1));
		studentList.add(new Student("Poul", 3));
		studentList.add(new Student("Nick", 3));
		studentList.add(new Student("Elsa", 4));
		studentList.add(new Student("Teri", 1));
		studentList.add(new Student("Dan", 1));
		printStudentsOfCourse(studentList, 1); // list of student of 1 course
        System.out.println("");
		
        NameComparator Comp = new NameComparator(0); //0 - sort by name/course, 1 - sort course/name  
        Collections.sort(studentList, Comp);
		printStudentsOfCourse(studentList, 0);	//course=0 - means all students	
        System.out.println("");
		
		Comp.setSortBy(1);
        Collections.sort(studentList, Comp);
		printStudentsOfCourse(studentList, 0);		
		
	}

	
	public static void printStudentsOfCourse(List<Student> list, int course) {
		Iterator<Student> iter = list.iterator();

	      while (iter.hasNext()) {
	    	  Student current = iter.next();
	    	  if (current.getCourse()== course || course==0) {
	            System.out.println(current + " ");
	    	  }
	        }

	}

}

package hm8;

import java.util.ArrayList;
import java.util.Collections;

public class MainStudents {
	public static void main(String[] args) {
		ArrayList <Student> st = new ArrayList<Student>();
		
		st.add(new Student("Oleksii", 5));
		st.add(new Student("Anatoliy", 4));
		st.add(new Student("Yuriy", 2));
		st.add(new Student("Nazar", 3));
		st.add(new Student("Rostyslav", 3));
		Collections.sort(st, new ComparatorName());
		for(Student st1: st) {
			System.out.println(st1.getName() +" "+ st1.getCourse());
		}
		System.out.println();
		Collections.sort(st, new ComparatorCourse());
		
		for(Student st2: st) {
			System.out.println(st2.getName() +" "+ st2.getCourse());
		}
	}

}

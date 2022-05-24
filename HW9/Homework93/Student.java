package Homework93;

import java.util.List;

public class Student {
	private String name;
	private int course;
	public Student(String name, int course) {
		this.name = name;
		this.course = course;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", course=" + course + "]";
	}
	public int getCourse() {
		return course;
	}
	
	public String getName() {
		return name;
	}
	

}

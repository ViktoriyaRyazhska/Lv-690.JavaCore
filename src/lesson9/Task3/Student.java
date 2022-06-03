package lesson9.Task3;

import java.util.Comparator;
import java.util.List;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    public void printStudents(List<Student> students, Integer course) {


        for (Student student : students) {
            if (course == student.course) {
                System.out.println("name: " + student.getName() + " course: " + student.getCourse());

            }
        }
    }

    public void compareByCourse(List<Student> students) {
        students.sort(new CourseComparator());
        for (Student student : students) {
            System.out.println("name: " + student.getName() + " course: " + student.getCourse());
        }
    }

    public void compareByName(List<Student> students) {
        students.sort(new NameComparator());
        for (Student student : students) {
            System.out.println("name: " + student.getName() + " course: " + student.getCourse());
        }
    }
}

class CourseComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return (int) (o1.getCourse() - o2.getCourse());
    }
}

class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}


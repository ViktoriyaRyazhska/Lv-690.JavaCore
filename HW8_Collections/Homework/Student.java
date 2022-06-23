package HW8_Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Student {

    private String name;
    private int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public static void printStudents(ArrayList<Student> list, int c) {

        Iterator <Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCourse() == c)
                System.out.println("Student " + iterator.next().getName() + " is studying on the course " + c);
        }
    }

    public static void printAllStudents(ArrayList<Student> list) {
        for (Student elem: list) {
            System.out.println(elem);
        }
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

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(int course) {
        this.course = course;
    }
}

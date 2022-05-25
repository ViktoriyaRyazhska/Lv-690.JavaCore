package HomeWork.Student;

import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 1));
        students.add(new Student("Peter", 1));
        students.add(new Student("Mack", 2));
        students.add(new Student("Mick", 3));
        students.add(new Student("Nora", 2));

        Student.printStudents(students, 2);
        System.out.println("Sorting by name");
        students.sort(new NameCompare());
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getCourse());
        }
        System.out.println("Sorting by course");
        students.sort(new CourseCompare());
        for (Student s : students) {
            System.out.println(s.getCourse() + " " + s.getName());
        }


    }
}

package HomeWork.Student;
import java.util.List;

public class Student {
    private String name;
    private Integer course;

    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public Integer getCourse() {
        return course;
    }

    public static void printStudents(List<Student> stud, Integer course) {

        for (Student s : stud) {
            if (s.getCourse() == course)
                System.out.println("Student :"+s.getName() + " from course " + s.getCourse());
        }
    }
}

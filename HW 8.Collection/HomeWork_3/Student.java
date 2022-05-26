package HomeWork_3;

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

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public static void printStudents(List<Student> student, Integer courses) {
        for (Student st : student) {
            if (st.getCourse() == courses) {
                System.out.println("   Курс студента:   " + st.getCourse() + "      Ім'я :  " + st.getName());
            }
        }

    }
}

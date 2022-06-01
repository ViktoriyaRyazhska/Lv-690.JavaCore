package Homework.lesson8.task1;

public class Student extends Person{
    private int course;

    public Student(FullName fullName, int age, int course) {
        super(fullName, age);
        this.course = course;
    }

    @Override
    public String info() {
        return super.info() + " Course: " + this.course;
    }
    @Override
    public String activity() {
        return "Study in university";
    }
}

package lesson8.Task1;

public class Student extends Person {
     private int course;


    public Student(FullName fullName, int age, int  course) {
        super(fullName, age);
        this.course=course;
    }
    @Override
    public void info(){
        super.info();
        System.out.println(" course: "+ course);
    }

    @Override
    public String activity() {
        return "I study at university";
           }
}

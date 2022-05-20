package HomeWork.Person;

public class Student extends Person {
    private int course;

    public Student(String firstN, String lastN, int age, int course) {
        super(firstN, lastN, age);
        this.course = course;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String info() {
        return "First name: " + getFirstName() +
                " Last name: " + getLastName() +
                " Age: " + getAge() +
                " Course: " + getCourse();
    }

    @Override
    public String activity() {
        return "I study in university ";
    }


}

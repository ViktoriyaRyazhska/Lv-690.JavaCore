package HomeWork1;

public class Student extends Person{
    private int course;

    public Student(int age, FullName fullName,int course) {
        super(age, fullName);
        this.course=course;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String info() {
        return "Student{" +
                "course=" + course +" Age: "+getAge()+" FirstName: "+getFullName().getFirstName()+" LastName: "+getFullName().getLastName()+
                '}';
    }

    @Override
    public String activity() {
        return "I study at university";
    }
}

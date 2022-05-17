package Practice.person;

public class Student extends Person {

    private final String TYPE_PERSON = "Student";

    public Student(String name, int age) {
        setName(name);
        setAge(age);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println("Name :" + getName() +
                " Position :" + getTYPE_PERSON() +
                " Age :" + getAge());

    }
}

package HW6_OOP2;

public class Student extends Person {
    final String TYPE_PERSON="Student";

    public Student(String name) {
        super(name);
    }
    @Override
    public void print() {
        System.out.println("My name is "+this.getName()+". I'm a "+this.getTYPE_PERSON());
    }
    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }
}

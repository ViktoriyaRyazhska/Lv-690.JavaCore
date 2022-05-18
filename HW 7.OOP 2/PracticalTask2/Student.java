//Create next structure.
//        In abstract class Person with property name, declare abstract method print().
//        In other classes in body of method print() output text “I am a …”.
//        In class Staff declare abstract method salary().
//        In each concrete class create constant TYPE_PERSON.
//        Output type of person in each constructors.
//        Create array of Person and add some Teachers, Cleaners and Students to it.
//        Call method print() for all of it. Call method salary() for all Teachers and Cleaner


package PracticalTask2;

public class Student extends Person {
    private final String TYPE_PERSON="student";
    public Student(String name) {
        super(name);
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println(getName()+" TYPE_PERSON: "+getTYPE_PERSON());
    }
}

//Create next structure.
//        In abstract class Person with property name, declare abstract method print().
//        In other classes in body of method print() output text “I am a …”.
//        In class Staff declare abstract method salary().
//        In each concrete class create constant TYPE_PERSON.
//        Output type of person in each constructors.
//        Create array of Person and add some Teachers, Cleaners and Students to it.
//        Call method print() for all of it. Call method salary() for all Teachers and Cleaner


package PracticalTask2;

public class Cleaner extends Staff{
    private final String TYPE_PERSON="cleaner";
    private int salary;
    public Cleaner(String name,int salary) {
        super(name);
        this.salary=salary;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void salary() {
        System.out.println(getName()+" Salary: "+getSalary());
    }
    public void print(){
        System.out.println(getName()+" TYPE_PERSON: "+getTYPE_PERSON());
    }
}

package HW6_OOP2;

public class Teacher extends Staff {

    final String TYPE_PERSON="Teacher";
    private double salary;

    public Teacher(String name, double salary) {
        super(name);
        this.salary = salary;
    }
    @Override
    public void salary() {
        System.out.println("I have salary "+this.getSalary());
    }
    @Override
    public void print() {
        System.out.println("My name is "+this.getName()+". I'm a "+this.getTYPE_PERSON());
    }
    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    public double getSalary() {
        return salary;
    }
}

package Practice.person;

public class Claener extends Staff {

    private final String TYPE_PERSON = "Cleaner";
    private int salary;

    public Claener(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public String getTYPE_PERSON() {
        return TYPE_PERSON;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public void salary() {
        System.out.println("Name :" + getName() + " Salary :" + getSalary());
    }

    @Override
    public void print() {
        System.out.println("Name :" + getName() +
                " Position :" + getTYPE_PERSON() +
                " Age :" + getAge());

    }
}

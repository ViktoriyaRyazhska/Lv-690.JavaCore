package HW7.prac2;


public class Cleaners extends Staff{
    private final String TYPE_PERSON="cleaner";
    private int salary;
    public Cleaners(String name,int salary) {
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
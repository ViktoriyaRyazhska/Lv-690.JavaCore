package HW5.HTask2;

public class Developer extends Emloyee {
    private String position;

    public Developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return "Name:" +getName() +
                ",Age:"+getAge()+",Position:"
                +getPosition()+",Salary:"+getSalary();
    }

    @Override
    public void print() {
        System.out.println(this.report());
    }
}

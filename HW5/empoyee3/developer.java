package homeWork.empoyee3;

public class developer extends Employee3 {

    private String position;

    public developer(String name, int age, double salary, String position) {
        super(name, age, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    @Override
    public String report() {
        return "Name :" + getName() +
                ",Salary :" + getSalary() +
                ",Position :" + getPosition() +
                ",Age :" + getAge();

    }
    @Override
    public void print()
    {
        System.out.println(this.report());
    }
}

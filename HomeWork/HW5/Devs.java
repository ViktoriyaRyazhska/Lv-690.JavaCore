package HW5;

public class Devs extends Employee{
    private String position;
    public Devs (String name, int age, double salary , String position ){
        super(name , age , salary);
        this.position = position;
    }

    @Override
    public String report(){
        return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f, Position: %s. ", getName() , getAge() , getSalary() , position);

    }
}
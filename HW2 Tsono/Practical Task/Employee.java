//Create Console Application project in Java.
//        Add class Employee to the project.
//        Class Employee should consist of
//        three private fields: name, rate and hours;
//static field totalSum
//        properties for access to these fields;
//default constructor, constructor with 2 parameters (name and rate) and constructor with 3 parameters;
//        methods:
//        getSalary() - to calculate the salary of person (rate * hours)
//        toString() - to output information about employee
//        changeRate(int rate) - to change the rate of some employee and recalculate his salary
//        getBonuses() – to calculate 10% from salary
//        In the method main() create 3 objects of Employee type. Input information about them.
//        Display the total salary of all workers to screen

package projEmployee;

public class Employee {
    static double totalSum;
    private String name;
    private double rate;
    private double hours;




    public Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum +=rate*hours;

    }
    public Employee(String name, double rate) {
        totalSum+=rate*hours;
        this.name = name;
        this.rate = rate;

    }
    public Employee() {
        totalSum+=rate*hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        totalSum-=this.rate*hours;
        this.rate = rate;
        totalSum+=rate*hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum -=rate*this.hours;
        this.hours = hours;
        totalSum+=rate*hours;
    }
    public double getSalaru(){
        return rate*hours;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
    public double getBonuses(){
        return getSalaru()*0.1;
    }
    public void changeRate(double rate){
        setRate(rate);
    }
}

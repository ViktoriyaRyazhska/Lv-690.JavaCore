package HW2;

public class Employee {
    static double totalSum = 0;
    private String name;
    private int rate;
    private int hours;

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum = totalSum + getSalary() +getBonus();
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
        }

    public Employee() {
           }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }
    public void setRate(int rate) {
        this.rate = rate;
        }

    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSalary () {

        return rate*hours;
    }
    public void changeRate (int rate) {
        totalSum -=getSalary();
        this.rate = rate;
        totalSum +=getSalary();
    }
    public double getBonus () {
        double bonus =0.1*getSalary();
        return bonus;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                ", total salary = " +getSalary() +
                ", bonus =" +getBonus()+'}';
    }

}

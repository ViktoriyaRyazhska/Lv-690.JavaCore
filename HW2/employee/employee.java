package employee;

public class employee {

    private String name;
    private int rate;
    private int hours;
    public static int totalSum;

    public employee()
    {

    }

    public employee(String name,int rate){
        this.name = name;
        this.rate = rate;
    }
    public employee(String name,int rate,int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += GetSalary();
    }

    public int GetSalary(){
        return this.rate * this.hours;

    }
    public void ChangeRate(int rate){
        totalSum -= GetSalary();
        this.rate = rate;
        totalSum += GetSalary();
    }

    public int GetBonus(){

        int num1 = GetSalary() / 100;
        int bonus = num1 * 10;
        return bonus;
    }




    @Override
    public String toString(){
        return "Employee [name = " + name +", " +
                "Rate = " + rate +
                ", Hours = " + hours +
                ", Total salary = " + GetSalary() +
                ", Bonus = " + GetBonus() + "]";
    }




}

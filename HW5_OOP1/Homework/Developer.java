package HW5_OOP1_Inheritance;

public class Developer extends Employee2 {
    private String position;

    public Developer(String position) {
        this.position = position;
    }

    public static void main(String[] args) {
       Developer dev = createDev();
       System.out.println(dev.report());
    }
    public static Developer createDev() {
        Developer dev = new Developer("senior");
        dev.setName("John");
        dev.setAge(35);
        dev.setSalary(100000);
        return dev;
    }
    @Override
    public String report() {
       return  "Name: "+this.getName()+", Age: "+this.getAge()+", Position: "+this.getPosition()+", Salary: "+this.getSalary()+"";
    }
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}

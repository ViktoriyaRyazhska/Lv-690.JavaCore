package HomeWork.Employee4;

public class SalariedEmployee extends Employee implements Payment {

    private int salaryPerHour;
    private int hour;
    private String socialSecurityNumber;

    public SalariedEmployee(String name, String socialSecurityNumber, int salaryPerHour, int hour) {
        setEmployee(name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salaryPerHour = salaryPerHour;
        this.hour = hour;

    }

    public int getSalaryPerHour() {
        return salaryPerHour;
    }

    public int getHour() {
        return hour;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public int calculatePay() {
        return getSalaryPerHour() * getHour();
    }

    @Override
    public void getInfo() {
        System.out.println("Name :" + getEmployee() +
                " Security Number :" + getSocialSecurityNumber() +
                " Salary :" + calculatePay());
    }
}

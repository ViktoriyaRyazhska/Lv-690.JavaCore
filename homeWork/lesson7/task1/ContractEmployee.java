package Homework.lesson7.task1;

public class ContractEmployee extends Employee implements Payment {
    private int federalTaxIdMember;
    private double hourlyRate;
    private int hoursWorked;
    private String name;
    private double salary;


    public ContractEmployee(int employeeId, String name, double hourlyRate, int hoursWorked, int federalTaxIdMember) {
        super(employeeId);
        this.name = name;
        this.federalTaxIdMember = federalTaxIdMember;
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public String toString() {
        return "\nContractEmployee{" +
                "federalTaxIdMember='" + federalTaxIdMember + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public double calculatePay() {
        this.salary = this.hourlyRate * this.hoursWorked;
        return this.salary;
    }
}

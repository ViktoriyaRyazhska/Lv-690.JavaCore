package HomeWork.Employee4;

public class ContractEmployee extends Employee implements Payment {

    private int salary;
    private String federalTaxIdMember;

    public ContractEmployee(String name, String federalTaxIdMember, int salary) {
        setEmployee(name);
        this.federalTaxIdMember = federalTaxIdMember;
        this.salary = salary;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
        return salary;
    }

    @Override
    public void getInfo() {
        System.out.println("Name :" + getEmployee() +
                " Federal Tax Id :" + getFederalTaxIdMember() +
                " Salary :" + calculatePay());
    }
}

package HW7.task1;


public class ContractEmployee extends Employee implements Payment{
    private String name;
    private int salary;
    private String federalTaxIdmember;

    public ContractEmployee(String employeeID, String name, int salary, String federalTaxIdmember) {
        super(employeeID);
        this.name = name;
        this.salary = salary;
        this.federalTaxIdmember = federalTaxIdmember;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFederalTaxIdmember() {
        return federalTaxIdmember;
    }

    public void setFederalTaxIdmember(String federalTaxIdmember) {
        this.federalTaxIdmember = federalTaxIdmember;
    }
    public int calculatePlay(){
        return salary;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "name='" + name + '\'' +
                ", salary=" + calculatePlay() +
                ", federalTaxIdmember='" + federalTaxIdmember + '\'' +
                '}';
    }
}
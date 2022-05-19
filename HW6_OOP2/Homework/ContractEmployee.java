package HW6_OOP2;

public class ContractEmployee extends Employee implements Payment {
    private String federalTaxIdMember;
    private int hour;
    private int rate;

    public ContractEmployee(String employeeId,String federalTaxIdMember, int hour, int rate) {
        super(employeeId);
        this.federalTaxIdMember = federalTaxIdMember;
        this.hour = hour;
        this.rate = rate;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    @Override
    public int calculatePay() {
        int s = this.hour*this.rate;
        return s;
    }

    @Override
    public String toString() {
        return "ContractEmployee{" +
                "federalTaxIdMember='" + this.federalTaxIdMember + '\'' +
                ", employeeId='" + getEmployeeId() + '\'' +
                ", salary=" + this.calculatePay() +
                '}';
    }
}

package HW6_OOP2;

public class SalariedEmployee extends Employee implements Payment{
    private String socialSecurityNumber;
    private int fixedMonthPay;

    public SalariedEmployee(String employeeId,String socialSecurityNumber, int fixedMonthPay) {
        super(employeeId);
        this.socialSecurityNumber = socialSecurityNumber;
        this.fixedMonthPay = fixedMonthPay;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getFixedMonthPay() {
        return fixedMonthPay;
    }

    public void setFixedMonthPay(int fixedMonthPay) {
        this.fixedMonthPay = fixedMonthPay;
    }

    @Override
    public int calculatePay() {
        return this.fixedMonthPay;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "socialSecurityNumber='" + this.socialSecurityNumber + '\'' +
                ", employeeId='" + getEmployeeId() + '\'' +
                ", salary=" + this.calculatePay() +
                '}';
    }
}

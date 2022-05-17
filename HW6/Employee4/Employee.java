package HomeWork.Employee4;

public class Employee implements Payment {

    private String employee;

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getEmployee() {
        return employee;
    }

    public void getInfo() {
    }

    @Override
    public int calculatePay() {
        return 0;
    }
}

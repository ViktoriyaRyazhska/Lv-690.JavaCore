package HW7.task1;


public class Employee implements Payment {
    private String employeeId;

    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
   
    @Override
    public int calculatePay() {
        return 0;
    }
}
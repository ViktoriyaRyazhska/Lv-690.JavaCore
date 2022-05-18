package HomeWork1;

public class Employee implements Payment {
    private String employeeID;

    public Employee(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public int calculatePlay() {
        return 0;
    }
}

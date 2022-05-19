package HW6_OOP2;

public abstract class Employee implements Comparable <Employee>,Payment {
    private String employeeId;
    public Employee(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public int compareTo(Employee employee) {
        return Integer.compare(employee.calculatePay(),this.calculatePay());
    }

    public static void printInfoEmployees(Employee[] people){
        for (Employee empl : people) {
            System.out.println(empl);
        }
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

}

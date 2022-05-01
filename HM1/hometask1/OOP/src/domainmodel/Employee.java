package domainmodel;

public class Employee {
    private static int id;
    private int employeeId ;
    private String name;
    private String position;
    private int salary;
    private String departement;



    public Employee(String name, String position, int salary) {
        employeeId = id++;
        this.name = name;
        this.position = position;
        this.salary = salary;

    }

    private Employee(String name, String position, int salary, String departement) {
        this.name = name;
        this.position = position;
        this.salary = salary;
        this.departement = departement;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

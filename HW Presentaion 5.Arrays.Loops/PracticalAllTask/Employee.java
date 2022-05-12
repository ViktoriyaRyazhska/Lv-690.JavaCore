//Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
//        all employees of a certain department (enter department number in the console);
//        arrange workers by the field salary in descending order.


package PracticalAllTask;

import java.util.Scanner;

public class Employee {
    String name;
    int department;
    int salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Roman", 1, 10000);
        Employee e2 = new Employee("Nastia", 2, 12000);
        Employee e3 = new Employee("Igor", 3, 9500);
        Employee e4 = new Employee("Oleh", 4, 7000);
        Employee e5 = new Employee("Solomia", 5, 20000);

        Employee[] employ = {e1, e2, e3, e4, e5};

        displayEmployOfDepartment(employ);
        sortBySalaryDesc(employ);

    }

    public static void displayEmployOfDepartment(Employee[] employ) {
        Employee[] e = employ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of department:");
        int numberOfDepartment = sc.nextInt();
        for (int i = 0; i < e.length; i++) {
            if (numberOfDepartment == e[i].department) {
                System.out.println(e[i]);
            }
        }
    }

    public static void sortBySalaryDesc(Employee[] employ) {
        System.out.println("Display employee by desc salary:");
        Employee[] e = employ;
        String tmpName;
        int tmpDepartment;
        int tmpSalary;
        for (int i = 0; i < e.length - 1; i++) {
            for (int j = i + 1; j < e.length; j++) {
                if (e[i].salary < e[j].salary) {
                    tmpSalary = e[i].salary;
                    tmpName = e[i].name;
                    tmpDepartment = e[i].department;
                    e[i].salary = e[j].salary;
                    e[i].name = e[j].name;
                    e[i].department = e[j].department;
                    e[j].salary = tmpSalary;
                    e[j].name = tmpName;
                    e[j].department = tmpDepartment;
                }
            }
        }
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}


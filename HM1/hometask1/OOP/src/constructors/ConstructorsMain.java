package constructors;

import domainmodel.Employee;




public class ConstructorsMain {
    public static void main(String[] args) {
        Employee employee = new Employee("alex", "developer", 100);
        Employee employee1 = new Employee("Jhon", "developer", 100);

        System.out.println(employee);
        System.out.println(employee1);
    }
}
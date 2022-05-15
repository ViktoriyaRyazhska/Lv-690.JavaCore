package HomeWorkTask2;

import java.util.ArrayList;
import java.util.List;

public class ApplicationEmployeeDeveloper {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Roman", 23, 10000));
        emp.add(new Employee("Igor", 24, 13000));
        emp.add(new Developer("Nastia", 20, 15000, "Programist"));
        emp.add(new Developer("Vita", 25, 5000, "Java-developer"));

        for (Employee e : emp) {
            System.out.println(e.report());
        }
    }
}

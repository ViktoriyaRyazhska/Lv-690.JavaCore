package JavaCore;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeArray {

    public String name;
    public int depNumber;
    private int salary;

    public EmployeeArray(String name, int depNumber, int salary) {
        this.name = name;
        this.depNumber = depNumber;
        this.salary = salary;
    }

    public static void main(String[] args) throws IOException {

        EmployeeArray[] employeeArrays = new EmployeeArray[5];
        employeeArrays[0] = new EmployeeArray("Jack",1,10000);
        employeeArrays[1] = new EmployeeArray("Nick",1,20000);
        employeeArrays[2] = new EmployeeArray("Joe",2,30000);
        employeeArrays[3] = new EmployeeArray("Bob",3,15000);
        employeeArrays[4] = new EmployeeArray("Ruth",2,50000);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = printWithInput("Input number of departure:_",br);

        compareDep(employeeArrays,number);
        sortEmployees(employeeArrays);

    }
    public static void compareDep(EmployeeArray[] employeeArrays, int number){

        boolean bool = false;
        for (EmployeeArray empl: employeeArrays) {
            if (empl.getDepNumber()==number){
                System.out.println(empl.getName()+" is from dep.#"+number);
                bool=true;
            }
        }
        if (bool != true){
            System.out.println("There are nobody employees from dep.#"+number);
        }
        
    }

    public static void sortEmployees(EmployeeArray[] employeeArrays){

        EmployeeArray tmp;

        for (int i = 0; i < employeeArrays.length - 1; i++) {
            for (int j = i + 1; j < employeeArrays.length; j++) {
                if (employeeArrays[i].getSalary() < employeeArrays[j].getSalary()) {
                    tmp = employeeArrays[i];
                    employeeArrays[i] = employeeArrays[j];
                    employeeArrays[j] = tmp;
                }
            }
        }
        for (EmployeeArray empl: employeeArrays) {
            System.out.println(empl);
        }


    }
    public static int printWithInput(String txt, BufferedReader br)throws IOException {

        System.out.println(txt);
        String str = br.readLine();
        return Integer.parseInt(str);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepNumber() {
        return depNumber;
    }

    public void setDepNumber(int depNumber) {
        this.depNumber = depNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "EmployeeArray{" +
                "name='" + name + '\'' +
                ", depNumber=" + depNumber +
                ", salary=" + salary +
                '}';
    }
}

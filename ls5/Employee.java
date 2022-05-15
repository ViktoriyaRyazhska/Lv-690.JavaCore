package ls5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class Employee {
	private String name;
	private int departmentNumber;
	private int salary;
	
	public Employee(String name, int departmentNumber, int salary) {
		super();
		this.name = name;
		this.departmentNumber = departmentNumber;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", departmentNumber=" + departmentNumber + ", salary=" + salary + "]";
	}
	
	public static <E> void employeesOfdepartment (ArrayList<Employee> arrayList, BufferedReader br) throws NumberFormatException, IOException {
		System.out.print("Enter department: ");
		int number = Integer.parseInt(br.readLine());		
		for (int i = 0; i < arrayList.size(); i++) {
			if (arrayList.get(i).getDepartmentNumber() == number) {
				System.out.println(arrayList.get(i));
			} else {
				System.out.println("There is no departament with this number");
				break;
			}
		}
	}
	
	public static <E> void sortSalaryEmployee (ArrayList<Employee> arrayList) {
		Employee tmp;
		for (int i = 0; i < arrayList.size() - 1; i++) {
			for (int j = i + 1; j > arrayList.size(); j++) {
				if (arrayList.get(i).getSalary() > arrayList.get(j).getSalary()) {
					tmp = arrayList.get(i);					
					arrayList.set(i, arrayList.get(j));					
					arrayList.set(j, tmp);
					
				}
			}
		}

	}
	
	public static <E> void printArrayList (ArrayList<Employee> arrayList) {
		for (Employee employee : arrayList) {
			System.out.println(employee);
		}
	}


}

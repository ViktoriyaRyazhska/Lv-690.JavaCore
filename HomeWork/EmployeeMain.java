
public class EmployeeMain {
	 public static void main(String[] args) {

	Employee user1 = new Employee("Steve", 15, 45);
	Employee user2 = new Employee("Kenny", 23, 34);
	Employee user3 = new Employee("Elza", 13, 60);
	Employee[] EmployeesArrays = {user1,user2,user3};
	for(
	int i = 0; i < EmployeesArrays.length; i++);
	{
		
	/*System.out.println(EmployeesArrays [i] );*/
		System.out.println("----------");
	}

	System.out.println("Total sum of all salary is "+Employee.totalSum);
	user1.ChangeRate(34);
	System.out.println("Total sum of all salary is "+Employee.totalSum);

}}
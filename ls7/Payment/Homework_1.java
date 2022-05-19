package ls7.Payment;

import java.util.ArrayList;

/*
 * Create Payment interface with the method calculatePay(), 
 * the base class Employee with a string variable employeeld. 
 * Create two classes SalariedEmployee and ContractEmployee, 
 * which implement interface and are inherited from the base class. 
 * - Describe hourly paid workers in the relevant classes (one of the children), 
 *   and fixed paid workers (second child). 
 * - Describe the string variable socialSecurityNumber in the class SalariedEmployee.
 * - Include a description of federalTaxIdmember in the class of ContractEmployee.
 * - The calculation formula for the "time-worker“ is: the average monthly 
 *	    salary = hourly rate * number of hours worked
 * - For employees with a fixed payment the formula is: the average monthly
 *  	salary = fixed monthly payment
 * Create an array of employees and add the employees with different form of payment.
 * Arrange the entire sequence of workers descending the average monthly wage. 
 * Output the employee ID, name, and the average monthly wage for all elements of the list.
 */

public class Homework_1 {

	public static void main(String[] args) {
		ArrayList<Payment> payments = new ArrayList<>();
		payments.add(new SalariedEmployee("Oleksandr", "123456", 160, 35));
		payments.add(new SalariedEmployee("Anatoliy", "321654", 200, 40));
		payments.add(new SalariedEmployee("Sofia", "654123", 180, 50));
		payments.add(new ContractEmployee("Taras", "1bc354nb", 1000));
		payments.add(new ContractEmployee("Anton", "32zdf54s3f", 7000));
		payments.add(new ContractEmployee("Nadia", "12jhkj36", 15000));
		
		
		for (Payment employee : payments) {
			System.out.println(employee);		
		}
				
		System.err.println();
		payments.sort(new SalaryComparator());
		for (Payment employee : payments) {
			System.out.println(employee);
		}
	}

}

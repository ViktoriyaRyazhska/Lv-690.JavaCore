package homework6;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Payment{
	
	@Override
	public int calculatePay() {
		
		return 0;
	}
	
	public static void main(String[] args) {
		
		
		//Employee[] employee = new Employee[2];
		Employee men1 = new ContractEmployee(206200,16000);
		Employee men2 = new SalariedEmployee(100800,80,60);
		SalariedEmployee salEmp = new SalariedEmployee(80,60,"Bob");
		ContractEmployee conEmp = new ContractEmployee(16000,"Jonh");
		//employee[0] = new SalariedEmployee(200800055,80,60);
		//employee[1] = new ContractEmployee(380009550,12500);
		//Arrays.sort(employee);
		
		
		
		
		
		List<Employee> menList = new ArrayList<Employee>();
			menList.add(men1);
			menList.add(men2);
			
		for(Employee emoloyee : menList) {	
			if(men1.calculatePay()>men2.calculatePay() ) {
				
				System.out.println(conEmp.getName() + " payment= " + men1.calculatePay() + " Id- " + conEmp.getFederalTaxIdmember());
				System.out.println(salEmp.getName() + " payment= " + men2.calculatePay() + " Id- " + salEmp.getSocialSecurityNumber());
			}else {
				
				System.out.println(salEmp.getName() + " payment= " + men2.calculatePay() + " Id- " + salEmp.getSocialSecurityNumber());
				System.out.println(conEmp.getName() + " payment= " + men1.calculatePay() + " Id- " + conEmp.getFederalTaxIdmember());
			}
			break;
		}
		
	}

	
}


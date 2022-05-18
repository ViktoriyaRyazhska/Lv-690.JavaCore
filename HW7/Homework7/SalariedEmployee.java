package Homework7;

public class SalariedEmployee extends Employee implements Payment {
	private String socialSecurityNumber;
	int fixedPayment;

	public SalariedEmployee(int employeeld, String socialSecurityNumber, int fixedPayment) {
		super(employeeld);
		this.socialSecurityNumber = socialSecurityNumber;
		this.fixedPayment = fixedPayment;
	}

	public int calculatePay() {
		return fixedPayment;
	}

	public String getInfo() {
		return "id="+getEmployeeId()+", socialSecurityNumber="+socialSecurityNumber+", wage="+calculatePay();
	}


}

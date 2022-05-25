package work6.task1;

public class ContractEmployee extends Employee implements Payment{
	private String federalTaxIdmember;
	private int monthlyPayment;
	
	public ContractEmployee(String employeeld, String federalTaxIdmember, int monthlyPayment) {
		setEmployeeld(employeeld);
		this.federalTaxIdmember = federalTaxIdmember;
		this.monthlyPayment = monthlyPayment;
	}

	
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}
	public int getMonthlyPayment() {
		return monthlyPayment;
	}
	public void setMonthlyPayment(int monthlyPayment) {
		this.monthlyPayment = monthlyPayment;
	}


	public int calculatePay() {
		return monthlyPayment;
	}
	
	public void info() {
		System.out.println("Name: "+getEmployeeld()+", Federal tax idmember: "+federalTaxIdmember+", Salary: "+calculatePay());
	}
}

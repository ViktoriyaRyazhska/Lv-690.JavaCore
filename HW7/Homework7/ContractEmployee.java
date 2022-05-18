package Homework7;

public class ContractEmployee extends Employee implements Payment {
	private String federalTaxIdmember;
	private int hours;
	private int rate;

	public ContractEmployee(int employeeld, String federalTaxIdmember, int hours, int rate) {
		super(employeeld);
		this.federalTaxIdmember = federalTaxIdmember;
		this.hours = hours;
		this.rate = rate;
	}

	public int calculatePay() {
		return hours*rate;
	}
	
	public String getInfo() {
		return "id="+getEmployeeId()+", federalTaxIdmember="+federalTaxIdmember+", wage="+calculatePay();
	}


}

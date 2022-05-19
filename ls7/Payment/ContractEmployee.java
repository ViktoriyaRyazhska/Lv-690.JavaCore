package ls7.Payment;

public class ContractEmployee extends Employee implements Payment {
	
	private String federalTaxIdmember;
	private double fixedMonthlyPayment;
	
	public ContractEmployee(String employeeld, String federalTaxIdmember, double fixedMonthlyPayment) {
		super(employeeld);
		this.federalTaxIdmember = federalTaxIdmember;
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}
		
	public String getFederalTaxIdmember() {
		return federalTaxIdmember;
	}

	public double getFixedMonthlyPayment() {
		return fixedMonthlyPayment;
	}

	public void setFederalTaxIdmember(String federalTaxIdmember) {
		this.federalTaxIdmember = federalTaxIdmember;
	}

	public void setFixedMonthlyPayment(double fixedMonthlyPayment) {
		this.fixedMonthlyPayment = fixedMonthlyPayment;
	}

	@Override
	public double calculatePay() {		
		return fixedMonthlyPayment;
	}

	@Override
	public String toString() {
		return "ContractEmployee [Employeeld= " + getEmployeeld() + ", federalTaxIdmember= "
				+ getFederalTaxIdmember() + ", salary= " + calculatePay() + "]";
	}
	
	
}

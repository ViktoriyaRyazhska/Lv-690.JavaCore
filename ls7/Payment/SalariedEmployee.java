package ls7.Payment;

public class SalariedEmployee extends Employee implements Payment{
	private String socialSecurityNumber;
	private int numberOfNoursWorked;
	private double hourlyRate;
	
	public SalariedEmployee(String employeeld, String socialSecurityNumber, int numberOfNoursWorked, double hourlyRate) {
		super(employeeld);
		this.socialSecurityNumber = socialSecurityNumber;
		this.numberOfNoursWorked = numberOfNoursWorked;
		this.hourlyRate = hourlyRate;
	}	

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	
	public int getNumberOfNoursWorked() {
		return numberOfNoursWorked;
	}

	public void setNumberOfNoursWorked(int numberOfNoursWorked) {
		this.numberOfNoursWorked = numberOfNoursWorked;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
	@Override
	public double calculatePay() {
		return hourlyRate * numberOfNoursWorked;
	}

	@Override
	public String toString() {
		return "SalariedEmployee [Employeeld= " + getEmployeeld() + ", social security number= " + socialSecurityNumber + " salary= " + calculatePay() + "]";
	}

}

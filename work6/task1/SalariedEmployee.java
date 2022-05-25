package work6.task1;

public class SalariedEmployee extends Employee implements Payment{
	private String socialSecurityNumber;
	private int hourlyRate;
	private int numHours;
	
	public SalariedEmployee(String employeeld, String socialSecurityNumber, int hourlyRate, int numHours) {
		setEmployeeld(employeeld);
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourlyRate = hourlyRate;
		this.numHours = numHours;
	}
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public int getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public int getNumHours() {
		return numHours;
	}
	public void setNumHours(int numHours) {
		this.numHours = numHours;
	}

	
	public int calculatePay() {
		return hourlyRate*numHours;
	}
	
	public void info() {
		System.out.println("Name: "+getEmployeeld()+", Social security mumber: "+socialSecurityNumber+", Salary: "+calculatePay());
	}
}

package homework6;

public class SalariedEmployee extends Employee implements Payment{
	private static int socialSecurityNumber;
	private int hourse;
	private int paymate;
	private String name;
	
	public int getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	public String getName() {
		return name;
	}
	public SalariedEmployee(int hourse, int paymate, String name) {
		this.hourse = hourse;
		this.paymate = paymate;
		this.name = name;
	}
	public SalariedEmployee(int socialSecurityNumber, int hourse, int paymate) {
		super();
		this.socialSecurityNumber = socialSecurityNumber;
		this.hourse = hourse;
		this.paymate = paymate;
	}

	@Override
	public int calculatePay() {
		return paymate * hourse;
		
	}

	
}

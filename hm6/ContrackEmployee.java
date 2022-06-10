package hm6;

public class ContrackEmployee extends Employee implements Payment{
	private int federalTaxIdmember;
	private int salary;
	private String Name;
	
	
	public String getName() {
		return Name;
	}
	public void info() {
		System.out.println("Id "+getFederalTaxIdmember());
	}
	public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public ContrackEmployee(int federalTaxIdmember , int salary , String Name) {
		super();
		this.federalTaxIdmember = federalTaxIdmember;
		this.salary = salary;
	}
	@Override
	public int calculatePay() {
		return salary;
	
	}
	public String info2() {
		return null;
	}
}

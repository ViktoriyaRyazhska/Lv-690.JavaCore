package homework6;

public class ContractEmployee extends Employee implements Payment{
	private static int federalTaxIdmember;
	private int salary;
	private String name;
	
	public String getName() {
		return name;
	}
	static public int getFederalTaxIdmember() {
		return federalTaxIdmember;
	}
	public ContractEmployee(int salary, String name) {
		this.salary = salary;
		this.name = name;
	}
	public ContractEmployee(int federalTaxIdmember, int salary) {
		super();
		this.federalTaxIdmember = federalTaxIdmember;
		this.salary = salary;
	}

	@Override
	public int calculatePay() {
		return salary;
	}
}

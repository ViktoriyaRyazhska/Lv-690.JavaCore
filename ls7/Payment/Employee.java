package ls7.Payment;

public abstract class Employee {
	private String employeeld;

	public Employee(String employeeld) {	
		this.employeeld = employeeld;
	}

	public String getEmployeeld() {
		return employeeld;
	}

	public void setEmployeeld(String employeeld) {
		this.employeeld = employeeld;
	}
	
	
}

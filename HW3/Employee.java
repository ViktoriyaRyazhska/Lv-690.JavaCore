package Homework3;

public class Employee {
	private String name;
	private  int rate;
	private int hours;
	public static int totalSum;
	public Employee() {
		setDefault();
		SetTotalSum(rate, hours);
	}
	public Employee(String name, int rate) {
		setDefault();
		this.name = name;
		SetTotalSum(rate, hours);
	}
	public Employee(String name, int rate, int hours) {
		setDefault();
		this.name = name;
		SetTotalSum(rate, hours);
	}
	private void setDefault() {
		this.name = "unknown";
		this.rate = 0;
		this.hours = 0;
	}
	
	private void SetTotalSum(int rate, int hours) {
		totalSum = totalSum - getSalary();
		this.rate = rate;
		this.hours = hours;
		totalSum = totalSum + getSalary();
	}
	public int getSalary() {
		return rate*hours;
	}		
	public double getBonuses() {
		return getSalary()*0.1;
	}
	public String getName() {
		return name;
	}
	public int getRate() {
		return rate;
	}
	public int getHours() {
		return hours;
	}
	public void changeHours(int hours) {
		SetTotalSum(rate, hours);
	}
	public void changeRate(int rate) {
		SetTotalSum(rate, hours);
	}
	
		
	@Override
	public String toString() {
		return name+". Rate="+rate+", hours="+hours+", salary="+getSalary();
	}
}	
	
	

	





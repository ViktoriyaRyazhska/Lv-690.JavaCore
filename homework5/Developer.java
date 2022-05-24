package homework5;

public class Developer extends Employee{

	private String position;
	
	public String getPosition() {
		return position;
	}
	@Override
	public String report() {
		return "Name- " + getName() +
					" age- " + getAge() +
					" postion- " + getPosition() +
					" Salary- " + getSalary();
	}
	public Developer(String name, int age, String postion,double salary) {
		super(name, age, salary);
		this.position = postion;
	}
	
}

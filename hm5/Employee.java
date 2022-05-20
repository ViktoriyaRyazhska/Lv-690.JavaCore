package hm5;

public class Employee  {
	
	private String name;
	private int age;
	private String position;
	private int salary;
	public Employee(String a, String name, int age, String position, int salary){
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}
	 
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getPosition() {
		return position;
	}

	public int getSalary() {
		return salary;
	}

	public String report() {
		return "Name "+ getName() +
				",Salary :" + getSalary() +
				 ",Position :" + getPosition() +
				 ",Age :" + getAge();
		

		
		
		
	}		
	}

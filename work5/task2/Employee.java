package work5.task2;

public class Employee {
		private String name;
		private int age;
		private double salary;
	

		public Employee(String name, int age, double salary) {
		this.name = name;
		if(age>130&&age<14) {
			System.out.print("that`s wrong");
		}else {
			this.age = age;
		}
		this.salary = salary;
		}

		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			if(age>130&&age<14) {
				System.out.print("that`s wrong");
			}else {
				this.age = age;
			}
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
		
		public String report() {
			return String.format("Name: %s, Age: %d, Salary: \u20B4 %.2f.", name, age, salary);
		}
}

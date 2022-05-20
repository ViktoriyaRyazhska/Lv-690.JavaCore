package hm5;

public class Developer extends Employee {

		String a;
		@Override	
		public String report() {
			return "Name "+ getName() +
					",Salary :" + getSalary() +
					 ",Position :" + getPosition() +
					 ",Age :" + getAge();
		}
		public Developer(String a, String name, int age, String position, int salary, String a2) {
			super(a, name, age, position, salary);
			a = a2;
		}

		
		public static void main(String[] args) {
			Employee em1 = new Employee("a ", "Nazariy", 48 , "Ñashier", 4560);
			Employee em2 = new Employee("a ", "Slavik", 31 , "Oficer", 11691);
			System.out.println(em1.report());
			System.out.println(em2.report());
		}
		}


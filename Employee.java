

public class Employee {
	private String name;
	private int rate;
	private int hours;
	static int totalSum;
	
	
	public Employee(String name, int rate, int hours) {
		super();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}


	public Employee(String name, int rate) {
		super();
		this.name = name;
		this.rate = rate;
	}

	public int getSalary() {
		int sal= rate* hours;
		return sal;
		}
	public String toString() {
		return name+ " " +rate+ " " +hours;
	}
	public int changeRate(int rate) {
		this.rate= rate;
		return this.rate;
	}
	public void  getBonuses() {
		int a= getSalary()*10/100;
	}
	 public static void main(String[] args) {
		
		 Employee q= new Employee("Kostya ",44,110);
		 Employee e= new Employee("Jurek ",60,80);
		 Employee r= new Employee("Vitaliy ",9676,11);
		 
		 q.getSalary();
		 e.getSalary();
		 r.getSalary();
		 
		 q.changeRate(45);
		 e.changeRate(61);
		 r.changeRate(96);
		 
		 q.getBonuses();
		 e.getBonuses();
		 r.getBonuses();
		 
		 System.out.println(q.toString());
		 System.out.println(e.toString());
		 System.out.println(r.toString());
	}
			
	
	

}

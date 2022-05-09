package lesson1;

public class Employee {

	private String name;
	private int rate;
	private int hours;
	private static int totalSum;
	
	public Employee(String name, int rate) {
		super();
		this.name = name;
		this.rate = rate;
	}
	public Employee(String name, int rate, int hours) {
		super();
		this.name = name;
		this.rate = rate;
		this.hours = hours;
	}
	public int getSalary(){
		int sum=rate*hours;
		return sum;
	}
	public int getTotalSum() {
		this.totalSum=0;
		return totalSum=getSalary();
	}
	
	public String toString(){
		return name+" rate= "+rate+", hours "+hours+" the salary = "+this.getSalary();
	}
	public int changeRate(int rate) {
		this.rate=rate;
		return this.rate;
		
	}
	public void getBonuses() {
		int bonus=getSalary()*10/100;
	}

	public static void main(String[] args) {
		Employee user1=new Employee("Forest Gamme",20,10);
		user1.getSalary();
		System.out.println(user1.toString());
		user1.getBonuses();
	
		
		Employee user2=new Employee("Ivan Bober",30,120);
		user2.changeRate(40);
		user2.getSalary();
		System.out.println(user2.toString());
		user2.getBonuses();
		
		
		Employee user3=new Employee("Pole Woker",50,90);
		user3.getSalary();
		System.out.println(user3.toString() );
		user3.getBonuses();
		
		System.out.println(user1.getTotalSum()+user2.getTotalSum()+user3.getTotalSum());
		
		
	}
}

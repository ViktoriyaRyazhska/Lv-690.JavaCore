package homework5;

public class Main {
	
	
	public static void main(String[] args) {
		
		Employee worker1 = new Developer("Petro",18,"Trainner",9000.10);
		Employee worker2 = new Developer("Ivan",20,"Junior",1450.505);
		Employee worker3 = new Developer("Jonh",22,"Senior",3000.203);
		
		System.out.println(worker1.report());
		System.out.println(worker2.report());
		System.out.println(worker3.report());
	}
}

import java.util.Scanner;
public class CallsCost {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("To Poland cost of call in $/min is ..");
		double polandCost = sc.nextDouble();
		System.out.println("To Grait Britain cost of call in $/min is ..");
		double GbCost = sc.nextDouble();
		System.out.println("To USA cost of call in $/min is ..");
		double UsaCost = sc.nextDouble();
		//call duration
		System.out.println("To Poland call was during .....min");
		double polandMins = sc.nextDouble();
		System.out.println("To Grait Britain call was during .....min");
		double GbMins = sc.nextDouble();
		System.out.println("To USA call was during .....min");
		double UsaMins = sc.nextDouble();
		//calls total cost
		double polandCall = polandCost*polandMins;
		double GbCall = GbCost*GbMins;
		double UsaCall = UsaCost*UsaMins;
		double SumCalls = polandCall+GbCall+UsaCall;
		System.out.println("Total expences for calls are " + SumCalls + "$");

	}

}

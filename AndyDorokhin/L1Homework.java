import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1Homework {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int radius;
		double flowerBedArea, flowerBedPerimeter;
		
		String name, address;
		
		int c1;
		int c2;
		int c3;
		int t1;
		int t2;
		int t3;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// Flower bed area / perimeter
		System.out.println("Task 1");
		System.out.println("Please enter radius: ");
		radius = Integer.parseInt(br.readLine());
		flowerBedPerimeter = 2 * Math.PI * radius; 
		flowerBedArea = Math.PI * radius * radius;
		System.out.println("Flower bed perimeter is: " + flowerBedPerimeter);
		System.out.println("Flower bed area is: " + flowerBedArea);
		
		// Greeting
		System.out.println("Task 2");
		System.out.println("What is your name?");
		name = br.readLine();
		System.out.println("Where are you live, " + name + "?");
		address = br.readLine();
		System.out.println("Your name is " + name);
		System.out.println("You live in " + address);
		
		// Phone calls
		System.out.println("Task 3");
		System.out.println("Please enter tariff for destination C1, per minute: ");
		c1 = Integer.parseInt(br.readLine());
		System.out.println("Please enter call duration for destination C1, minutes: ");
		t1 = Integer.parseInt(br.readLine());
		System.out.println("Call to C1 cost: " + (c1*t1));
		System.out.println("Please enter tariff for destination C2, per minute: ");
		c2 = Integer.parseInt(br.readLine());
		System.out.println("Please enter call duration for destination C2, minutes: ");
		t2 = Integer.parseInt(br.readLine());
		System.out.println("Call to C2 cost: " + (c2*t2));
		System.out.println("Please enter tariff for destination C3, per minute: ");
		c3 = Integer.parseInt(br.readLine());
		System.out.println("Please enter call duration for destination C3, minutes: ");
		t3 = Integer.parseInt(br.readLine());
		System.out.println("Call to C3 cost: " + (c3*t3));
		System.out.println("Total cost: " + (c1*t1 + c2*t2 + c3*t3));

	}

}

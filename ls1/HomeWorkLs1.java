package ls1;
/*
 * Create console application. In method main() write code for solving next tasks:
1) Flower bed is shaped like a circle. Calculate the perimeter and area by entering the radius. 
Output obtained results.

2) Define String variables name and address. Output question "What is your name?" 
Read the value name and output next question: “Where are you live, (name)?". 
Read address and write whole information.

3) Phone calls from three different countries are с1, с2 and с3 standard units per minute. 
Talks continued t1, t2 and t3 minutes. How much computer will count for each call 
separately and all talk together? 
Input all source data from console, make calculations and output to the screen.
*/
import java.io.*;

public class HomeWorkLs1 {

	public static void main(String[] args) throws IOException {
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		
		//Flower
		
		System.out.print("Enter radiys of flower: ");
		String rString = rb.readLine();
		int r = Integer.parseInt(rString);
		float p = (float) (2 * 3.14 * r);
		float s = (float) (3.14 * r * r);
		System.out.println("Perimeter of flower: " + p);
		System.out.println("Area of flower: " + s);
		
		// Name, address
		
		System.out.print("What is your name: ");
		String name = rb.readLine();
		System.out.print("Where do you live " + name +" ? ");
		String addres = rb.readLine();
		System.out.println("Your addres " + name + " is " +addres);
		
		//Phone calls
		
		System.out.println("Enter units c1, c2, c3");
		System.out.print("Enter unit c1: ");
		String unitC1 = rb.readLine();
		int c1 = Integer.parseInt(unitC1);
		System.out.print("Enter unit c2: ");
		String unitC2 = rb.readLine();
		int c2 = Integer.parseInt(unitC2);
		System.out.print("Enter unit c3: ");
		String unitC3 = rb.readLine();
		int c3 = Integer.parseInt(unitC3);
		System.out.println("Enter your talks times t1, t2, t2");
		System.out.print("Enter time talk t1: ");
		String timeT1 = rb.readLine();
		int t1 = Integer.parseInt(timeT1);
		System.out.print("Enter time talk t2: ");
		String timeT2 = rb.readLine();
		int t2 = Integer.parseInt(timeT2);
		System.out.print("Enter time talk t1: ");
		String timeT3 = rb.readLine();
		int t3 = Integer.parseInt(timeT3);
		int prise1 = c1 * t1;
		int prise2 = c2 * t2;
		int prise3 = c3 * t3;
		System.out.println("The cost of your conversations: \n" 
		+ "prise1: " + prise1 + "\n"
		+ "prise2: " + prise2 + "\n"
		+ "prise3: " + prise3);
			
	}

}

package ls1;
import java.io.*;

/*
 * In method main() write code for solving next tasks:
 * Define integer variables a and b. Read values a and b from Console and calculate: 
 * a + b 
 * a - b 
 * a * b 
 * a / b. 
 * Output obtained results.
 */

package ls1;
import java.io.*;

public class Task1 {

	public static void main(String[] args) throws IOException {
		BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number a: ");
		String aString = rb.readLine();
		int a = Integer.parseInt(aString);
		System.out.print("Enter number b: ");
		String bString = rb.readLine();
		double b = Integer.parseInt(bString);
		
		System.out.println("Result a + b: " + (a + b));
		System.out.println("Result a - b: " + (a - b));
		System.out.println("Result a * b: " + (a * b));
		System.out.println("Resulr a / b: " + (a / b));
	}
		

}

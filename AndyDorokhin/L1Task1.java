import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class L1Task1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		int a, b;
		String answer;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Please enter first int - a: ");
		a = Integer.parseInt(br.readLine());
		System.out.println("Please enter second int - b: ");
		b = Integer.parseInt(br.readLine());
		
		System.out.println("Calculating a + b, result is: " + (a+b));
		System.out.println("Calculating a - b, result is: " + (a-b));
		System.out.println("Calculating a * b, result is: " + (a*b));
		System.out.println("Calculating a / b, result is: " + (double)a/b);
		
		System.out.println("*****************");
		System.out.println("How are you?");
		answer = br.readLine();
		System.out.println("You are " + answer);
		
	}

}

package ls1;
/*
 Output question “How are you?“. Define string variable answer. Read the value answer and output: “You are (answer)". 

 */
import java.io.*;
public class Task2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How are you? ");
		String st = br.readLine();
		System.out.println("You are " + st);
	}

}

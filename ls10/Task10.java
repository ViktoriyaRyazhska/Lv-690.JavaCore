package ls10;
 /*
  * Enter the two variables of type String. Determine whether 
  * the first variable substring second. For example, 
  * if you typed «IT» and «IT Academy» you must receive true.
  * 
  * Enter surname, name and patronymic on the console as 
  * a variable of type String. Output on the console:
  * - surnames and initials
  * - name
  * - name, middle name and last name
  *
  * The user name can be 3 to 15 characters of the Latin alphabet,
  * numbers, and underscores. Using regular expressions implement
  * checking the user name for validity. Input five names in the main method.
  * Output a message to the console of the validation of each of the entered names.
  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

public class Task10 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String st1 = "Acad";
		String st2 = "IT Academy";
		System.out.println(st1.contains(st2));
		print(bf);
		System.out.println(checkName(bf));
		
	}
	public static void print(BufferedReader bf) throws IOException {
		System.out.println("Enter surname, name and patronymic ");
		String full = bf.readLine();
		String[] words = full.split(" ");
		System.out.println(words[0] + " " + words[1].charAt(0) + ". " + words[2].charAt(0) + ".");
		System.out.println(words[1]);
		System.out.println(words[1] + " " + words[2] +" " + words[0]);
	}
	
	public static boolean checkName(BufferedReader bf) throws IOException {
		String text = bf.readLine();
		Pattern p = Pattern.compile("^[a-z][0-9]{3,15}$");
		Matcher m = p.matcher(text);
		return m.matches();
	}
}

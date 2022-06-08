package HW10.StringsPractice;

//Enter the two variables of type String. Determine whether the first variable substring second.
//For example, if you typed «IT» and «IT Academy» you must receive true.

//Enter surname, name and patronymic on the console as a variable of type String.
//Output on the console:
//surnames and initials
//name
//name, middle name and last name

//The user name can be 3 to 15 characters of the Latin alphabet, numbers, and underscores.
//Using regular expressions implement checking the user name for validity.
//Input five names in the main method . Output a message to the console of the validation of each of the entered names.
//

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPractice {
	public static void main(String[] args) {
// Practical Task - 1
		String s = "IT";
		String t = "IT Academy";
		System.out.println(t.contains(s));
// Practical Task - 2
		String n = "Shevchenko Taras Grygorovych";
		String[] l = n.split(" ");
		for (String w : l) {
			System.out.println(w);
		}
		System.out.println(l[1] + " ---- name");
		System.out.println(l[0] + "  " + l[1] + "  " + l[2] + "  -------- name, middle name, last name");
		System.out.println(l[0] + " " + l[1].charAt(0) + "." + l[2].charAt(0) + "." + "  -----surname,initials");

// Practical Task - 3
		String formatPattern = "[a-zA-Z0-9_]{3,15}+";
		Pattern p = Pattern.compile(formatPattern);
		String strings[] = { "qweerter#_", "rtyytyuif_", "bvvvv_11", "rtre$hdfhh_22", "yuiyt123*_" };
		for (int i = 0; i < strings.length; i++) {
			Matcher m = p.matcher(strings[i]);
			System.out.println(strings[i] + m.matches());
		}
	}
}
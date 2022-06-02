package HW10.StringsTask1;

//Enter in the console sentence of five words.
//display the longest word in the sentence
//determine the number of its letters
//bring the second word in reverse order

import java.util.Scanner;

public class MainTask1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter in the console sentence of five words \nsepareted by Space(not Enter)");
		String input = sc.nextLine();
		System.out.println(input + " You have entered this phrase");
		String mass[] = input.split(" ");
		int longest = mass[0].length();
		String Long = mass[0];
		for (String Long1 : mass) {
			if (Long1.length() > longest) {
				longest = Long1.length();
				Long = Long1;

			}
		}
		System.out.println(Long + "-----the longest word" + longest + " --- the numbers of letters");
		StringBuilder sb = new StringBuilder();
		sb.append(mass[1]);
		System.out.println("word in reverse order:  " + sb.reverse());
	}
}
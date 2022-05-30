package ls10;
/*
 * Enter in the console sentence of five words. 
 * - display the longest word in the sentence
 * - determine the number of its letters
 * - bring the second word in reverse order
 
 * Enter a sentence that contains the words between more than one space.
 * Convert all spaces, consecutive, one. For example, if we introduce 
 * the sentence "I    am      learning     Java   Core», 
 * we have to get the "I'm learning Java Core»
 * 
 * Implement a pattern for US currency: the first symbol "$", 
 * then any number of digits, dot and two digits after the dot. 
 * Enter the text from the console that contains several occurrences
 * of US currency. Display all occurrences on the screen.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Homework_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		String text = bf.readLine();
		String[] splitText = text.split(" ");
		System.out.println(longestWord(splitText));	
		System.out.println("The number of this letters: " + longestWord(splitText).length());
		System.out.println(reverseSecondWord(splitText));
		
		System.out.println(bf.readLine().replaceAll("[\\s]{2,}", " "));
		
		String textWithDollar = bf.readLine();
		Pattern p = Pattern.compile("\\$(\\d*)(\\.\\d{2})?");
		Matcher m = p.matcher(textWithDollar);
		while (m.find()) {
			System.out.println(textWithDollar.substring(m.start(), m.end()) + "\n");
		}
		
	}
	
	
	public static String longestWord(String[] text) {
		String word = "";
		for (int i = 0; i < text.length - 1; i++) {
			if(text[i].length() > text[i + 1].length()) {
				word = text[i];
			}
		}
		return word;
	}
	
	public static String reverseSecondWord(String[] text) {
		String reverseWord;
		if (text.length > 2) {
			StringBuilder sb = new StringBuilder(text[1]);
			reverseWord = sb.reverse().toString();
		} else {
			return "The sentence is short";
		}
		return reverseWord;
	}
	
	



}

package homework9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class StringWork {
	public static void main(String[] args) {
		
		String text = "The longest word in a sentence";
	    System.out.println(text);

	    String longtText =    Arrays.stream(text.split(" ")).
	            max(Comparator.comparingInt(String::length)).
	            orElse(null);
	    System.out.println(longtText);

	    int longtTextLength = longtText.length();
	    System.out.println(longtTextLength);

	    String[] arrText = text.split(" ");
	    String reversWord = arrText[1];
	    StringBuffer buff = new StringBuffer();
	    buff.append(reversWord);
	    buff.reverse();
	    System.out.println(buff);

	    String textt = "I  am    learning   Java   Core";
	            System.out.println(textt);
	            textt = textt.replaceAll("[ ]+", " ");
	            System.out.println(textt);

	    Scanner scan = new Scanner(System.in);

	    List<String> sList = new ArrayList<>();

	    sList.add(String.format("$ %.2f", scan.nextFloat()));
	    sList.add(String.format("$ %.2f", scan.nextFloat()));
	    sList.add(String.format("$ %.2f", scan.nextFloat()));

	    for(String a : sList) {
	        System.out.println(a.concat(" "));
		
	    }
	}	
}	


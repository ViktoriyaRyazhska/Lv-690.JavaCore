package Homeworks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String[] text = {"We", "can", "reverse", "String", "using", "StringBuffer"};
		
		String longest = text[0];
		int max = longest.length();
		for (int i=1; i<text.length; i++) {
			if (text[i].length()>max) {
				max = text[i].length();
				longest = text[i];
			}
		}
		System.out.println("longest is "+longest+", length="+max);
		StringBuilder sb=new StringBuilder(text[1]);  
		System.out.println("second reverse: "+sb.reverse());
		System.out.println("");
	
		String sent = "I    am      learning     Java   Core";
		while (sent.contains("  ")) {
			sent = sent.replace("  ", " ");
		}
		System.out.println(sent);
		System.out.println("");
				
		String pattern = "[$]{1}+[0-9]*+[.]{1}+[0-9]{2}";
		String[] currencies = {"$$10.00" , "$1", "$10.50", "$10.0" ,"$10.00c"};
		
		Pattern p = Pattern.compile(pattern);		
		for (String str:currencies) {
			Matcher m = p.matcher(str);
			System.out.println(str+":"+m.matches());
		}
	}

}

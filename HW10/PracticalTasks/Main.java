package PracticalTasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		String s1 = "Windows";
		String s2 = "Windows 10";
		if (s2.contains(s1)) {
			System.out.println("contains");
		}
		else {
			System.out.println("not contains");
		}
		System.out.println("");

		String pibStr = "Pupkin Roman Stepanovich";
		String[] pib = pibStr.split(" ");
		System.out.println(pib[0]+" "+pib[1].charAt(0)+"."+pib[2].charAt(0)+".");
		System.out.println(pib[1]);
		System.out.println(pib[1]+" "+pib[2]+" "+pib[0]);
		System.out.println("");
				
		String pattern = "[a-zA-Z0-9_]{3,15}+";
		String[] text = {"As12asdsadsa_" , "sdfsdfdsSS1", "sdfsdfsdfsdfsdfsD_", "s" ,"sdfds#"};
		
		Pattern p = Pattern.compile(pattern);
		
		for (String str:text) {
			Matcher m = p.matcher(str);
			System.out.println(str+":"+m.matches());
		}
	}

}

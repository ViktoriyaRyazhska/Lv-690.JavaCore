package work11.task4;

import java.util.*;
import java.util.regex.*;

public class Parsertxt {
	public static int numOfLines(List<String> l1) {
		return l1.size();
	}
	
	public static String longestLine(List<String> l1) {
		int i = l1.get(0).length();
		String buff = null;
		for (String s : l1) {
			if (s.length() > i) {
				i = s.length();
				buff = s;
			}
		}
		return buff;
	}
	
	public static String[] getNameAndBirthday(List<String> l1) {
		String name = null;
		String birthday = null;

		for (String s : l1) {
			if (s.contains("name")){
				Pattern p = Pattern.compile("[A-Z][a-z]+");
				Matcher m = p.matcher(s);
				while (m.find())
				name = s.substring(m.start(), m.end());
			}
			if (s.contains("birthday")){
				Pattern p = Pattern.compile("[0-3]?[\\d]/[0-1][\\d]/[1-2][\\d]{1,3}");
				Matcher m = p.matcher(s);
				while (m.find())
				birthday = s.substring(m.start(), m.end());
			}
		}
		
		String[] result = {name,birthday};
		return result;
	}
}

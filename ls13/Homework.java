package ls13;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Homework {

	public static void main(String[] args) {
//		There is a list of strings list1. Create a new list list2 that has items 
//		from list1 and length less than 5 characters (use method removeIf)

		List<String> list1 = Arrays.asList("Angela", "Aaron", "Bob", "Claire", "David", "Masha", "Anna");
		List<String> list2 = new ArrayList<>(list1);
		list2.removeIf(s -> (s.length() > 5));
		list2.forEach(s -> System.out.println(s));		

//		Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//		Method encrypt should take a string and return coded string where every letter is moved 
//		on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). "
//	    "Method decrypt should return decoded value

		System.out.println(encrypt("abcdefg", 3));
		System.out.println(decrypt("defghij", 3));

//		Create method to validate date according to format "mm.dd.yy"

		System.out.println(isDateValid("25.12.1996"));
	}

	public static String encrypt(String s, int key) {

		return s.codePoints().mapToObj(c -> String.valueOf((char) (c + key))).collect(Collectors.joining());

	}

	public static String decrypt(String s, int key) {
		return s.codePoints().mapToObj(c -> String.valueOf((char) (c - key))).collect(Collectors.joining());
	}

	public static boolean isDateValid(String data) {
		boolean dateIsValid = true;
		try {
			LocalDate.parse(data, DateTimeFormatter.ofPattern("mm.dd.yy").withResolverStyle(ResolverStyle.STRICT));
		} catch (DateTimeException e) {
			e.printStackTrace();
			dateIsValid = false;
		}
		return dateIsValid;
	}

}

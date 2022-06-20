package HW13.Java8;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

//1. There is a list of strings list1. Create a new list list2 that 
//has items from list1 and length less than 5 characters (use method removeIf)
public class Tasks {
	public static void main(String[] args) throws IOException {
		System.out.println("-Task1-");
		List<String> list1 = new ArrayList<>();
		list1.add("John");
		list1.add("Arny");
		list1.add("Tom");
		list1.add("Adannm");
		list1.add("Luk");
		System.out.println(list1);

		list1.removeIf(n -> n.length() >= 5); /*delete items which have more then 5 letters*/
		List<String> list2 = list1;
		System.out.println(list2);

		System.out.println("-Task2-");
//		2. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
//		Method encrypt should take a string and return coded string where every letter is 
//		moved on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“). Method decrypt should return decoded value
		
		String txt = "Decryption";
		int shift = 5;
		
		Decoded decrypt = (s, n) -> (s.substring(n, n + shift));
		Decoded encrypt = (s, n) -> (s.substring(0, n));
		System.out.println(txt);
		System.out.println("String (" + txt + ") -> " + " Decoded to -> " + decrypt.dec(txt, 5));
		System.out.println(txt + " Encoded " + encrypt.dec(txt, txt.length()));

		System.out.println("-Task3-");
//		3. Create method to validate date according to format "mm.dd.yy"
		
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String format = formatter.format(date);
		boolean checkFormat;
		if (format.matches("([0-9]{2})/([0-9]{2})/([0-9]{4})"))
			checkFormat = true;
		else
			checkFormat = false;
		System.out.println(format + " " + checkFormat);
	}
		
}
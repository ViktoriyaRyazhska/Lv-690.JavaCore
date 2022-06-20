package work12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class task2 {

	public static void main(String[] args) {
		String line;
		int n;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter string and number: ");
		try {
			line= reader.readLine();
			n = Integer.parseInt(reader.readLine());
		} catch (IOException e) {
			System.err.println("IOException error");
			return;
		}
		
		line= encrypt(line,n);
		System.out.println("coded string: "+line);
		
		line= decrypt(line,n);
		System.out.println("decoded string: "+line);
	}
	
	public static String encrypt(String s, int n) {
		return s.chars().mapToObj(c -> String.valueOf((char)(c+n))).collect(Collectors.joining());
	}

	public static String decrypt(String s, int n) {
		return s.chars().mapToObj(c -> String.valueOf((char)(c-n))).collect(Collectors.joining());
	}

}

package work12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class task3 {

	public static void main(String[] args) {
		String date;
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter date: ");
		try {
			date= reader.readLine();
		} catch (IOException e) {
			System.err.println("IOException error");
			return;
		}
		System.out.println("format validity: "+dateChecker(date));
	}
	public static boolean dateChecker(String d) {
		try {
			LocalDate.parse(d, DateTimeFormatter.ofPattern("MM/dd/uuuu").withResolverStyle(ResolverStyle.STRICT));
		} catch (DateTimeException e) {
			return false;
		}
		return true;
	}

}

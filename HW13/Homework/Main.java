package Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//1. There is a list of strings list1. Create a new list list2 that has items from list1 and length less than 5 characters (use method removeIf)
		String s = "There is a list of strings list1. Create a new list list2 that has items from list1 and length less than 5 characters";
		List<String> list1 = Arrays.asList(s.split(" "));
		List<String> list2 = list1.stream().collect(Collectors.toList());
		list2.removeIf(e -> e.length() < 5);
		list2.stream().forEach(e -> System.out.print(e + " "));
		System.out.println();

		//2. Create two methods String encrypt(String s, int n) and String decrypt(Stirng s, int n)
		String s1 = encrypt(s, 3);
		System.out.println(s1 + " ");
		String s2 = decrypt(s1, 3);
		System.out.println(s2 + " ");

		//3. Create method to validate date according to format "mm.dd.yy"
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String pattern = "MM.dd.yy";
		String date;
		do {
			date = Read("Input date according to format " + pattern + " :", reader);
		}
		while (validate(date, pattern)==false);

	}

	public static String encrypt(String s, int n) {
		return s.chars().mapToObj(e -> (char) (int) (e + n)).collect(Collectors.toList()).stream().map(String::valueOf)
				.collect(Collectors.joining());
	}

	public static String decrypt(String s, int n) {
		return s.chars().mapToObj(e -> (char) (int) (e - n)).collect(Collectors.toList()).stream().map(String::valueOf)
				.collect(Collectors.joining());
	}

	public static boolean validate(String s, String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		try {
			LocalDate localDate = LocalDate.parse(s, formatter);
			System.out.print("parsed to "+ localDate);
			return true;
		} catch (Exception e) {
			System.out.println("wrong date format, repeat please");
			return false;
		}
	}

	public static String Read(String q, BufferedReader reader) {
		System.out.println(q);
		try {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}

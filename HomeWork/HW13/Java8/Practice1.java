package HW13.Java8;

//Print n random numbers on console using Java 8
//Print n random numbers on console using Java 8 in a sorted order
//Using Java 8 show the biggest number from n random numbers
//Show which today is a day of a week
//Show a date of first Monday for current month
//Write a method for sorting list of Strings using Java 8

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;

public class Practice1 {
	public static void main(String[] args) {
		// Print n random numbers on console
		System.out.println("1. Print n random numbers");
		Random random = new Random();
		random.ints(1, 50).limit(3).forEach(System.out::println);

		// Print n random numbers in a sorted order
		System.out.println("2. Print n random numbers in order");
		random.ints(20, 30).limit(3).sorted().forEach(System.out::println);
		// Show the biggest number from n random numbers
		System.out.println("3. Show the biggest number from n random numbers");
		List<Integer> list = new ArrayList<>();
		list = random.ints(1, 10).limit(3).boxed().toList();
		System.out.println(list);
		System.out.println(list.stream().mapToInt(m -> m).max().getAsInt() + " is max number");
		// Show the biggest number from n random numbers - second variant
		Optional<Integer> max = list.stream().max(new Comparator<Integer>() {
			public int compare(Integer a1, Integer a2) {
				return a1 - a2;
			}
		});
		System.out.println("Max number is :" + max);

		// Show which today is a day of a week

		LocalDateTime nowDayOfWeek = LocalDateTime.now();
		System.out.println("4. Today is " + nowDayOfWeek.getDayOfWeek() + " as a day of a week");

		// Show a date of first Monday for current month
		nowDayOfWeek.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
		System.out.println(nowDayOfWeek + " is a date of first Monday for current month");

		// Show a date of first Monday for current month - second variant
		LocalDate today = LocalDate.now();/* (current date) */
		System.out.println(today);
		LocalDate monday = today.plus(1, ChronoUnit.WEEKS);/* (int day of the week, ChronoUnit.WEEKS ) */
		LocalDate monday2 = today.plus(1, ChronoUnit.DAYS);/* (int the next(1) day after today, ChronoUnit.DAYS ) */
		LocalDate monday3 = today.plus(2, ChronoUnit.YEARS);/* (int the next(2) year after today, ChronoUnit.YEARS ) */
		System.out.println("This is the date " + monday + " of first Monday");
		System.out.println("This is the date " + monday2 + " next day of the current day");
		System.out.println("This is the date " + monday3 + " the second year after the current day");

//        Write a method for sorting list of Strings using Java 8

		List<String> listNewJava = new ArrayList<>();
		listNewJava.add("London");
		listNewJava.add("Helsinki");
		listNewJava.add("Berlin");
		listNewJava.add("Kyjiv");
		listNewJava.add("");
		System.out.println(listNewJava);
		listSort(listNewJava);
	}

	public static void listSort(List<String> list) {
		List<String> sorted = list.stream().filter(String -> !String.isEmpty()).sorted().collect(Collectors.toList());
		System.out.println(sorted.stream().toList());
	}
}
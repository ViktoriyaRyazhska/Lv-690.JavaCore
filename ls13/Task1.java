package ls13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task1 {
	public static void main(String[] args) {

		// Print n random numbers on console using Java 8

		Random rd = new Random();
		rd.ints(0, 100).limit(20)
		.forEach(x -> System.out.print(x + " "));
		System.out.println();
		
		//Print n random numbers on console using Java 8 in a sorted order

		rd.ints(0, 100).limit(20).sorted().forEach(x -> System.out.print(x + " "));
		System.out.println();
		
//		Using Java 8 show the biggest number from n random numbers

		
		List<Integer> integers = rd.ints(0, 100)
				.limit(20)
				.sorted()
				.boxed()
				.collect(Collectors.toList());

		integers.forEach(x -> System.out.print(x + " "));
		IntSummaryStatistics number = integers.stream()
				.mapToInt((x) -> x)
				.summaryStatistics();
		System.out.println();
		System.out.println("Max value: " + number.getMax());
		
//		Write a method for sorting list of Strings using Java 8

		List<String> st = new ArrayList<>(Arrays.asList("d", "h", "l", "y", "z", "r"));
		st.add("svsdv");
		List<String> sorteList = st.stream().sorted().toList();
		System.out.println(sorteList);
		
//		Show which today is a day of a week
//		Show a date of first Monday for current month

		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ld = LocalDate.now();
		DayOfWeek DayOfWeek = ld.getDayOfWeek();
		LocalDate day = ld.now();
		String dateString = formatter.format(ld);

		System.out.println(DayOfWeek);
		System.out.println(dateString);
	}

}

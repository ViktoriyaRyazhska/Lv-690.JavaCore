package Practical;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		//Print n random numbers on console using Java 8
		int n = 10;
		Random r = new Random();
		r.ints(1,50).limit(n).forEach(x ->System.out.print(x+" "));
		
		//Print n random numbers on console using Java 8 in a sorted order
		System.out.println("");
		r.ints(1,50).limit(n).sorted().forEach(x ->System.out.print(x+" "));
		
		//Using Java 8 show the biggest number from n random numbers
		System.out.println("");
		List<Integer> list = r.ints(1,50).limit(n).boxed().collect(Collectors.toList());
		list.forEach(x ->System.out.print(x+" "));
		System.out.println("max="+list.stream().mapToInt(v -> v).max().getAsInt());
		
		//Show which today is a day of a week
		System.out.println( LocalDateTime.now().getDayOfWeek());
		
		//Show a date of first Monday for current mont
		LocalDateTime first = LocalDateTime.now().withDayOfMonth(1);
		while (first.getDayOfWeek()!=DayOfWeek.MONDAY) {
			first = first.plusDays(1);						
		}
		System.out.println("Date of first monday is "+first.toString());
		
		//Write a method for sorting list of Strings using Java 8
		String s = "Write a method for sorting list of Strings using Java 8";
		List<String> slist = Arrays.asList(s.split(" "));
		//slist.stream().sorted().forEach(x -> System.out.print(x+" "));
		slist.stream().sorted().forEach(System.out::println);
	}

}

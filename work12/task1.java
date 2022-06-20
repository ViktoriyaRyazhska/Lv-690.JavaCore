package work12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class task1 {

	public static void main(String[] args) {
		List<String> first = new ArrayList<>();
		List<String> second = new ArrayList<>();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		filling(reader,first);
		
		second.addAll(first);
		second.removeIf(st -> (st.length() > 5));
		
		System.out.println("strings less than 5 characters:");
		second.forEach(System.out::println);
	}
	
	public static void filling(BufferedReader read1, List<String> list1) {
		System.out.println("enter strings(to stop typing, enter QUIT): ");
		do {
			try {
				list1.add(read1.readLine());
			} catch (IOException e) {
				System.out.println("IOException error");
				break;
			}
		}while(!"QUIT".equals(list1.get(list1.size() - 1)));
		list1.remove("QUIT");
	}
}

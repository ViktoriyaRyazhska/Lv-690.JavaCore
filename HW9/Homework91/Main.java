package Homework91;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void print(Map<Integer, String> map) {
		for (Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println("id="+entry.getKey()+", name="+entry.getValue());
		}
	};
	
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		

		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "John");
		map.put(2, "Sam");
		map.put(3, "Mary");
		map.put(4, "Nick");
		map.put(5, "Jack");
		map.put(6, "Jenifer");
		map.put(15, "Maxim");
		map.put(16, "Nick");
		print(map);
		
		int id = Integer.parseInt(Read("id: ", br));
		if (map.containsKey(id)) {
			System.out.println(map.get(id));
		}
		else {System.out.println("Map doesn't contain such id");}
		;
		String name = Read("name: ", br);
		if (map.containsValue(name)) {
			for (Map.Entry<Integer, String> entry:map.entrySet()) {
				if (name.equals(entry.getValue())) { 
				 System.out.println("id="+entry.getKey());}
			}
		}
		else {System.out.println("Map doesn't contain such name");}
		;
		
	}
	
	public static String Read(String q, BufferedReader br) {
		System.out.println(q);
		try {
			return br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}

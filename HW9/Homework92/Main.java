package Homework92;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;



public class Main {
	
	public static void print(Set<Integer> set) {
		for (Integer item:set) {
			System.out.println(item);
			};
		System.out.println("");
		}

	public static void printPersons(Map<String, String> map) {
		for (Map.Entry<String, String> entry:map.entrySet()) {
			System.out.println("id="+entry.getKey()+", name="+entry.getValue());
		}
	};


	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer item:set1) {set.add(item);}
		for (Integer item:set2) {set.add(item);}
		return set;	
	}
	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer item1:set1) {
			for (Integer item2:set2) {
				if (item1==item2) {
					set.add(item1);
				}
			}
		}	
		return set;	
	}


	public static void main(String[] args) {

		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);		
		print(union(set1, set2));
		print(intersect(set1, set2));
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Dow", "John");
		map.put("Pupkin", "Sam");
		map.put("Row", "Mary");
		map.put("Cage", "Nick");
		map.put("Cruz", "Jack");
		map.put("Smith", "Jenifer");
		map.put("Eniston", "Maxim");
		map.put("Simpson", "Nick");
		map.put("Norris", "Chak");
		map.put("Lee", "Bruce");
		printPersons(map);
		Set<String> personsSet = new HashSet<String>();
		Collection<String> valuesCol = map.values();
		for (String firstName:valuesCol) {
			personsSet.add(firstName);
		}
		if (personsSet.size()<valuesCol.size()) {
			System.out.println("There are at least two persons with the same firstName");
		}
		else {
			System.out.println("There are no any persons with the same firstName");
		}
		System.out.println("");
		
		String valueToRemove="Nick";
		System.out.println("removing person with firstName ="+valueToRemove);
		Iterator<Entry<String, String>> iter= map.entrySet().iterator();
		while (iter.hasNext()) {
		      Entry<String, String> entry = iter.next();
		      if (valueToRemove == entry.getValue()) {
		    	  iter.remove();	  
		      }
		}
		printPersons(map);
	}
}

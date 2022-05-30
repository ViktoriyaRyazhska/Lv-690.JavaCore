package ls9.Homework_1_2;
/*
 * Write parameterized methods union(Set set1, Set set2) 
 * and intersect(Set set1, Set set2), realizing the operations 
 * of union and intersection of two sets. 
 * Test the operation of these techniques on two pre-filled sets. 
 * 
 * Create map personMap and add to it ten persons 
 * of type <String, String> (lastName, firstName).
 * Output the entities of the map on the screen. 
 * There are at less two persons with the same firstName among these 10 people?
 * Remove from the map person whose firstName is ”Orest” (or other). Print result.  
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Homework {

	public static void main(String[] args) {
		Set<Integer> set1 = setOf(1,2,3,4,5,6,7);
		Set<Integer> set2 = setOf(2,4,6,8,7);		
			
		System.out.println("Intersect: " + getIntersectSet(set1, set2));
		System.out.println("Union: " + getUinonSet(set1, set2));
		
		Map<String, String> personMap = new HashMap<>();
		personMap.put("Petrenko", "Ivan");
		personMap.put("Vasylenko", "Oleksiy");
		personMap.put("Lizunov", "Leonid");
		personMap.put("Venglovskiy", "Oleksandr");
		personMap.put("Olishevskiy", "Anatoliy");
		personMap.put("Yagodinskiy", "Oleksandr");
		personMap.put("Voytenko", "Anatoliy");
		personMap.put("Pereguda", "Mykhailo");
		personMap.put("Onischuk", "Pavlo");
		personMap.put("Kulyk", "Bogdan");
		
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry);		
		}
		System.out.println();
		deletePerson(personMap, "Oleksandr");
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			System.out.println(entry);		
		}
		System.out.println(theSameFirstName(personMap, "Anatoliy"));
	

		
	}
	// union set
	public static Set<Integer> getUinonSet(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> unionSet = new HashSet<>(set1);				
		unionSet.addAll(set2);
		return unionSet;
	}
	
	// intersect set
	public static Set<Integer> getIntersectSet(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> intersectSet = new HashSet<>(set1);
		intersectSet.retainAll(set2);
		return intersectSet;
	}
	
	// create set from arrays
	private static Set<Integer> setOf(Integer...value){
		return new HashSet<Integer>(Arrays.asList(value));
	}
	
	// Delete person with a given firstName
	public static void deletePerson(Map<String, String> map, String name) {
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		if(map.containsValue(name)) {			
			while(iterator.hasNext()) {
				Map.Entry<String, String> mapEntry = iterator.next();
				if(mapEntry.getValue().equals(name)) {
					iterator.remove();
				}
			}
		} else {
			System.out.println("I don't know " + name);
		}
		
	}

	//Searh two persons with the same firstName
	public static boolean theSameFirstName(Map<String, String> map, String name) {
		Iterator<Entry<String, String>> iterator = map.entrySet().iterator();
		int count = 0;
		if (map.containsValue(name)) {
			while(iterator.hasNext()) {
				Map.Entry<String, String> mapEntry = iterator.next();
				if (mapEntry.getValue().equals(name)) {
					count++;
				}				
			}
		}
		if (count >= 2) {
			return true;
		}
		return false;
	}
}

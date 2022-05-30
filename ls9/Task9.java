package ls9;
/*
 * Declare collection myCollection of 10 integers and fill it (from the console or random).
 * Find and save in list newCollection all positions 
 * of element more than 5 in the collection. Print newCollection
 * Remove from collection myCollection elements, which are greater then 20. Print result
 * Insert elements 1, -3, -4 in positions 2, 8, 5. Print result in the format: “position – xxx, value of element – xxx”
Sort and print collection 


 */

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;


public class Task9 {

	public static void main(String[] args) {
		//create a collection of random numbers of size 10
		List<Integer> myCollectoin = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			myCollectoin.add(getRandomNumber());
		}	
		System.out.println(myCollectoin);
		
		List<Integer> newCollection = new ArrayList<>();
		for (int i = 0; i < myCollectoin.size(); i++) {
			if (myCollectoin.get(i) > 5) {
				newCollection.add(myCollectoin.get(i));
			}
		}
		System.out.println("New collection: " + newCollection);
		

		System.out.println();
		//delete the number less then 20
		Iterator<Integer> iterator = myCollectoin.iterator();
		while (iterator.hasNext()) {
			if (iterator.next() <= 20) {
				iterator.remove();
			}
		}	
		System.out.println("myCollection which are greater then 20: " + myCollectoin);
		
		addElement(myCollectoin,2, 1);
		addElement(myCollectoin, 8, -3);
		addElement(myCollectoin, 5, -4);
		
		myCollectoin.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {				
				return o1 - o2;
			}
			
		});
		System.out.println(myCollectoin);
		
		System.out.println();
		
		Map<Integer, String> employeeMap = new HashMap<>();
		employeeMap.put(1, "Andrii");
		employeeMap.put(2, "Oleksandr");
		employeeMap.put(3, "Anna");
		employeeMap.put(4, "Jana");
		employeeMap.put(5, "Margaryta");
		employeeMap.put(6, "Anna");
		employeeMap.put(7, "Andrii");
		System.out.println(employeeMap);
		System.out.println(getName(employeeMap, 5));
		System.out.println(getName(employeeMap, 8));
		
		System.out.println(getKey(employeeMap, "Anna"));
		System.out.println(getKey(employeeMap, "Margaryta"));

		
	}
	//random number generator
	public static int getRandomNumber() {
		Random random = new Random();
		return random.nextInt(40);
	}
	
	//add a number to the collection for a given position
	public static void addElement(List<Integer> list, int position, Integer n) {
		if (list.size() > position) {
			list.set(position, n);		
			System.out.println("Position: " + position + ", value of element: " + n);
		} else {
			System.out.println("Collection is too small");
		}
	}
	
    //get the value on the key
	public static String getName(Map<Integer, String> map, Integer id) {
		if (map.containsKey(id)) {
			return map.get(id).toString();
		}
		return "Wrong input";
	}
	
	//get the key on the value
	public static List<Integer> getKey(Map<Integer, String> map, String name) {
		List<Integer> list = new ArrayList<>();
		if (map.containsValue(name)) {
			for (Map.Entry<Integer, String> entry : map.entrySet()) {
				if (entry.getValue().equals(name)) {
					list.add(entry.getKey());
				}
			}	
		}
		return list;
	}

}

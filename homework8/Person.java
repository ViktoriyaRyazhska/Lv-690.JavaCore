	package homework8;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Person {
	
	public static void main(String[] args) {
		Map<String, String> personMap = new HashMap<>();
		
		int a = 0;
		int b = 10;
		personMap.put("Jonh","Week");
		personMap.put("Vasyl","Ivanov");
		personMap.put("Petro","Mostaichuk");
		personMap.put("Oleg","Aligator");
		personMap.put("Oleksandr","Melnyk");
		personMap.put("Taras","Bulba");
		personMap.put("Anna","Pshek");
		personMap.put("Pavlo","Nevolya");
		personMap.put("Jonh","Cena");
		personMap.put("Petro","Poroshenko");
		
		for (Map.Entry<String, String> element1 : personMap.entrySet()) {
            if (personMap.containsKey(element1.getKey())) {
                a++;
            }
        }
        if (a == b) {
            System.out.println("Not the same names");
        } else {
            System.out.println("Same name");
        }
        personMap.remove("Oleksandr");
        
        for(Map.Entry<String, String> element2 : personMap.entrySet()) {
        	System.out.println(element2.getKey() + " " + element2.getValue());
        }	
	}

}


package hm8;

import java.util.HashMap;
import java.util.Map.Entry;

public class Map {
 public static void main(String[] args) {
	HashMap <String, String> personMap = new HashMap<>();
	personMap.put("Nazar","Bebra");
	personMap.put("Vasyl","Mogila");
	personMap.put("Petro","Shchyr");
	personMap.put("Ivan","Shevchenko");
	personMap.put("Bogdan","Nis");
	
	personMap.put("Ivas","Karas");
	personMap.put("Taras","Gerb");
	personMap.put("Oleg","Kizavka");
	personMap.put("Vasyl","Kryjka");
	personMap.put("Ignat","Meshta");
	
	personMap.remove("Bogdan");
	
	int b = 0;
	int a = 10;
	
	for(Entry<String, String> mapp: personMap.entrySet()) {
		if(personMap.containsKey(mapp.getKey())) {
			b++;
		}
		
	}
	if(a == b) {
		System.out.println("No Identical Names");
	}	else {
		System.out.println("There are identical names");
		
	}
	for(Entry<String, String> mapp: personMap.entrySet()) {
		System.out.println(mapp);
	}
}
}

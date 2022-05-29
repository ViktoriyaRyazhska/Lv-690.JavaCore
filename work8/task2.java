package work8;

import java.util.*;

public class task2 {

	public static void main(String[] args) {
		Map<String,String> personMap = new HashMap<>();
		
		
		 personMap.put("Holden","Eamonn");
		 personMap.put("King","Sam");
		 personMap.put("Ayala","Sam");
		 personMap.put("Jaramillo","Sohail");
		 personMap.put("Faulkner","Maisy");
		 personMap.put("Ramos","Mabel");
		 personMap.put("Holt","Catrin");
		 personMap.put("Caldwell","Arthur");
		 personMap.put("Rivers","Shola");
		 personMap.put("Cuevas","Keane");
		
		 
		 System.out.println(personMap);
		 
		 
		 List<String> buff = new ArrayList<>();
		 Iterator iter = personMap.entrySet().iterator();
		 while (iter.hasNext()) {
			 Map.Entry entry = (Map.Entry)iter.next();
			 buff.add((String) entry.getValue());
		 }
		 String buff2=buff.get(0);
		 for(int i=0;i<personMap.size();i++) {
			 buff2=buff.get(i);
			 for(int a=i+1;a<personMap.size();a++) {
				 if(buff2==buff.get(a)) {
					 System.out.println("You have the same names");
					 break;
				 }
			 }
		 }
		 
		 
		 personMap.values().remove("Arthur");
		 
		 
		 System.out.println(personMap);
	 }

}


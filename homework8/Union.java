package homework8;

import java.util.HashSet;
import java.util.Set;

public class Union {
	
	public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){
		Set<Integer> intersection = new HashSet<>();
			for(Integer element3 : set1) {
				for(Integer element4 : set2) {
					if(element3 == element4) {
						intersection.add(element3);
					}
				}
			}
		return intersection;
	}
	
	public static  Set<Integer>  union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> union = new HashSet<>(); 
		for(Integer element1 : set1) {
				union.add(element1);
		}
		for(Integer element2 : set2) {
			union.add(element2);
		}
		return union;
		
	}
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		set1.add(2);
		set1.add(4);
		set1.add(7);
		
		Set<Integer> set2 = new HashSet<Integer>();
		set2.add(1);
		set2.add(5);
		set2.add(7);
		
		System.out.println(union(set1,set2));
		System.out.println(intersection(set1, set2));
	}
}

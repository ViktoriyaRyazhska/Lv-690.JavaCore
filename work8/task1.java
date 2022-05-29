package work8;

import java.util.*;

public class task1 {

	public static void main(String[] args) {
		Set<Integer> sets1 = new HashSet<>();
		Set<Integer> sets2 = new HashSet<>();
		
		
		for(int i=1; i>-5;i--) {
			sets1.add(i);
		}
		for(int i=-1; i<5;i++) {
			sets2.add(i);
		}
		
		
		System.out.println("filled the sets:");
		System.out.println(sets1);
		System.out.println(sets2);
		
		
		System.out.println();
		System.out.println("the operations of union and intersection:");
		System.out.println(union(sets1, sets2));
		System.out.println(intersect(sets1, sets2));
	}
	
	
	public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> buff = new HashSet<>();
		buff.addAll(set1);
		buff.addAll(set2);
		return buff;
	}
	
	
	public static Set<Integer> intersect(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> buff = new HashSet<>();
		buff.addAll(set1);
		buff.retainAll(set2);
		return buff;
	}
}

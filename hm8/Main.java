package hm8;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
	HashSet<Integer> set1 = new HashSet<>();
	set1.add(1);
	set1.add(9);
	set1.add(3);
	set1.add(4);
	set1.add(5);
	set1.add(6);
	
	HashSet<Integer> set2 = new HashSet<>();
	set2.add(6);
	set2.add(4);
	set2.add(9);
	set2.add(8);

	System.out.println(union(set1, set2));
	System.out.println(intersect(set1,set2));
}
	public static Set<Integer> union(Set<Integer> s1, Set <Integer> s2){
		Set<Integer> set3 = new HashSet<>();
		for(Integer a: s1) {
			set3.add(a);
		}
		for(Integer b: s2) {
			set3.add(b);
		}		
		
		return set3;
	}
	public static Set<Integer> intersect(Set<Integer> set1, Set <Integer> set2){
		Set<Integer> set4 = new HashSet<>();
		for(Integer c: set1) {
			for(Integer d: set2) {
				if(c == d) {
					set4.add(c);
				}
			}
		}
	
		
		return set4;
	}
	
}

package Homework9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {


	public static void insert(List<Integer> list, int position, int value) {
		if (position<list.size()) {
			list.set(position, value);}
		else if (list.size()==position) {
			list.add(value);}
	};

	public static void print(List<Integer> list) {
		for (int k=0; k<list.size(); k++) {
			System.out.println("position ="+k+", value of element ="+list.get(k));
		}
	};
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> newlist = new ArrayList<Integer>();
		list.add(1);
		list.add(7);
		list.add(4);
		list.add(25);
		list.add(9);
		list.add(6);
		list.add(31);
		list.add(2);
		list.add(0);
		list.add(1);
		for (int k:list) {
			if (k>=5) {
				newlist.add(k);
				System.out.println(k);
			}
		}	
		System.out.println("====");
	
		int i=0;		
		while (i<list.size()-1) {
			if (list.get(i)>=20) {list.remove(i);}
			else {i++;}
		};
		for (int k:list) {
			System.out.println(k);
		}

		System.out.println("====");
		insert(list, 2, 1);
		insert(list, 8, -3);
		insert(list, 5, -4);
		print(list);
		;
		System.out.println("====");
		Collections.sort(list, new Comparator());
		print(list);
			
		
	}
}

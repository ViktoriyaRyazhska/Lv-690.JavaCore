package Homework5;

import java.util.Arrays;

public class Cars {
	private Car[] list;
	public Cars(Car[] list) {
		this.list = list;
	}
		
	public void printModelsOfYear(int year) {
		System.out.println("Models Of year "+year+":");
		for (int i=0;i<list.length;i++) {
			if (list[i].getYear() == year) {
				System.out.println(list[i]);
			}
		
		}
		
	}
	
	public void printOrderedByYear() {
		Arrays.sort(list);
		System.out.println("Cars by year:");
		for (int i=0;i<list.length;i++) {
				System.out.println(list[i]);
			}
		
	}


	
}

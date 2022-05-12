package work4;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		int[] num = new int[10];
		int index=0;
		int sum=0;
		int product =1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 10 integer numbers:");
		for(int i = 0; i<num.length; i++) {
			num[i] = Integer.parseInt(sc.nextLine());
		}
		
		for(int i=0; i<5;i++) {
			if(num[i]>0) index++;
		}
		
		if(index==5) {
			for(int i=0; i<5;i++) {
				sum += num[i];
			}
			System.out.println("the sum of the first 5 is "+sum);
		}else {
			for (int i = 5; i < 10; i++) {
				product *= num[i];
			}
		System.out.println("the product of the last 5 is " + product);
	}
	}
}

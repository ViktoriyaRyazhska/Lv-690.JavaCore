package hm4;

import java.util.Scanner;

public class Sumd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in)	;
		int[] a= new int[11];
		for(int b=1; b<=10; b++) {
		System.out.println("Input number ");	
		int c= scan.nextInt();
		a[b]=c;
		}
		System.out.println("Sum "+(a[1]+a[2]+a[3]+a[4]+a[5]));
		System.out.println("Product "+(a[5]*a[6]*a[7]*a[8]*a[9]*a[10]));
	}
	
}

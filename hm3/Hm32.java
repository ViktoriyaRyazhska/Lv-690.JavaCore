package hm3;

import java.util.Scanner;

public class Hm32 {
public static void main(String[] args) {

	Scanner scan=new Scanner(System.in);
	System.out.println("Input number a");
	int a =scan.nextInt();
	System.out.println("Input number b");
	int b =scan.nextInt();
	System.out.println("Input number c");
	int c =scan.nextInt();
	
	if( a>b && a>c){
		System.out.println("Maximum ="+a);
		if(b>c ) {
		System.out.println("Minimum ="+c);
		}else {
		System.out.println("Minimum ="+b);	
		}	
	}
	if( b>a && b>c) {
		System.out.println("Maximum ="+b);
		if(a>c) {
		System.out.println("Minimum ="+c);
		}else {
		System.out.println("Minimum ="+a);
	}
	}
	
	if(c>a & c>b) {
		System.out.println("Maximum ="+c);
		if(b>a) {
		System.out.println("Minimum ="+a); 	
		}else {	
		System.out.println("Minimum ="+b);	
		}
		
	}
	if(a==b && b==c && a==c) { 
		System.out.println("Equal numbers");
	}
}

}

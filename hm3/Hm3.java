package hm3;

import java.util.Scanner;

public class Hm3 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Input a");
		float a =scan.nextFloat();
			System.out.println("Input b");
		float b =scan.nextFloat();
			System.out.println("Input c");
		float c =scan.nextFloat();
		
		if(a>=-5 && a<=5) {
			System.out.println("GOOD a= "+a );	
		}else {
			System.out.println("a NOT IN DIAPASONE");	
		}
		
		if(b>=-5 && b<=5) {
			System.out.println("GOOD b= "+b );	
		}else {
			System.out.println("b NOT IN DIAPASONE");	
		}
		
		if(c>=-5 && c<=5) {
		System.out.println("GOOD c= "+c );	
		}else {
			System.out.println("c NOT IN DIAPASONE");
		}
		
	}
	
}

package lesson1;

import java.util.Scanner;

public class Homework {
	public static void main(String[] args) {		
		//Calculator
		Scanner sc =new Scanner(System.in);	
		System.out.println("Enter figure 'a' = ");
		String as =sc.nextLine();
		System.out.println("Enter figure 'b' = ");
		String bs =sc.nextLine();
		int a= Integer.parseInt(as);
		int b= Integer.parseInt(bs);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		//how are u	
		System.out.println("How are you?");
		String hay =sc.nextLine();
		System.out.println("You are a - "+hay);

	}
}

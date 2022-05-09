package lesson1;

import java.util.Scanner;

public class Homework1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		//flower
		double P=20;
		double S=35;
		System.out.println(P/2*Math.PI);
		System.out.println(Math.sqrt(S)/Math.PI);
		System.out.println();
		
		//what is your name and live
		System.out.println("What is your name?");
		String name=sc.nextLine();
		System.out.println("Where are you live "+name+" ?");
		String live=sc.nextLine();
		System.out.println("Your name is "+name+"and live in "+live);
		System.out.println();
		
		//calls country
		System.out.println("Input frist country - ");
		String c1=sc.nextLine();
		System.out.println("Input second country - ");
		String c2=sc.nextLine();
		System.out.println("Input third country - ");
		String c3=sc.nextLine();
		System.out.println("Input a minute "+c1);
		String t1=sc.nextLine();
		System.out.println("Input a minute "+c1);
		String t2=sc.nextLine();
		System.out.println("Input a minute "+c1);
		String t3=sc.nextLine();
		int tc1=Integer.parseInt(t1);
		int tc2=Integer.parseInt(t2);
		int tc3=Integer.parseInt(t3);
		System.out.println(c1+" used "+tc1+" minuts");
		System.out.println(c2+" used "+tc2+" minuts");
		System.out.println(c3+" used "+tc3+" minuts");
		System.out.println("All country used "+(tc1+tc2+tc3)+" minuts");
	}
}

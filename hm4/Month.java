package hm4;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in)	;
	
		int[] mDays= new int[] { 31,28,31,30,31,30,31,31,30,31,30,31}; //масив
		
		//int[] month= new int[12];
		
		System.out.println("Input the number of the month");
		int a= scan.nextInt();
		while(a>=1 && a<=12){
		a--;
		System.out.println(mDays[a]); 
		//System.out.println(month[a]);
		break;
		}
	}
	
}

package work4;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number of month: ");
		int num = Integer.parseInt(sc.nextLine());
		if(num>12||num<1) {
			System.out.println("there is no such month");
			num = 1;
		}
		
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.println("in "+num+" month "+days[num+1]+" days");
	}

}

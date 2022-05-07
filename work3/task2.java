package work3;

import java.util.Arrays;
import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		int num[] = new int[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers:");
		for(int i = 0; i<3; i++) {
			num[i] = Integer.parseInt(sc.nextLine());
		}
		
		 int min = Arrays.stream(num).min().getAsInt();
	     int max = Arrays.stream(num).max().getAsInt();
	     System.out.println("Min is " + min);
	     System.out.println("Max is " + max);
	}

}

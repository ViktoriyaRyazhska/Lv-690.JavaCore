package hm4;

import java.util.Scanner;

public class ThirdTask {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int a1 = scan.nextInt();
		int a2 = scan.nextInt();
		int a3 = scan.nextInt();
		int a4 = scan.nextInt();
		int a5 = scan.nextInt();
		int[] values = {
				a1, a2, a3, a4, a5
		};
		int count = 0;
		int positive = 0;
		for(int i = 0; i<= values.length - 1; i++) {
			if(values[i]% 2==0) {
				count++;
			}
			if(values[i] >0) {
			positive++;
			if(positive ==2) {
				System.out.println("Position= " +i +" value= "+values[i]);
			}
			}
		}
	}

}

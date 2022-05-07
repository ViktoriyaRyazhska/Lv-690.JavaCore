package work3;

import java.util.Scanner;

public class task1 {
	 
	public static void main(String[] args) {
		float num[] = new float[3];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three numbers:");
		for(int i = 0; i<3; i++) {
			num[i] = Float.parseFloat(sc.nextLine());
			if(num[i]>5 || num[i]<-5) {
				System.out.println("range is [-5,5]!");
				num[i]=0;
			}
		}
		
		System.out.print("your numbers: ");
		for(int i = 0; i<3; i++) {
			System.out.print(num[i]+" ");
		}
	}
}

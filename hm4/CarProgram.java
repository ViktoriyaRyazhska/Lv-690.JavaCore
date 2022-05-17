package hm4;

import java.util.Scanner;

public class CarProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input year for car1");
		Car car1 = new Car(scan.nextInt(), 3.5);
		System.out.println("Input year for car2");
		Car car2 = new Car(scan.nextInt(), 1.4);
		System.out.println("Input year for car3");
		Car car3 = new Car(scan.nextInt(), 1.9);
		System.out.println("Input year for car4");
		Car car4 = new Car(scan.nextInt(),4.4);
		
		int[] arrOfYears = {
				car1.getYear(), car2.getYear(), car3.getYear(), car4.getYear()				
		};
		int value= 0;
		for(int i= 0; i< arrOfYears.length- 1; i++) {
			for(int j= i+ 1; j<= arrOfYears.length- 1; j++) {
				if(arrOfYears[i]> arrOfYears[j] ) {
					value= arrOfYears[i];
					arrOfYears[i]= arrOfYears[j];
					arrOfYears[j]= value;
				}
			}
		}
		for(int year: arrOfYears) {
			System.out.println(year);
		}
		
	}

}

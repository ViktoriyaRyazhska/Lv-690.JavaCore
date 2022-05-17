package hm4;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Jtest {

	@Test
	void test() {
		
		int[] mDays= new int[] { 31,28,31,30,31,30,31,31,30,31,30,31}; //масив
		int t = 2;
		int e = 28;
		int ressult = 0;
		//int[] month= new int[12];
		
		System.out.println("Input the number of the month");
		int a= t;
		while(a>=1 && a<=12){	
		a--;
		System.out.println(mDays[a]); 
		//System.out.println(month[a]);
		ressult = mDays[a];
		break;
		}
		Assert.assertEquals(e, ressult);
	}
	@Test
	void test2() {
		
		
		int[] a = new int[11];
		int[] ressult2 = a;
		
		for(int b=1; b<=10; b++) {
		System.out.println("Input number ");	
		int c = 5;
		
		a[b] = c;
		
		}
		System.out.println("Sum "+(a[1]+a[2]+a[3]+a[4]+a[5]));
		System.out.println("Product "+(a[5]*a[6]*a[7]*a[8]*a[9]*a[10]));
		
		Assert.assertEquals(25, ressult2[1] + ressult2[2] + ressult2[3] + ressult2[4] + ressult2[5]);
		Assert.assertEquals(3125, ressult2[6] * ressult2[7] * ressult2[8] * ressult2[9] * ressult2[10]);
		
	}
	@Test
	void test3() {
		
		
		Car car1 = new Car(1996, 3.5);
		
		Car car2 = new Car(1997, 1.4);

		Car car3 = new Car(1998, 1.9);
	
		Car car4 = new Car(1999,4.4);
		Car c;
		
		Car[] arrOfYears = {
				car1, car2, car3, car4				
		};
		int value= 0;
		for(int i= 0; i< arrOfYears.length- 1; i++) {
			for(int j= i+ 1; j<= arrOfYears.length- 1; j++) {
				if(arrOfYears[i].getYear()> arrOfYears[j].getYear() ) {
					c= arrOfYears[i];
					arrOfYears[i]= arrOfYears[j];
					arrOfYears[j]= c;
				}	
				
	}
		}
		Car[] ressultCar = {
				car1, car2 ,car3 ,car4
		};
		Assert.assertEquals(ressultCar[0].getYear(), arrOfYears[0].getYear());
		Assert.assertEquals(ressultCar[1].getYear(), arrOfYears[1].getYear());
		Assert.assertEquals(ressultCar[2].getYear(), arrOfYears[2].getYear());
		Assert.assertEquals(ressultCar[3].getYear(), arrOfYears[3].getYear());
		
	}
}


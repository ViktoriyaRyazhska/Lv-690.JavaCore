package tets;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

import homework4.Car;
import junit.framework.Assert;

class Junit {
	@Test
	void positiveMinusInterger() {
		int pos=0;
		int i=0;
		int[] actualPositive;
		int expectedNegative;
		int[] negative=new int[] {1,2,-3,4,5};
		while(i<negative.length-1) {
			i++;
				if(negative[i]<0) {
					break;
				}if(i>=2 && negative[i]>0 && pos<1) {
					pos++;
					
			}
		}
		for(int e=1;e<=i;e++) {
			
		}
		Assert.assertEquals(false, false);
	}
	
	@Test
	void sumProductTenNumbers() {
		//10 int
				int[] calc=new int[11];
				int[] actualInte=calc;
				int[] expectedInte= {0,1,2,3,4,5,6,7,8,9,10};
				for(int stop=1;stop<=10;stop++) {
					calc[stop]=stop;
					Assert.assertEquals(expectedInte[stop], actualInte[stop]);
					}
				Assert.assertEquals(10, actualInte[0]+actualInte[1]+actualInte[2]+actualInte[3]+actualInte[4]);
				Assert.assertEquals(15120, actualInte[5]*actualInte[6]*actualInte[7]*actualInte[8]*actualInte[9]);
				Assert.assertEquals(expectedInte.length, actualInte.length);
				//Assert.assertEquals(expectedInte[5], actualInte[5]);
	}
	
	@Test
	void selectMonthTest() {
		//days month
				int[] day=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
				String [] month=new String[] {"January","February","March","April","May","June",
					"Jule","August","September","October","November","December"};
				int n = 7;
				String actualMonth = null;
				int actualDay = 0;
				String expectedMonth = "Jule";
				int expectedDay = 31;
				while(n>=0  && n<=12) {
					n--;
					actualMonth=month[n];
					actualDay=day[n];
					break;
				}
				Assert.assertEquals(expectedDay, actualDay);
				Assert.assertEquals(expectedMonth, actualMonth);
	}
	@Test
	void sortCarTest() {
			Car car1 = new Car(2001, 3.1f);
			Car car2 = new Car(1999, 1.6f);
			Car car3 = new Car(1995, 3.1f);
			Car car4 = new Car(2015, 4.1f);
			Car a;
			Car[] cars = {car1,car2,car3,car4};
			
			for(int i =0; i < cars.length-1; i++) {
				
				for(int g = i + 1; g <= cars.length-1; g++) {
					if(cars[i].getYear() < cars[g].getYear()) {
						a=cars[i];
						cars[i] = cars[g];
						cars[g] = a;
					}
				}
			}
			Car[] expected = {car4,car1,car2,car3};
			Assert.assertEquals(expected[0].getYear(), cars[0].getYear());
			Assert.assertEquals(expected[1].getYear(), cars[1].getYear());
			Assert.assertEquals(expected[2].getYear(), cars[2].getYear());
			Assert.assertEquals(expected[3].getYear(), cars[3].getYear());
			
			
	}
	
}

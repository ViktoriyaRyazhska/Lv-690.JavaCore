package homework4;

import java.util.Scanner;

public class Filter {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter first car year of product");
		Car car1 = new Car(sc.nextInt(), 3.1f);
		System.out.println("Enter second car year of product");
		Car car2 = new Car(sc.nextInt(), 1.6f);
		System.out.println("Enter third car year of product");
		Car car3 = new Car(sc.nextInt(), 3.1f);
		System.out.println("Enter forth car year of product");
		Car car4 = new Car(sc.nextInt(), 4.1f);
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
		
		for(Car element:cars) {
			System.out.println(element.toString());
		}
	}
}


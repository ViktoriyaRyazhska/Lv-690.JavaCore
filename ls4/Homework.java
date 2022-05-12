package ls4;

/*
 * 1.Solve the next tasks:
 *  - read 3 float numbers and check: are they all belong to the range [-5,5];
 *  - read 3 integer numbers and write max and min of them;
 *  - read number of HTTP Error (400, 401,402, ...) and write the name of this error (Declare enum HTTPError)
 * 2.Сreate class Dog with fields name, breed, age. 
 *  - Declare enum for field breed. 
 *  - Create 3 instances of type Dog. 
 *  - Check if there is no two dogs with the same name. 
 *  - Display the name and the kind of the oldest dog. 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Homework {
	private static HTTPError nunError;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Dog dog1 = new Dog("Sharik", BreedOfDogs.POODLE, 2);
		Dog dog2 = new Dog("Tuzik", BreedOfDogs.DACHSHUND, 5);
		Dog dog3 = new Dog("Bobik", BreedOfDogs.LABRADOR_RETRIVER, 7);
		Dog dog4 = new Dog("Sharik", BreedOfDogs.SPANIEL, 10);
		
		
		
		System.out.println(dog1.checkWithTheSameName(dog3));
		System.out.println(dog1.checkWithTheSameName(dog4));
		Dog.oldestDog();
		checkNumberOfRange(br);
		nameHTTPError(405);
		System.out.println(Arrays.toString(minMaxInteger(br)));
		
		
	}
	public static void checkNumberOfRange(BufferedReader br) throws NumberFormatException, IOException  {
		System.out.print("Enter your float number: ");
		float number = Float.parseFloat(br.readLine());
		if (number <= 5 && number >= -5) {
			System.out.println("The number " + number + " enters the interval [-5, 5]");
		} else {
			System.out.println("The number " + number + " goes beyond the interval [-5, 5]");
		}
	}
	
	public static int[] minMaxInteger(BufferedReader br) throws NumberFormatException, IOException {
		ArrayList<Integer> numbers = new ArrayList<>();
		System.out.print("Enter your number or comand to find - 'go': ");
		String comand = br.readLine();
		while (comand.equals("go") != true) {			
			numbers.add(Integer.parseInt(comand));
			System.out.print("Enter your number or comand to find - 'go': ");
			comand = br.readLine();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.println("Finding the min and max numbers");
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) > max) {
				max = numbers.get(i);
			}
			if (numbers.get(i) < min) {
				min = numbers.get(i);
			}
		}
		return new int[] {min, max};
	}
	
	
	
	public static void nameHTTPError(int number) {
		
		nunError = null;
		switch (number) {
		case 400:
			nunError = HTTPError.BAD_REGUEST;
			break;
		case 401:
			nunError = HTTPError.UNAUTHORIZED;
			break;
		case 402:
			nunError = HTTPError.PAYMENT_REQUIRED;
			break;
		case 403:
			nunError = HTTPError.FORBIDDEN;
			break;
		case 404:
			nunError = HTTPError.NOT_ROUND;
			break;
		case 405:
			nunError = HTTPError.METHOD_NOT_ALLOWED;
		    break;
		case 406:
			nunError = HTTPError.NOT_ACCEPTABLE;
			break;		
		default:
			System.out.println("Wrong number of error");
			break;
		}
		System.out.println(nunError);
	}
}

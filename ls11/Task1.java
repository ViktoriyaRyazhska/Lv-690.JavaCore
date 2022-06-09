package ls11;

/*
 * Create a method for calculating the area of a rectangle 
 * 		int squareRectangle (int a, int b), 
 * which should throw an exception if the user enters negative value. 
 * Input values a and b from console. Check the squareRectangle method in the method main. 
 * Check to input nonnumeric value.
 * 
 * Create a class Plant, which includes fields int size, Color color and Type type, 
 * and constructor where these fields are initialized. Color and type are Enum. 
 * Override the method toString( ). Create classes ColorException and TypeException 
 * and describe there all possible colors and types of plants. 
 * In the method main create an array of five plants. Check to work your exceptions.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Task1 {

	public static void main(String[] args) throws ColorException, TypeException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		try {
			int a = Integer.parseInt(bf.readLine());
			int b = Integer.parseInt(bf.readLine());
			squareRectangl(a, b);
		} catch (IOException | NumberFormatException | NegativeNumberException e) {
			System.err.println(e.getMessage());
		}
		List<Plant> plants = new ArrayList<>();
		
		
		try {
			plants.add(new Plant("rose", "blue", 15));
			plants.add(new Plant("daisies", "red", 10));
			plants.add(new Plant("lilyl", "white", 20));
			plants.add(new Plant("daisies", "bluef", 5));
			plants.add(new Plant("roses", "bluee", 15));
			plants.forEach(System.out::println);
		} catch (ColorException | TypeException e) {			
			System.err.println(e.getMessage());	
			e.printStackTrace();
			}
		} 

	
	public static int squareRectangl(int a, int b) throws NegativeNumberException{
		if (a < 0 || b < 0) {
			throw new NegativeNumberException ("Negative Number Exception!");
		}
		return a * b;
	}

}
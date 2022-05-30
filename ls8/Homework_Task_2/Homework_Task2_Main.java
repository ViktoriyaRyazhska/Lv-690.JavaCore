package ls8.Homework_Task_2;

/*
 * Create Wrapper<T>  class with private field of T type which is called value.
 * In Wrapper class create public constructor and setValue 
 * and getValue methods for value field.
 * Create three objects of the Wrapper type: first object should be wrapper 
 * for int type, second – for String, third - for boolean.
 * Print all three values in the console using method getValue from Wrapper class.
 */

public class Homework_Task2_Main {

	public static void main(String[] args) {
		Wrapper<Integer> iWrapper = new Wrapper<Integer>(10);
		Wrapper<String> sWrapper = new Wrapper<String>("Hello");
		Wrapper<Boolean> bWrapper = new Wrapper<Boolean>(true);
		
		System.out.println(iWrapper.getValue());
		System.out.println(sWrapper.getValue());
		System.out.println(bWrapper.getValue());

	}

}

//Create an array of ten integers. Display 
//the biggest of these numbers;
//the sum of positive numbers in the array;
//the amount of negative numbers in the array.
//       What values there are more: negative or positive?


package HW4Practical;

public class ArrayPractice {

	public static void main(String[] args) {
		int[] arr = { 35, 28, 31, 29, 31, 30, -31, 15, 30, 18 };

		int max = arr[0];
		int imax = 0;
		int i = 0;
		while (i < arr.length) {
			if (arr[i] > max) {
				max = arr[i];
				imax = i;
			}
			i++;
		}
		System.out.print("Maximum number is " + max);
		System.out.println(" is in " + (imax + 1) + " place");

		int min = arr[0];
		int imin = 0;
		int y = 0;

		while (y < arr.length) {
			if (arr[y] < min) {
				min = arr[y];
				imin = y;
			}
			y++;
		}
		System.out.print("Minimum number is " + min); // min of numbers
		System.out.println(" is in " + (imin - 1) + " place");

		int sum = 0;
		for (int b = 0; b < arr.length; b++) {
			sum += arr[b];

		}
		System.out.println("Sum of all numbers = " + sum); // total sum

		int amount = 0;
		for (int a = 0; a < arr.length; a++) {
			if (a / 2 != 0) {
				amount++;
			}
		}
		System.out.println("Amount of odd mumbers = " + amount); // amount of odd numbers

		int amountNeg = 0 ;
		for (int c = 0; c > arr.length; c++) {
			if (c < 0) {
				amountNeg++;
			}
		}

		System.out.println("Amount of negative = " + amountNeg); // amount of negative numbers

	}
}
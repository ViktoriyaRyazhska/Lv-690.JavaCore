package HW4;

import java.util.Scanner;

public class threeNumbers {

	private static final String Int = null;

	public static void main(String[] args) {
		int num[] = new int[3];

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		for (int i = 0; i <= 3; i++) {
			num[i] = Integer.parseInt(sc.nextLine());
			if (num[i] < 5 && num[i] > -5) {
				System.out.println("your number is in range [-5,5]!");
			} else {
				System.out.println("your number NOT in range [-5,5]!");
			}
		}
	}
}

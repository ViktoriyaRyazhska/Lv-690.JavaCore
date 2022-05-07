package work3;

import java.util.Scanner;

public class task3 {
	 enum HTTPError {
		 BAD_REQUEST,
		 UNAUTHORIZED,
		 PAYMENT_REQUIRED;
		 }
		 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("code of error: ");
		int errornum = Integer.parseInt(sc.nextLine());
		
		switch(errornum) {
		case (400):
			System.out.print(errornum+" is "+HTTPError.BAD_REQUEST);
		break;
		case(401):
			System.out.print(errornum+" is "+HTTPError.UNAUTHORIZED);
		break;
		case (402):
			System.out.print(errornum+" is "+HTTPError.PAYMENT_REQUIRED);
		break;
		default:
			System.out.print("not initialized error");
		}
	}

}

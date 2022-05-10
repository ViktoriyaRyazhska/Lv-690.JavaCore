
import java.util.Scanner;

public class HawAreYou {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How are you?");
		String status = sc.nextLine();
		System.out.println("You are " + status + "!");

	}

}

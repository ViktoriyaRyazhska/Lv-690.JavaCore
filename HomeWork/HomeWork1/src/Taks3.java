import java.util.Scanner;

public class Taks3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double c1, c2, c3;
		int t1, t2, t3;
		System.out.println("Enter unit per minute for country1");
		c1 = sc.nextDouble();
		System.out.println("Enter unit per minute for country2");
		c2 = sc.nextDouble();
		System.out.println("Enter unit per minute for country3");
		c3= sc.nextDouble();
		System.out.println("Enter talks duration for country1");
		t1= sc.nextInt();
		System.out.println("Enter talks duration for country2");
		t2= sc.nextInt();
		System.out.println("Enter talks duration for country3");
		t3= sc.nextInt();
		System.out.println(c1*t1);
		System.out.println(c2*t2);
		System.out.println(c1*t1);
		System.out.println(c1*t1+c2*t2+c3*t3);
		
		
		
		
	}

}

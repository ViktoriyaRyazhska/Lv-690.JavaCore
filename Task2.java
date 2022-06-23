package PracticalPart;
import java.util.Scanner;

//2.	Input number and decompose this number into a product of prime numbers with their degrees (e.g. number: 84, result 2^2, 3, 7)


	public class Task2 {
		   public static void main(String args[]){
		      int primeNumber;
		      Scanner sc = new Scanner(System.in);
		      System.out.println("Enter a number to decompose:");
		      primeNumber = sc.nextInt();
		     
		      for(int i = 2; i< primeNumber; i++) {
		         while(primeNumber%i == 0) {
		            System.out.println(i);
		            primeNumber = primeNumber/i;
		         }
		      }
		      if(primeNumber >2) {
		         System.out.println(primeNumber);
		      }
		   }
	}

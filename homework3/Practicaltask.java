package homework3;

import java.util.Scanner;

public class Practicaltask {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//odd
		System.out.println("Enter first number");
		int odd1= sc.nextInt();
		System.out.println("Enter second number");
		int odd2= sc.nextInt();
		System.out.println("Enter third number");
		int odd3= sc.nextInt();
		
		if ( odd1%2==0) {
			System.out.println("Number "+odd1+ "its is an odd");
				}else if(odd2%2==0) {
					System.out.println("Number "+odd2+ "its is an odd");
						}else if(odd3%2==0) {
							System.out.println("Number "+odd3+ "its is an odd");
		}
		
		//day week
		System.out.println("Enter the day number of the week");
		int local= sc.nextInt();
		switch(local) {
			case 1 :
				System.out.println(English.Monday);
				System.out.println(Ukrainian.Ponedilok);
				break;
			case 2:
				System.out.println(English.Tuesday);
				System.out.println(Ukrainian.Vivtorok);
				break;
			case 3:
				System.out.println(English.Wednesday);
				System.out.println(Ukrainian.Sereda);
				break;
			case 4:
				System.out.println(English.Thursday);
				System.out.println(Ukrainian.Chetver);
				break;
			case 5:
				System.out.println(English.Friday);
				System.out.println(Ukrainian.Pyatnytsya);
				break;
			case 6:
				System.out.println(English.Saturday);
				System.out.println(Ukrainian.Subota);
				break;
			case 7:
				System.out.println(English.Sunday);
				System.out.println(Ukrainian.Nedilya);
				break;
		}
	
		//continent
		System.out.println("Enter country");
		String contr=sc.nextLine();
		//switch(contr) {
			//case "Nigeria":
				//System.out.println(Continent.Africa);
			//case "Ethiopia":
				//System.out.println(Continent.Africa);
			//case "Egypt":
				//System.out.println(Continent.Africa);
			//case "DRCongo":
				//System.out.println(Continent.Africa);
			//case "Tanzani":
				//System.out.println(Continent.Africa);
		//}
	}
}

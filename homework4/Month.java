package homework4;

import java.util.Scanner;

public class Month {
	public static void main(String[] args) {
		//days month
		int[] day=new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
		String [] month=new String[] {"January","February","March","April","May","June",
			"Jule","August","September","October","November","December"};
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number month");
		int n=sc.nextInt();
		
		while(n>=0  && n<=12) {
			n--;
			System.out.println(month[n]);
			System.out.println(day[n]);
			break;
		}
		
		//10 int
		int[] calc=new int[11];
		
		for(int stop=1;stop<calc.length-1;stop++) {
			System.out.println("Enter "+stop+" number");
			int inte=sc.nextInt();
			calc[stop]=inte;
			
			}
		System.out.println(calc[1]+calc[2]+calc[3]+calc[4]+calc[5]);
		System.out.println(calc[6]*calc[7]*calc[8]*calc[9]*calc[10]);
	
		//5 int
		int pos=0;
		int i=0;
		int[] negative=new int[6];
		while(i<negative.length-1) {
			i++;
			System.out.println("Enter "+i+" number");
			int inte=sc.nextInt();
			negative[i]=inte;
				if(inte<0) {
					break;
				}if(i>=2 && inte>0 && pos<1) {
					pos++;
					System.out.println("Second posivite number "+negative[i]);
			}
		}
		for(int e=1;e<=i;e++) {
			System.out.println(e+" number= "+negative[e]);
		}
	}
			
}	

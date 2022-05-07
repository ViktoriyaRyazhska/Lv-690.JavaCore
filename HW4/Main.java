package Homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
	public static void main(String[] args) {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	int task = Integer.parseInt(Read("Task № (1,2,3,4,5,6): ", br));
	if (task == 1) {
		int x1 = Integer.parseInt(Read("x1 =", br));
		int x2 = Integer.parseInt(Read("x2 =", br));
		int x3 = Integer.parseInt(Read("x3 =", br));
		int qty = 0;
		qty = odd(x1) + odd(x2) + odd(x3);
		System.out.println("odd numbers ="+qty);
		}
	
	if (task == 2) {
		int day = Integer.parseInt(Read("Enter the number of the day of the week", br));
		DayOfWeek day1 = new DayOfWeek(1, "Monday", "Ponedilok");
		DayOfWeek day2 = new DayOfWeek(1, "Tuesday", "Vivtorok");
		DayOfWeek day3 = new DayOfWeek(1, "Wedneday", "Sereda");
		DayOfWeek day4 = new DayOfWeek(1, "Thursday", "Chetver");
		DayOfWeek day5 = new DayOfWeek(1, "Friday", "Pyatnytsya");
		DayOfWeek day6 = new DayOfWeek(1, "Saturday", "Subota");
		DayOfWeek day7 = new DayOfWeek(1, "Sunday", "Nedilya");
		switch (day) {
			case 1:
				System.out.println(day1); break;
			case 2:
				System.out.println(day2); break;
			case 3:
				System.out.println(day3); break;
			case 4:
				System.out.println(day4); break;
			case 5:
				System.out.println(day5); break;
			case 6:
				System.out.println(day6); break;
			case 7:
				System.out.println(day7); break;
			default:
				System.out.println("Wrong day number !");
		}
	}
	if (task == 3) {
		Country[] Countries  = new Country[] {
				new Country("Egypt", Cont.Africa),
				new Country("Ukraine", Cont.Europe),
				new Country("Australia", Cont.Australia),
				new Country("USA", Cont.America),
				new Country("China", Cont.Asia)
		};
		String InputCountry = Read("Enter country:", br);		
		for (int i = 0; i < Countries.length; i++) {
			if (InputCountry.equalsIgnoreCase(Countries[i].getname())) {
				System.out.println("Continent is "+Countries[i].getcont());
				break;
			}
			else
			{if (i==Countries.length-1) {System.out.println("Unknown country");}
				}
		}
			
		}
	
	if (task == 4) {
		Product[] Prodlist  = new Product[] {
				new Product("milk", 35.00, 5),
				new Product("bread", 15.00, 20),
				new Product("salt", 8.50, 50),
				new Product("meat", 120.00, 2),
		};
		Products products = new Products(Prodlist);
		products.PrintMostExpensive();
		products.PrintBiggestQty();
	}
	
	if (task == 5) {
		float f1 = 7.25f;
		float f2 = 0.2f;
		float f3 = -5.0f;
		boolean allbelong=true;
		if (inRange(f1) && inRange(f2) && inRange(f3))
			{System.out.println("all belong the range -5..5");}
		else 
			{System.out.println("not all belong the range -5..5");};
		//	
		int i1 = 5;
		int i2 = 2;
		int i3 = 7;
		if (i1>=i2 & i1>=i3)
			{System.out.println("max number is "+i1);}
		else 
			{if (i2>=i3) 
				{System.out.println("max number is "+i2);}
			else 
			{System.out.println("max number is "+i3);}
			};		
			//		 
	    	for (HTTP codes : HTTP.values()) {
	    		System.out.println(codes.code + ", " + codes.title);
		}
   	}
   	if (task == 6) {
   		Dog dog1 = new Dog(Breeds.Poodle, "Sharik", 4);
   		Dog dog2 = new Dog(Breeds.Maltese, "Bobik", 8);
   		Dog dog3 = new Dog(Breeds.Spaniel, "Rex", 6);
   		if (dog1.getName()==dog2.getName() || dog1.getName()==dog3.getName() || dog2.getName()==dog3.getName()) {
   			System.out.println("there is two dogs with the same name");
   		}
   		else
   		{
   			System.out.println("there is no two dogs with the same name");
   		};
   		if (dog1.getAge()>=dog2.getAge() && dog1.getAge()>=dog3.getAge()) {
   			System.out.println("Oldest dog is "+dog1);
   		}
   		else
   			if (dog2.getAge()>=dog3.getAge()){
   				System.out.println("Oldest dog is "+dog2);
   			}
   			else
   			{System.out.println("Oldest dog is "+dog3);
   			}
    		
    	}		
}

public enum Cont{Europe, Asia, Africa, America, Australia};

public enum Breeds{Poodle, Maltese, Spaniel};

public enum HTTP {
    e401("401", "Unauthorized"), e402("402", "Payment Required"), e403("403", "Forbidden");
 
    String code;
    String title;
 
    HTTP(String code, String title) {
        this.code = code;
        this.title = title;
        
        }
}
	

public static int odd(int x) {
	if (x % 2 == 0) {return 1;}
	else {return 0;}
}

public static boolean inRange(float x) {
	return (x>=-5 && x<=5);
}


public static String Read(String q, BufferedReader br) {
	System.out.println(q);
	try {
		return br.readLine();
	} catch (IOException e) {
		e.printStackTrace();
		return "";
	}
}
}
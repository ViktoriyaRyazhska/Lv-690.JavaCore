import java.util.Scanner;

public class Minute {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("Введіть назву першої країни");
	String c1= scan.nextLine();
	System.out.println("Введіть назву другої країни");
	String c2= scan.nextLine();
	System.out.println("Введіть назву третьої країни");
	String c3= scan.nextLine();
	
	System.out.println("Скільки хвилин витратила перша країна "+c1);
	String t1= scan.nextLine();
	System.out.println("Скільки хвилин витратила друга країна "+c2);
	String t2= scan.nextLine();
	System.out.println("Скільки хвилин витратила третя країна "+c3);
	String t3= scan.nextLine();
	
	int tt1= Integer.parseInt(t1);
	int tt2= Integer.parseInt(t2);
	int tt3= Integer.parseInt(t3);
	
	System.out.println("Країна " +c1+" використала "+t1);
	
	System.out.println("Країна " +c2+" використала "+t2);
	
	System.out.println("Країна " +c3+" використала "+t3);
	
	System.out.println("Всі країни використали разом "+(tt1+tt2+tt3));
	
	
}
}

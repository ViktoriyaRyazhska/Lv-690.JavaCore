import java.util.Scanner;

public class Minute {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);
	System.out.println("������ ����� ����� �����");
	String c1= scan.nextLine();
	System.out.println("������ ����� ����� �����");
	String c2= scan.nextLine();
	System.out.println("������ ����� ������ �����");
	String c3= scan.nextLine();
	
	System.out.println("������ ������ ��������� ����� ����� "+c1);
	String t1= scan.nextLine();
	System.out.println("������ ������ ��������� ����� ����� "+c2);
	String t2= scan.nextLine();
	System.out.println("������ ������ ��������� ����� ����� "+c3);
	String t3= scan.nextLine();
	
	int tt1= Integer.parseInt(t1);
	int tt2= Integer.parseInt(t2);
	int tt3= Integer.parseInt(t3);
	
	System.out.println("����� " +c1+" ����������� "+t1);
	
	System.out.println("����� " +c2+" ����������� "+t2);
	
	System.out.println("����� " +c3+" ����������� "+t3);
	
	System.out.println("�� ����� ����������� ����� "+(tt1+tt2+tt3));
	
	
}
}

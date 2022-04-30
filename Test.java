import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	
	Scanner scan =new Scanner(System.in);

	
System.out.println("¬вед≥ть число a");
String one= scan.nextLine();
System.out.println("¬вед≥ть число b");
String two= scan.nextLine();

int a= Integer.parseInt(one);
int b= Integer.parseInt(two);

System.out.println(a+b);
System.out.println(a-b);
System.out.println(a*b);
System.out.println(a/b);

System.out.println("How are you? ");
String three= scan.nextLine();
System.out.println("You are "+three);

}
}

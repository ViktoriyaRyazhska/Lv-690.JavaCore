import java.util.Scanner;

public class NameAddress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is you name?");
        String name = sc.nextLine();
        System.out.println("Where are you live, " + name + "?");
        String address = sc.nextLine();
        System.out.println(name + ", you address is " + address);
    }
}

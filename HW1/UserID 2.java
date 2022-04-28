import java.util.Scanner;

public class UserID {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("What is yor name ?");
        String name = scan.next();
        System.out.println("Where do you live ?");
        String address = scan.next();
        System.out.println("What is your age ?");
        int age = Integer.parseInt(scan.next());
        System.out.println("Your name is " + name + " you live on " + address + " and your age " + age);
    }
}

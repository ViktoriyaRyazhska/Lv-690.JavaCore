import java.util.Scanner;

public class HowAreYou {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How are you?");
        String answ = sc.nextLine();
        System.out.println("You are " + answ);

    }
}

//Enter the number of the day of the week. Display the name in three languages.name

package HW4Practical;
import java.util.Scanner;
public class DayofweekPractical {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number the day of week: from 1 to 7");
        int numOfDayOfWeek = sc.nextInt();
        System.out.println("You enter - " + numOfDayOfWeek);

        switch (numOfDayOfWeek) {
            case 1:
                System.out.println("This is Monday - Понеділок- Poniedialek.");
                break;
            case 2:
                System.out.println("This is Tuesday - Вівторок - Wtorek.");
                break;
            case 3:
                System.out.println("This is Wednesday (Середа).");
                break;
            case 4:
                System.out.println("This is Thursday (Четвер).");
                break;
            case 5:
                System.out.println("This is Friday (П'ятниця).");
                break;
            case 6:
                System.out.println("This is Saturday (Субота).");
                break;
            case 7:
                System.out.println("This is Sunday (Неділя).");
                break;
            default:
                System.out.println("You enter wrong number day of week");
        }
    }
}
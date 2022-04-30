import java.util.Scanner;

public class string14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите строку :");
        String str = sc.nextLine();

        //int count = 0;
        //for (int i = 0; i <= str.length(); i++)
         //   if (Character.isUpperCase(str.charAt(i))){
            //    count++;

                long count = str.codePoints().filter(Character::isUpperCase)
                       .count();
                System.out.println(count);}

    }





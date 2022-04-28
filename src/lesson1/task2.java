package lesson1;

import java.util.Scanner;

/* Define String variables name and address. Output question "What is your name?"
 Read the value name and output next question: “Where are you live, (name)?".
 Read address and write whole information.*/

public class task2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is your name?");
        String name= console.nextLine();
        System.out.println("Where are you live, " + name+"?");
        String address= console.nextLine();
        System.out.println("Your name is " + name + ".");
        System.out.println("You live in " + address + ".");
    }
}

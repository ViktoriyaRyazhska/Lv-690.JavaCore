package Homework.lesson1;

import java.util.Scanner;

public class l1t2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = sc.nextLine();
        System.out.println("Nice to meet you, " + name + ".");
        System.out.println("Where are you from?");
        String address = sc.nextLine();
        System.out.println("So you are " + name +" from " + address + ", am i right?");

    }
}

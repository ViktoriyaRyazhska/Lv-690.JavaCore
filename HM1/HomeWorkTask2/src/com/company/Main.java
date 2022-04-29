package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = value.nextLine();
        System.out.println("Hello "+name);
        System.out.println("Where do you live?");
        String adress = value.nextLine();
        System.out.println(adress);
    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter country: ");
        String s = sc.nextLine();

        switch (s){
            case "Poland" : case "France" : case "Germany" :
                System.out.println(materuk.Europe);
                break;
            case "China" : case "Kazakhstan" : case "India" :
                System.out.println(materuk.Asia);
                break;
            case "Kenya" : case "Lesotto" : case "Egypt" :
                System.out.println(materuk.Afrika);
                break;
            case "Australia" :
                System.out.println(materuk.Australia);
                break;
            case "Antarctica" :
                System.out.println(materuk.Antarctica);
                break;
            case "Canada" : case "USA" : case "Belize" :
                System.out.println(materuk.North_America);
                break;
            case "Argentina" : case "Brazil" : case "Guyana" :
                System.out.println(materuk.South_America);
                break;
            default:
                System.out.println("Eror");

        }
    }
}

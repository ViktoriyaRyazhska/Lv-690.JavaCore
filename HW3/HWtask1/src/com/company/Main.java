package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first float number: ");
        float a = sc.nextFloat();
        System.out.println("Enter second float number: ");
        float b = sc.nextFloat();
        System.out.println("Enter third float number: ");
        float c = sc.nextFloat();
        if ((((a >= -5)&&(a <= 5)) && ((b >= -5)&&(b <= 5))) && ((c >= -5)&&(c <= 5))){
            System.out.println("all float numbers belong to the range [-5,5]");}
        else {
            System.out.println("that`s false");
        }

        /////////////////////////////

        int max;
        int min;
        System.out.println("Enter first integer number: ");
        int d = sc.nextInt();
        System.out.println("Enter second integer number: ");
        int e = sc.nextInt();
        System.out.println("Enter third integer number: ");
        int f = sc.nextInt();

        max = d;
        min = d;

        if(e > max){
            max = e;
        }
        if (f > max){
            max = f;
        }

        if (e < min){
            min = e;
        }
        if (f < min){
            min = f;
        }
        System.out.println("max number = " + max);
        System.out.println("min number = " + min);

        /////////////////////

        int errorNumber;
        System.out.println("Enter HTTP ERROR number: ");
        errorNumber = sc.nextInt();
        switch (errorNumber){
            case 400 :
                System.out.println("HTTP ERROR is: " + HttpEror.BadRequest);
                break;
            case 401 :
                System.out.println("HTTP ERROR is: " + HttpEror.Unauthorized);
                break;
            case 402 :
                System.out.println("HTTP ERROR is: " + HttpEror.PaymentRequired);
                break;
            case 403 :
                System.out.println("HTTP ERROR is: " + HttpEror.Forbidden);
                break;
            case 404 :
                System.out.println("HTTP ERROR is: " + HttpEror.NotFound);
                break;
            case 405 :
                System.out.println("HTTP ERROR is: " + HttpEror.MethodNotAllowed);
                break;
            default:
                System.out.println("Mistake((");
        }

    }
}

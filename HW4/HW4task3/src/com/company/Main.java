package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	int[] mas = new int[5];
    int k1 = 0;
    int k = 0;
    int min = mas[0];
    int dob = 1;


    System.out.println("Enter 5 random integer number: ");

        for (int i = 0; i < 5; i++) {
            mas[i] = sc.nextInt();
            if (mas[i] < 0){
                    break;
            }
        }


        for (int i = 0; i < mas.length; i++){
            if (mas[i] > 0){
                k1++;
                if (k1 == 2){
                    System.out.println("position of second positive number: " + i);
                }
            }
        }

        for (int i = 0; i < mas.length; i++){
            if(mas[i] < min){
                min = mas[i];
                System.out.println("position of minimum number is: " + i);
            }
            if((mas[i]%2 == 0) && (mas[i] != 0)){
                dob *= mas[i];
            }
        }
        System.out.println("product of all entered even numbers: " + dob);



        }
    }


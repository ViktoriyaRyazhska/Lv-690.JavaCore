package com.company;

import java.util.Scanner;

public class Calculate {
    public int[] PopulateArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10 random integer number: ");
        int[] mas = new int[10];
        for (int i = 0; i < 10; i++) {
            mas[i] = sc.nextInt();
        }
        return mas;
    }

    public void getValue(int[]mas){
        int sum = 0;
        int dob = 1;
        int k = 0;

        for (int i = 0; i < 5; i++){
            if(mas[i] > 0){
                sum += mas[i];
                k++;
                if (k == 5) {
                    System.out.println("sum of first 5 elements:  " + sum);
                }
            }
            else{
                for (int j = 5; j < 10; j++){
                    dob *= mas[j];
                }
                System.out.println("product of last 5 element = " + dob);
            }
        }
    }
}
